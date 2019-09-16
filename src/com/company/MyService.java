package com.company;

/**
 * 发布MyService的webservice服务
 *
 * 这是一个在包中的类，需要在axis-web额外设置service.xml才能发布它(不在包中的类，直接丢到pojo文件夹下即可，无需额外设置，例如SimpleSerivce)
 * 结构为
 * <项目名>/META-INF/service.xml 手工创建
 * <项目名>/com/company/MyService.class 这里是编译后的文件
 * 把如上结构打成aar包或者jar包，然后丢到axis-web的services目录中去，即可自动部署
 *
 * 下面提供一个services.xml的模板
 */
/*

<项目名>/META-INF/service.xml 手工创建

<?xml version="1.0" encoding="UTF-8"?>
<!-- webService发布名称,命名空间 -->
<service name="myService" targetNamespace="http://ws.apache.org/ax2">

    <!-- 更改schemaNamespace，也可使用默认值，客户端调用时会使用 -->
    <schema schemaNamespace="http://az2x.com"/>

    <!-- webService描述 -->
    <description>Web Service实例一</description>

    <!-- webService的实现类 -->
    <parameter name="ServiceClass">com.company.MyService</parameter>

    <!-- 配置消息接收器，Axis2会自动选择 -->
    <messageReceivers>
        <messageReceiver mep="http://www.w3.org/ns/wsdl/in-out"
        class="org.apache.axis2.rpc.receivers.RPCMessageReceiver" />
        <messageReceiver mep="http://www.w3.org/ns/wsdl/in-only"
        class="org.apache.axis2.rpc.receivers.RPCInOnlyMessageReceiver"/>
    </messageReceivers>
</service>

*/
public class MyService {
    public String getGreeting(String name) {
        return "您好 " + name; }
    public void update(String data) {
        System.out.println("<" + data + ">已经更新"); }
}