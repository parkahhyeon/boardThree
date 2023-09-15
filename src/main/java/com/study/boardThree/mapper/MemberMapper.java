package com.study.boardThree.mapper;

import com.study.boardThree.domain.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    /**
     *  회원 정보 저장
     *  @param params - 회원 정보
     *  */
    void signUp(Member params);

    /**
     * 회원 상세정보 조회
     * @param loginId
     * @return 회원 상세정보
     * */
    Member findByLonginId(String loginId);

    /**
     * 회원 정보 수정
     * @parma params - 회원 정보
     * */
    void updateMember (Member params);

    /**
     * 회원 정보 삭제 (회원 탈퇴)
     * @param id
     * @return 회원수
     * */
    void deleteById(long id);

    /**
     * 회원 수 카운팅 (ID 중복 체크)
     * @parma id
     * @return 회원 수
     * */
    int countByLoginId(String loginId);
}
