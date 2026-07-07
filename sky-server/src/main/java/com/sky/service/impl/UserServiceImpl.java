package com.sky.service.impl;

import com.sky.service.UserService;
import com.sky.utils.HttpClientUtil;
import com.alibaba.fastjson.JSONObject;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.sky.constant.MessageConstant;
import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;
import com.sky.exception.LoginFailedException;
import com.sky.properties.WeChatProperties;
import com.sky.mapper.UserMapper;


import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private WeChatProperties wechatProperties;
    @Autowired
    private UserMapper userMapper;

    //微信服务接口地址
    public static final String WX_LOGIN = "https://api.weixin.qq.com/sns/jscode2session";

    @Override
    public User wxLogin(UserLoginDTO userLoginDTO) {
        //调用微信接口服务，获得当前微信用户的openid
        Map<String, String> map = new HashMap<>();
        map.put("appid",wechatProperties.getAppid());
        map.put("secret",wechatProperties.getSecret());
        map.put("js_code",userLoginDTO.getCode());
        map.put("grant_type","authorization_code");
        String json = HttpClientUtil.doGet(WX_LOGIN, map);

        log.info("微信请求参数: appid={}, code={}", wechatProperties.getAppid(), userLoginDTO.getCode());
        log.info("微信返回结果: {}", json);

        JSONObject jsonObject = JSON.parseObject(json);
        String openid = jsonObject.getString("openid");

        //判断openid是否为空
        if(openid == null){
            log.error("openid为空，微信错误信息: {}", jsonObject.getString("errmsg"));
            throw new LoginFailedException(MessageConstant.LOGIN_FAILED);
        }

        //判断当前用户是否为新用户
        User user = userMapper.getByOpenid(openid);

        //如果是新用户，完成注册
        if(user == null){
            user = User.builder()
                    .openid(openid)
                    .createTime(LocalDateTime.now())
                    .build();
            userMapper.insert(user);
        }

        
        return user;
    }

}
