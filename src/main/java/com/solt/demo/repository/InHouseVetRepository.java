package com.solt.demo.repository;

import com.solt.demo.domain.InHouseVet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InHouseVetRepository extends JpaRepository<InHouseVet,Integer> {
}
