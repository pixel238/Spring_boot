package com.tavisca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tavisca.model.Shipwreck;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {

}
