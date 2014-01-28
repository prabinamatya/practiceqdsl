package com.prabin.querydsl.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.prabin.querydsl.repository")
@ComponentScan({"com.prabin.querydsl.entity", "com.prabin.querydsl.repository"})
public class QdslPracticeEntitiesSpringConfig {

}
