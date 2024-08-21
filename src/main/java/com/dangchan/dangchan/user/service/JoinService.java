package com.dangchan.dangchan.user.service;

import com.dangchan.dangchan.user.dto.JoinDTO;
import com.dangchan.dangchan.user.entity.User;
import com.dangchan.dangchan.user.repository.UserRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
public class JoinService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public void joinProcess(JoinDTO joinDTO){
        String email = joinDTO.getEmail();
        String password = joinDTO.getPassword();
        String birth = joinDTO.getBirth();
        String name = joinDTO.getName();

        Boolean isExist = userRepository.existsByEmail(email);

        if (isExist){
            return;
        }

        User user = new User();

        user.setEmail(email);
        user.setBirth(birth);
        user.setName(name);
        user.setPassword(bCryptPasswordEncoder.encode(password));
        user.setRole("ROLE_ADMIN");

        userRepository.save(user);
    }


}
