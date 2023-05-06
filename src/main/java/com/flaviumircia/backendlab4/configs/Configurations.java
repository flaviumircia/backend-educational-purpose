package com.flaviumircia.backendlab4.configs;

import com.flaviumircia.backendlab4.misc.ReadCredentials;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class Configurations {

    @Bean
    public DataSource dataSource() throws FileNotFoundException {
        Map<String,String> credentials;
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        credentials=ReadCredentials.getCredentialsFromRelative("/src/main/java/com/flaviumircia/backendlab4/misc/Credentials.txt");

        dataSource.setUsername(credentials.get("username"));
        dataSource.setPassword(credentials.get("password"));
        dataSource.setUrl(
                "jdbc:mysql://localhost:3306/ppa_lab?createDatabaseIfNotExist=true");

        return dataSource;
    }
}
