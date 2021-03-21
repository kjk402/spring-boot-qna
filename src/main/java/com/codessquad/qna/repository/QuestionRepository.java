package com.codessquad.qna.repository;

import com.codessquad.qna.domain.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {
//    Page<Question> findAllByIsDeleteFalse(PageRequest of);

    Page<Question> findAllByIsDeleteFalse(Pageable pageable);
}
