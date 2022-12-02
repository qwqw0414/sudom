package com.joje.sudom.repository.auth;

import com.joje.sudom.model.entity.auth.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    int countByUserId(String userId);

    Optional<UserEntity> findByUserId(String userId);
}
