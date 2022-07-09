package cn.tedu.pro.zzz.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "cn.tedu.pro.zzz.mapper")
public class MybatisConfiguration {
}
