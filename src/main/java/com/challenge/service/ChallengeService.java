package com.challenge.service;

import com.challenge.entity.Challenge;
import com.challenge.repository.interfaces.ChallengeRepository;
import com.challenge.service.interfaces.ChallengeServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChallengeService implements ChallengeServiceInterface {
    private final ChallengeRepository challengeRepository;

    @Override
    public List<Challenge> findByAccelerationIdAndUserId(Long accelerationId, Long userId) {
        return challengeRepository.findByAccelerationIdAndUserId(accelerationId, userId);
    }

    @Override
    public Challenge save(Challenge challenge) {
        return challengeRepository.save(challenge);
    }
}
