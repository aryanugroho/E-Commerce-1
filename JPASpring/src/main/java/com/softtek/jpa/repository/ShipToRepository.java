package com.softtek.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softtek.jpa.domain.ShipTo;

@Repository
public interface ShipToRepository extends JpaRepository<ShipTo, Long> {


}
