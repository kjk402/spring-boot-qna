package com.codessquad.qna.repository;

import com.codessquad.qna.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserId(String userId);
}
