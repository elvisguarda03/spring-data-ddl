package com.challenge.repository;

import com.challenge.entity.Acceleration;
import com.challenge.repository.interfaces.AccelerationRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccelerationRepositoryJpa
        extends AccelerationRepository, JpaRepository<Acceleration, Long> {

    @Override
    @Query("FROM Acceleration a JOIN a.candidates c WHERE c.id.company.id = :pCompanyId")
    List<Acceleration> findByCompanyId(@Param("pCompanyId") Long companyId);
}
