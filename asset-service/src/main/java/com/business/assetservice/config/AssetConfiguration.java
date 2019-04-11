package com.business.assetservice.config;

import com.business.assetservice.rest.AssetController;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
public class AssetConfiguration {

    private Environment env;

    public static final Logger logger = LoggerFactory.getLogger(AssetController.class);

    private String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521/XE";
    private String username = "system";
    private String password = "oracle";

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url(dbUrl);
        dataSourceBuilder.username(username);
        dataSourceBuilder.password(password);
        return dataSourceBuilder.build();
    }

}
