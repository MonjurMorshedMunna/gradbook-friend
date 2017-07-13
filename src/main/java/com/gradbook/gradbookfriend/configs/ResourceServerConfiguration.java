/*
package com.gradbook.gradbookfriend.configs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

import javax.sql.DataSource;
import java.sql.DriverManager;

*/
/**
 * Created by Munna on 13-Jul-17.
 *//*

@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

    Logger log = LoggerFactory.getLogger(ResourceServerConfigurer.class);



    @Bean
    @Primary
    public RemoteTokenServices tokenServices(){
        RemoteTokenServices tokenService = new RemoteTokenServices();
        tokenService.setCheckTokenEndpointUrl("http://localhost:9090/oauth/check_token");
        tokenService.setClientId("gradbook");
        tokenService.setClientSecret("gradbook");
        return tokenService;
    }

    @Bean
    public TokenStore tokenStore(){
        return new JdbcTokenStore(dataSource());
    }

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource.setUrl("jdbc:sqlserver://gradbook.database.windows.net:1433;database=gradbook;user=gradbook@gradbook;password={@ustig100};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30");
        dataSource.setUsername("gradbook");
        dataSource.setPassword("@ustig100");
        return dataSource;
    }
}
*/
