package com.challenge.repository.interfaces;

import com.challenge.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends RepositoryInterface<User> {
    Optional<User> findById(Long userId);

    List<User> findByAccelerationName(String name);

    List<User> findByCompanyId(Long companyId);
}
