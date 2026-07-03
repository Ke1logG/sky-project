package com.sky.controller.admin;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.UUID;
import com.sky.constant.MessageConstant;

import org.springframework.beans.factory.annotation.Autowired;
import com.sky.utils.AliOssUtil;
import org.springframework.web.multipart.MultipartFile;
import com.sky.result.Result;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/admin/common")
@Api(tags = "公共接口")
public class CommonController {
    @Autowired
    private AliOssUtil aliOssUtil;

    @RequestMapping("/upload")
    @ApiOperation(value = "上传文件")
    public Result<String> uploadFile(MultipartFile file) {
        try {
    //原始文件名
    String originalFilename = file.getOriginalFilename();
    //截取原始文件名的后缀  dfdfdf.png
    String extension = originalFilename.substring(originalFilename.lastIndexOf("."));
    //构造新文件名称
    String objectName = UUID.randomUUID().toString() + extension;

    //文件的请求路径
    String filePath = aliOssUtil.upload(file.getBytes(), objectName);
    return Result.success(filePath);
} catch (IOException e) {}
        return Result.error(MessageConstant.UPLOAD_FAILED);
    }
    
}
