package uz.dev.pcmarket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()

                .antMatchers(HttpMethod.POST,"/api/**").hasAuthority("ADD")
                .antMatchers(HttpMethod.PUT,"/api/**").hasAuthority("EDIT")
                .antMatchers(HttpMethod.GET,"/api/**").hasAuthority("READ")
                .antMatchers(HttpMethod.DELETE,"/api/**").hasAuthority("DELETE")

                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth
                .inMemoryAuthentication()
                .withUser("admin").password(passwordEncoder().encode("1998")).roles("SUPER_ADMIN")
                .authorities("READ","DELETE","EDIT","ADD")
                .and()
                .withUser("moderator").password(passwordEncoder().encode("m")).roles("MODERATOR")
                   .authorities("EDIT","ADD")
                .and()
                .withUser("operator").password(passwordEncoder().encode("o")).roles("OPERATOR")
                 .authorities("READ","ADD");

    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return  new BCryptPasswordEncoder();
    }

}
