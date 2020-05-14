package com.challenge.service;

import com.challenge.entity.Submission;
import com.challenge.repository.interfaces.SubmissionRepository;
import com.challenge.service.interfaces.SubmissionServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.Bidi;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SubmissionService implements SubmissionServiceInterface {
    private final SubmissionRepository submissionRepository;

    @Override
    public BigDecimal findHigherScoreByChallengeId(Long challengeId) {
        return submissionRepository.findHigherScoreByChallengeId(challengeId)
                .orElse(BigDecimal.ZERO);
    }

    @Override
    public List<Submission> findByChallengeIdAndAccelerationId(Long challengeId, Long accelerationId) {
        return submissionRepository.findByChallengeIdAndAccelerationId(challengeId, accelerationId);
    }

    @Override
    public Submission save(Submission submission) {
        return submissionRepository.save(submission);
    }
}
