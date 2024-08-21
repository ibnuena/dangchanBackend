package com.dangchan.dangchan.user.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class JoinDTO {
    private String email;
    private String password;
    private String name;
    private String birth;
}
