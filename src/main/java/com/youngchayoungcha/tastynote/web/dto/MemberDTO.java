package com.youngchayoungcha.tastynote.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberDTO {

    private Long id;

    private String email;
    private String password;
    private String name;
}
