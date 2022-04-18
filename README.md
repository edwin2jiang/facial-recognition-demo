# 百度人脸识别Demo



## 接口请求

### token

```
post

https://aip.baidubce.com/oauth/2.0/token?grant_type=client_credentials&client_id=2QkkkY7yHNVmoSNv2nVLGnML&client_secret=T732M00bMrHVF8XoREMAC0I6Mrn4GuN4
```



![image-20220418125935816](http://imgbed-xia-2.oss-cn-hangzhou.aliyuncs.com/img/image-20220418125935816.png)



![image-20220418130126913](http://imgbed-xia-2.oss-cn-hangzhou.aliyuncs.com/img/image-20220418130126913.png)

代码中：

![image-20220418130102293](http://imgbed-xia-2.oss-cn-hangzhou.aliyuncs.com/img/image-20220418130102293.png)

ps: 该token每30分钟就过期，建议动态获取



### Post match （比对图片）

```
post 
http://localhost:10300/compareFace
```



当score>=75, 可判定是同一个人。



