package com.solt.demo.repository;

import com.solt.demo.domain.FootItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FootItemRepository extends JpaRepository<FootItem,Integer> {
}
