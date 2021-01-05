package com.ddd.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zyb
 * @create 2021/1/1 16:40
 */
@Configuration
@MapperScan("com.ddd.mbg.mapper")
public class MybatisConfig {
}
