package com.challenge.repository;

import com.challenge.entity.User;
import com.challenge.repository.interfaces.UserRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepositoryJpa
        extends UserRepository, JpaRepository<User, Long> {

    @Override
    @Query("FROM User u JOIN u.candidates c WHERE c.id.acceleration.name LIKE :pName")
    List<User> findByAccelerationName(@Param("pName") String name);

    @Override
    @Query("FROM User u JOIN u.candidates c WHERE c.id.company.id = :pCompanyId")
    List<User> findByCompanyId(@Param("pCompanyId") Long companyId);
}
