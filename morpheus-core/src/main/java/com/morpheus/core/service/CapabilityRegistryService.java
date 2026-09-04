package com.morpheus.core.service;

import com.morpheus.core.domain.model.Capability;
import com.morpheus.core.domain.model.CapabilityId;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class CapabilityRegistryService {

    private final ConcurrentHashMap<CapabilityId, Capability> capabilities = new ConcurrentHashMap<>();

    public void register(Capability capability) {
        if (capability == null) throw new IllegalArgumentException("Capability cannot be null");
        capabilities.put(capability.id(), capability);
    }

    public List<Capability> listAll() {
        return new ArrayList<>(capabilities.values());
    }

    public Optional<Capability> get(CapabilityId id) {
        if (id == null) return Optional.empty();
        return Optional.ofNullable(capabilities.get(id));
    }
}
