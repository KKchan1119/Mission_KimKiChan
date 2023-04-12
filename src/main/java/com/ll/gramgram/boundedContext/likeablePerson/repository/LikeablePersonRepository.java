package com.ll.gramgram.boundedContext.likeablePerson.repository;

import com.ll.gramgram.base.rsData.RsData;
import com.ll.gramgram.boundedContext.likeablePerson.entity.LikeablePerson;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ll.gramgram.base.rq.Rq;

import java.util.List;

public interface LikeablePersonRepository extends JpaRepository<LikeablePerson, Long> {
    List<LikeablePerson> findByFromInstaMemberId(Long fromInstaMemberId);

    static boolean existsById(String id) {
        return RsData.of("F-1", "중복된 호감표시 입니다.");
    }
}
