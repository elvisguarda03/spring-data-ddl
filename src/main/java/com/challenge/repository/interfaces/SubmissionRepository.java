package com.challenge.repository.interfaces;

import com.challenge.entity.Submission;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface SubmissionRepository extends RepositoryInterface<Submission> {
    Optional<BigDecimal> findHigherScoreByChallengeId(Long challengeId);

    List<Submission> findByChallengeIdAndAccelerationId(Long challengeId, Long accelerationId);
}
