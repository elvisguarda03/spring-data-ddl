package com.challenge.repository.interfaces;

import com.challenge.entity.Acceleration;

import java.util.List;
import java.util.Optional;

public interface AccelerationRepository extends RepositoryInterface<Acceleration> {
    Optional<Acceleration> findById(Long id);

    List<Acceleration> findByCompanyId(Long companyId);

}
