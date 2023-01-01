package com.lp.redisspringbootstarterautoconfigure.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author LuoPing
 * @project IntelliJ IDEA
 * @Package springboot-study
 * @Date 2022/12/21 17:30
 */
@ConfigurationProperties(prefix = "redis")
public class RedisProperties {
    private String host = "127.0.0.1";
    private int port = 6379;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
