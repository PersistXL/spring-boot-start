package com.saikie.starter;

public class HelloService {

    /**
     * 生产HelloProperties的getSet方法，使得配置类可以得到它
     */
    HelloProperties helloProperties;

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public String sayHello(String name) {
        // 返回打招呼信息，招呼信息是可配置的
        return helloProperties.getPrefix() + "-" + name + "-" + helloProperties.getSuffix();
    }
}
