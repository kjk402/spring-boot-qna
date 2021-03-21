package com.codessquad.qna.repository;

import com.codessquad.qna.domain.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
    List<Answer> findAllByQuestionIdAndIsDeleteFalse(Long questionId);
}
