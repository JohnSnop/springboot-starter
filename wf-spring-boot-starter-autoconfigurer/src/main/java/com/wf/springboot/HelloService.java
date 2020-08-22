package com.wf.springboot;

/**
 * @author wf
 * @create 2020-08-22 21:49
 * @desc
 **/
public class HelloService {

    private HelloProperties helloProperties;

    public String sayHello(String hello) {
        return helloProperties.getPrefix() + "==" + hello + "==" + helloProperties.getSuffix();
    }

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }
}
