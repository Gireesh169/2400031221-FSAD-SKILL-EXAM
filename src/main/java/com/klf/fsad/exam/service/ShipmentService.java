package com.klf.fsad.exam.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klf.fsad.exam.model.Shipment;
import com.klf.fsad.exam.repository.ShipmentRepository;

@Service
public class ShipmentService {

    @Autowired
    private ShipmentRepository repository;

    public Shipment addShipment(Shipment shipment) {
        return repository.save(shipment);
    }

    public Shipment updateShipment(Long id, Shipment shipment) {

        Optional<Shipment> existingShipment = repository.findById(id);

        if(existingShipment.isPresent()) {

            Shipment s = existingShipment.get();
            s.setShipmentName(shipment.getShipmentName());
            s.setOrigin(shipment.getOrigin());
            s.setDestination(shipment.getDestination());

            return repository.save(s);
        }

        return null;
    }
}