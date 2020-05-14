package com.challenge.repository.interfaces;

import com.challenge.entity.Challenge;

import java.util.List;

public interface ChallengeRepository extends RepositoryInterface<Challenge> {
    List<Challenge> findByAccelerationIdAndUserId(Long accelerationId, Long userId);
}