// package org.example.expert.config;
//
// import at.favre.lib.crypto.bcrypt.BCrypt;
// import org.springframework.stereotype.Component;
//
// @Component
// public class PasswordEncoder {
//
//     public String encode(String rawPassword) {
//         return BCrypt.withDefaults().hashToString(BCrypt.MIN_COST, rawPassword.toCharArray());
//     }
//
//     public boolean matches(String rawPassword, String encodedPassword) {
//         BCrypt.Result result = BCrypt.verifyer().verify(rawPassword.toCharArray(), encodedPassword);
//         return result.verified;
//     }
// }

//패스워드 인코더도 이미 Spring Security 가 가지고있는 인터페이스로 사용하기 떄문에 필요없음