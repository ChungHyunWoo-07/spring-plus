// package org.example.expert.config;
//
// import lombok.RequiredArgsConstructor;
// import org.springframework.boot.web.servlet.FilterRegistrationBean;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
//
// @Configuration
// @RequiredArgsConstructor
// public class FilterConfig {
//
//     private final JwtUtil jwtUtil;
//
//     @Bean
//     public FilterRegistrationBean<JwtFilter> jwtFilter() {
//         FilterRegistrationBean<JwtFilter> registrationBean = new FilterRegistrationBean<>();
//         registrationBean.setFilter(new JwtFilter(jwtUtil));
//         registrationBean.addUrlPatterns("/*"); // 필터를 적용할 URL 패턴을 지정합니다.
//
//         return registrationBean;
//     }
//}
// JwtFilter 를 사용하지 않기 때문에 JwtConfig 클래스도 필요없음
