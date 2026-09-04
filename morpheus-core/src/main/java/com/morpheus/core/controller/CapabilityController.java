package com.morpheus.core.controller;

import com.morpheus.core.domain.model.Capability;
import com.morpheus.core.service.CapabilityRegistryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/capabilities")
public class CapabilityController {

    private final CapabilityRegistryService capabilityRegistryService;

    public CapabilityController(CapabilityRegistryService capabilityRegistryService) {
        this.capabilityRegistryService = capabilityRegistryService;
    }

    @GetMapping
    public ResponseEntity<List<Capability>> listAll() {
        return ResponseEntity.ok(capabilityRegistryService.listAll());
    }
}
