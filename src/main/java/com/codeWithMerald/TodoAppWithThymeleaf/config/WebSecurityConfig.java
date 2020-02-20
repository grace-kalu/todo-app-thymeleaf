//package com.codeWithMerald.TodoAppWithThymeleaf.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//    /// define the URL path to authenticate or not
//
//    @Override
//    protected void configure(HttpSecurity httpSecurity) throws Exception{
//        httpSecurity.authorizeRequests().antMatchers("/allowed", "/signup", "/resources/**", "index").permitAll()
//                ///authorize every other request and display the login page
//        .anyRequest().authenticated()
//                ///formLogin returns an object you can use to configure the login page
//        .and().formLogin()
//                ///specify the login route to go if login is required
//        .loginPage("/login").permitAll()
//                /// configure the logout
//        .and().logout().permitAll();
//
//    }
//
//    @Bean
//    @Override
//    public UserDetailsService userDetailsService() {
//        UserDetails user = User.withDefaultPasswordEncoder().username("grace").password("password").roles("USER").build();
//
////        return username -> {
////            // TODO Auto-generated method stub
////            return user;
////        };
//
//        return new UserDetailsService() {
//
//            @Override
//            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//                // TODO Auto-generated method stub
//                return user;
//
//            }
//        };
//        // InMemoryUserDetailsManager(user);
//    }
//}
