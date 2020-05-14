package com.challenge.repository;

import com.challenge.entity.Challenge;
import com.challenge.repository.interfaces.ChallengeRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChallengeRepositoryJpa
        extends ChallengeRepository, JpaRepository<Challenge, Long> {

    @Override
    @Query("SELECT c FROM Challenge c JOIN c.accelerations a " +
            "JOIN c.submissions s WHERE a.id = :pAccelerationId AND s.id.user.id = :pUserId")
    List<Challenge> findByAccelerationIdAndUserId(@Param("pAccelerationId") Long accelerationId, @Param("pUserId") Long userId);
}
