package com.solt.demo.repository;

import com.solt.demo.domain.ExternalVet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExternalVetRepository extends JpaRepository<ExternalVet,Integer> {
}
