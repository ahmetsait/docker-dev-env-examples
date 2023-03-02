package com.defia.soft;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {
	@Bean
	public DataSource getDataSource() throws IOException {
		
		String db = System.getenv("DB_DATABASE");
		String user = System.getenv("DB_USER");
		String passwordPath = System.getenv("DB_PASSWORD_FILE");
		
		return DataSourceBuilder.create()
				.driverClassName("org.mariadb.jdbc.Driver")
				.url("jdbc:mariadb://db:3306/" + db)
				.username(user)
				.password(Files.readString(Paths.get(passwordPath)))
				.build();
	}
}
