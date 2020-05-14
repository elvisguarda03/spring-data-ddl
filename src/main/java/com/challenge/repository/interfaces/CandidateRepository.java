package com.challenge.repository.interfaces;

import com.challenge.entity.Candidate;
import com.challenge.entity.CandidateId;

import java.util.List;
import java.util.Optional;

public interface CandidateRepository extends RepositoryInterface<Candidate> {
    Optional<Candidate> findById(CandidateId id);

    List<Candidate> findByCompanyId(Long companyId);

    List<Candidate> findByAccelerationId(Long accelerationId);
}
