package com.cohleague.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    //@Value("${spring.datasource.url}")
    private String url = "jdbc:oracle:thin:@cohldb_medium?TNS_ADMIN=C:/Users/Adira/eclipse-workspace/cohl-api/src/main/resources/wallet_cohldb";

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        // byte[] decodedBytes = Base64.getDecoder().decode(password);
        // new String(decodedBytes, StandardCharsets.UTF_8)
        dataSource.setPassword(password);
        return dataSource;
    }
}