package com.prabin.querydsl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.prabin.querydsl.repository")
@ComponentScan({"com.prabin.querydsl.entities", "com.prabin.querydsl.repository"})
public class QuerydslPracticeEntitiesSpringConfig {
	
	public static final String[] DEMO_DB_SCRIPTS = new String[] {"classpath:db/schema.practice.qdsl.sql", "classpath:db/data.practice.qdsl.sql"};
	
	@Bean
	public DemoDatabaseScriptSource practiceEntitiesDemoDatabaseScripts() {
		return new DemoDatabaseScriptSource() {
			
			public String[] getDatabaseScripts() {
				return DEMO_DB_SCRIPTS;
			}
		};
		
	}

}
