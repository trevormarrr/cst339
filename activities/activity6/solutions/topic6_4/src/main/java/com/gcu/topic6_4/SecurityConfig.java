package com.gcu.topic6_4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	// authorize.requestMatchers("/").permitAll() - permit everyone access to root
	// authorize.anyRequest().authenticated() - any other requests must be authenticated
	// .formLogin(Customizer.withDefaults()) - allow access with a form, e.g. username and password
	// .oauth2Login(Customizer.withDefaults()) - login with OAUTH using src/main/resources/application.properties configuration settings
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .authorizeHttpRequests(authorize -> {
                    authorize.requestMatchers("/").permitAll();
                    authorize.anyRequest().authenticated();
                })
                .oauth2Login(Customizer.withDefaults())
                .formLogin(Customizer.withDefaults())
                .build();
    }
}
