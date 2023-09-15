package com.study.boardThree.service;

import com.study.boardThree.domain.Member;
import com.study.boardThree.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberMapper memberMapper;

    /**
     * 회원 정보 저장 (회원가입)
     * @parma params - 회원 정보
     * @return PK
     * */
    @Transactional
    public long signUpMember (final Member params) {
        memberMapper.signUp(params);
        return params.getId();
    }

    /**
     * 회원 상세 정보 조회
     * @param loginId
     * @return 회원 상세 정보
     * */
    public Member findMemberByLoginId(final String loginId) {
        return memberMapper.findByLonginId(loginId);
    }

    /**
     * 회원 정보 수정
     * @param params - 회원 정보
     * @return PK
     * */
    @Transactional
    public long updateMember(final Member params) {
        memberMapper.updateMember(params);
        return params.getId();
    }

    /**
     * 회원 정보 삭제 (회원 탈퇴)
     * @param id - PK
     * @return PK
     * */
    @Transactional
    public long deleteMemberById(final long id) {
        memberMapper.deleteById(id);
        return id;
    }

    /**
     * 회원 수 카운팅 (ID 중복 체크)
     * @param loginId
     * @return 회원 수
     * */
    public int countMemberByLoginId(final String loginId) {
        return memberMapper.countByLoginId(loginId);
    }

    /**
     * 로그인
     * @param loginId - 로그인 ID
     * @param password - 비밀번호
     * @return 회원 상세정보
     * */
    public Member login(final String loginId, final String password) {

        // 1. 회원 정보 및 비밀번호 조회
        Member member = findMemberByLoginId(loginId);
//        String encodedPassword = (member == null) ? "" : member.getPassword();
//
//        // 2 회원 정보 및 비밀번호 체크
//        if (member == null || passwordEncoder.matches(password, encodedPassword) == false) {
//            return null;
//        }

        // 3. 회원 객체에서 비밀번호를 제거한 후 회원 정보 리턴
//        member.clearPassword();
        return member;
    }
}