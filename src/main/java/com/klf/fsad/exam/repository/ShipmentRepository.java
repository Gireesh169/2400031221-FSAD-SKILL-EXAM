package com.klf.fsad.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klf.fsad.exam.model.Shipment;

public interface ShipmentRepository extends JpaRepository<Shipment, Long>{

}