package com.teamck.showing.cmm;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Getter;
import lombok.Setter;

@Configuration
//value를 통해 값이 있는 위치를 명시해준다.
@PropertySource(value = "classpath:application.yml", factory = YamlPropertySourceFactory.class)
//yml 파일에서 가져올 변수 이름을 명시해준다.
@ConfigurationProperties(prefix = "spring")
@Getter
@Setter
public class ApplicationDBRead {
	private DBSource datasource;
	
	@Getter
	@Setter
	public static class DBSource {
		private String driverClassName;
		private String url;
		private String username;
		private String password;
	}
}
