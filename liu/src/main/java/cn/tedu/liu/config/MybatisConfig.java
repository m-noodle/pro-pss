package cn.tedu.liu.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("cn.tedu.liu.mapper")
public class MybatisConfig {
}
