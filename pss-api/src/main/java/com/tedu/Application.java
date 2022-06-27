package com.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
报Failed to configure a DataSource:'url' attribute is not specified and no embedded datasource could be configured.
错误时，使用
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
在启动Application时不连接数据库
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class,args);

    }

}
