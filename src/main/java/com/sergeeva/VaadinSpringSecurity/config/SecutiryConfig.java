package com.sergeeva.VaadinSpringSecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecutiryConfig extends WebSecurityConfigurerAdapter {

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//              //      .antMatchers("/", "/login", "/VAADIN/**", "/PUSH/**", "/UIDL/**").permitAll()
//              //      .antMatchers("/user/**").access("hasRole('ROLE_USER')")
//              //      .antMatchers("/admin/**").access("hasRole('ADMIN')")
//                    .anyRequest().authenticated()
//                .and()
//                    .formLogin().loginPage("/login").permitAll()
//                  //  .usernameParameter("username")
//              //  .passwordParameter("password")
//                .and()
//                .logout().logoutUrl("/logout").logoutSuccessUrl("/login?logged-out").permitAll()
//                .and().csrf().disable()
//              //  .exceptionHandling().authenticationEntryPoint(new LoginUrlAuthenticationEntryPoint("/log1n"))
//       .sessionManagement().sessionFixation().newSession();
//    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //@formatter:off
        http
                .csrf().disable() // Use Vaadin's CSRF protection
                .authorizeRequests().anyRequest().authenticated() // User must be authenticated to access any part of the application
                .and()
                .formLogin().loginPage("/login").permitAll() // Login page is accessible to anybody
                .and()
                .logout().logoutUrl("/logout").logoutSuccessUrl("/login?logged-out").permitAll() // Logout success page is accessible to anybody
                .and()
                .sessionManagement().sessionFixation().newSession(); // Create completely new session
        //@formatter:on
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/css/*");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication().withUser("user").password("password").roles("USER")
                .and()
                .withUser("admin").password("admin").roles("ADMIN", "USER");
    }
}
