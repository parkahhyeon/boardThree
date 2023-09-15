package com.study.boardThree.mapper;

import com.study.boardThree.domain.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {
    /**
     * 게시글 저장
     * @param params - 게시글 정보
     */
    void save(Post params);

    /**
     * 게시글 상세정보 조회
     * @param id - PK
     * @return 게시글 상세정보
     */
    Post findById(Long id);

    /**
     * 게시글 수정
     * @param params - 게시글 정보
     */
    void update(Post params);

    /**
     * 게시글 삭제
     * @param id - PK
     */
    void deleteById(Long id);

    /**
     * 게시글 리스트 조회
     * @return 게시글 리스트
     */
    List<Post> findAll();

    /**
     * 게시글 수 카운팅
     * @return 게시글 수
     */
    int count();
}
