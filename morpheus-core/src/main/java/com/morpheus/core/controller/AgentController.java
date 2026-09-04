package com.morpheus.core.controller;

import com.morpheus.core.domain.model.Agent;
import com.morpheus.core.domain.model.AgentId;
import com.morpheus.core.service.AgentRegistryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/agents")
public class AgentController {

    private final AgentRegistryService agentRegistryService;

    public AgentController(AgentRegistryService agentRegistryService) {
        this.agentRegistryService = agentRegistryService;
    }

    @PostMapping
    public ResponseEntity<Void> register(@RequestBody Agent agent) {
        agentRegistryService.register(agent);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{agentId}")
    public ResponseEntity<Void> unregister(@PathVariable String agentId) {
        agentRegistryService.unregister(new AgentId(agentId));
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Agent>> listAll() {
        return ResponseEntity.ok(agentRegistryService.listAll());
    }

    @GetMapping("/{agentId}")
    public ResponseEntity<Agent> get(@PathVariable String agentId) {
        return agentRegistryService.get(new AgentId(agentId))
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
