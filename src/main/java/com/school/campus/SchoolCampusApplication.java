package com.school.campus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class SchoolCampusApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolCampusApplication.class, args);
	}
}
