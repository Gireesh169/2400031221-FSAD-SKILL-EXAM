package com.klf.fsad.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klf.fsad.exam.model.Shipment;
import com.klf.fsad.exam.service.ShipmentService;
@RestController
@RequestMapping("/shipment")
public class ShipmentController {

    @Autowired
    private ShipmentService service;

    @PostMapping("/add")
    public Shipment addShipment(@RequestBody Shipment shipment) {
        return service.addShipment(shipment);
    }

    @PutMapping("/update/{id}")
    public Shipment updateShipment(@PathVariable Long id,
                                   @RequestBody Shipment shipment) {
        return service.updateShipment(id, shipment);
    }
}