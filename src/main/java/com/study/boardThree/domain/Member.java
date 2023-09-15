package com.study.boardThree.domain;

import lombok.Data;

@Data
public class Member {

    private Long id;            // 회원번호 PK
    private String loginId;     // 로그인 ID
    private String name;        // 이름
    private String password;    // 비밀번호
    private boolean deleteYn;   // 삭제 여부
}
