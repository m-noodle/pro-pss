package cn.tedu.min.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = {"cn.tedu.min.mapper"})
public class MybatisConfiguration {
}
