package com.challenge.repository;

import com.challenge.entity.Candidate;
import com.challenge.entity.CandidateId;
import com.challenge.repository.interfaces.CandidateRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CandidateRepositoryJpa
        extends CandidateRepository, JpaRepository<Candidate, CandidateId> {

    @Override
    @Query("FROM Candidate c WHERE c.id.company.id = :pCompanyId")
    List<Candidate> findByCompanyId(@Param("pCompanyId") Long companyId);

    @Override
    @Query("FROM Candidate c WHERE c.id.acceleration.id = :pAccelerationId")
    List<Candidate> findByAccelerationId(@Param("pAccelerationId") Long accelerationId);
}