package com.example.facialrecognitionbackend.controller;

import org.springframework.web.bind.annotation.*;
import com.baidubce.http.ApiExplorerClient;
import com.baidubce.http.HttpMethodName;
import com.baidubce.model.ApiExplorerRequest;
import com.baidubce.model.ApiExplorerResponse;

import java.util.LinkedList;

/**
 * @author Z09418208_蒋伟伟
 * @Description
 * @create 2022-04-18 12:10
 */
@RestController
public class faceController {
    @PostMapping("/compareFace")
    public Object compareFace() {
        String path = "https://aip.baidubce.com/rest/2.0/face/v3/match";
        ApiExplorerRequest request = new ApiExplorerRequest(HttpMethodName.POST, path);


        // 设置header参数
        request.addHeaderParameter("Content-Type", "application/json;charset=UTF-8");

        // 设置query参数
        request.addQueryParameter("access_token", "24.871f20f5833bb5e9d0233a6cd38680f7.2592000.1652849765.282335-25993554");

        // vue2 调用摄像头
        // http:local:8080/img1.jpg
        // 查到该用户的头像， http:local:8080/avatar.jpg

        // 设置jsonBody参数
        String jsonBody = "[{\"image\":\"https://blog.appletest.cn/head/pic1.jpg\",\"image_type\":\"URL\"},\n{\"image\":\"https://blog.appletest.cn/head/pic1.jpg\",\"image_type\":\"URL\"}]";

        request.setJsonBody(jsonBody);

        ApiExplorerClient client = new ApiExplorerClient();

        try {
            ApiExplorerResponse response = client.sendRequest(request);
            // 返回结果格式为Json字符串
            System.out.println(response.getResult());
            // return response;
            return response.getResult();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
