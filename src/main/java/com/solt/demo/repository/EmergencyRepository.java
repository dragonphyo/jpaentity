package com.solt.demo.repository;

import com.solt.demo.domain.Emergency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmergencyRepository extends JpaRepository<Emergency,InternalError> {
}
