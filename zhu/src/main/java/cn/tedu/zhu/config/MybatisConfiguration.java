package cn.tedu.zhu.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("cn.tedu.zhu.mapper")
public class MybatisConfiguration {
}
