package com.gcu.topic6_1;

/* WebSecurityConfigureAdapter - deprecated, actually GONE */

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;

//import cst339.business.UsersDataService;

/*
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurationAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
			.authorizeRequests()
				.antMatchers("/", "/images/**", "/service/**").permitAll()
				.anyRequest().authenticated()
				.and()
				.formLogin()
					.loginPage("/login")
					.usernameParameter("username")
					.passwordParameter("password")
					.permitAll()
					.defaultSuccessUrl("/orders/display", true)
					.and()
		.logout()
			.logoutUrl("/logout")
			.invalidateHttpSession(true)
			.clearAuthentication(true)
			.permitAll()
			.logoutSuccessUrl("/");
	}
*/

@Configuration
@EnableWebSecurity
public class SecurityConfig {

//	@Autowired
//	private UserDetailsService service;

	// Topic 6 - Part 2 - Securing a Web Application Using a Database
//    @Bean
//    public PasswordEncoder getPasswordEncoder() {
//    	String encoded = new BCryptPasswordEncoder().encode("password");
//        return new BCryptPasswordEncoder();
//    }

//  https://spring.io/blog/2022/02/21/spring-security-without-the-websecurityconfigureradapter
//	@Bean
//	public InMemoryUserDetailsManager userDetailsService() {
//		UserDetails user = User.withDefaultPasswordEncoder().username("username").password("password").roles("USER")
//				.build();
//		return new InMemoryUserDetailsManager(user);
//	}

	// Topic 6 - Part 1 - In Memory Authentication
	@Autowired
	public void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
		
		System.out.println(">>>>> SecurityConfig.configure - building");
		authenticationManagerBuilder.inMemoryAuthentication().withUser("test").password("{noop}test").roles("USER");
		System.out.println(">>>>> SecurityConfig.configure - built");
		//authenticationManagerBuilder.configurers[0].value[0].user
	}

	// Topic 6 - Part 2 - Securing a Web Application Using a Database
//	@Autowired
//	public void configure(AuthenticationManagerBuilder auth) throws Exception {
//	    System.out.println(">>>>> SecurityConfig.configure");
//		String encoded = new BCryptPasswordEncoder().encode("password");
//		auth.userDetailsService(service).passwordEncoder(new BCryptPasswordEncoder());
//	}
}
