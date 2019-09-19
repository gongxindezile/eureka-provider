eureka-provider整合swagger2,实现eureka界面点击服务跳转至swagger界面查看接口信息
注意swagger2的依赖和yml配置和Swagger2Config配置类都是加在eureka-provider项目中.


Eureka 剔除失效服务
也就是说正常默认情况下，会有3分钟左右的剔除延迟(eureka-provider关闭了, 在eureka-server界面还有移除)
# 关闭保护机制
eureka.server.enable-self-preservation=false
#剔除失效服务间隔
eureka.server.eviction-interval-timer-in-ms=2000
客户端配置

#Eureka客户端向服务端发送心跳的时间间隔，单位为秒（客户端告诉服务端自己会按照该规则）
eureka.instance.lease-renewal-interval-in-seconds =10
#Eureka服务端在收到最后一次心跳之后等待的时间上限，单位为秒，超过则剔除（客户端告诉服务端按照此规则等待自己）
eureka.instance.lease-expiration-duration-in-seconds =5