package com.morpheus.core.controller;

import com.morpheus.core.domain.model.CorrelationId;
import com.morpheus.core.domain.model.Intent;
import com.morpheus.core.domain.model.UserContext;
import com.morpheus.core.service.ExecutionEngineService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/intent")
public class IntentController {

    private final ExecutionEngineService executionEngineService;

    public IntentController(ExecutionEngineService executionEngineService) {
        this.executionEngineService = executionEngineService;
    }

    @PostMapping
    public ResponseEntity<IntentResponse> submitIntent(@RequestBody IntentPayload payload) {
        // Construct the intent and user context from the payload
        Intent intent = new Intent(payload.name(), payload.parameters());
        
        // Mock user context if none is provided for the MVP
        UserContext ctx = payload.userContext() != null ? payload.userContext() : 
            new UserContext("anonymous", "unknown-device", "unknown-location");

        try {
            CorrelationId correlationId = executionEngineService.dispatchIntent(intent, ctx);
            return ResponseEntity.accepted().body(new IntentResponse(correlationId.value(), "ACCEPTED"));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(new IntentResponse(null, e.getMessage()));
        }
    }

    public record IntentPayload(String name, Map<String, Object> parameters, UserContext userContext) {}
    
    public record IntentResponse(String correlationId, String status) {}
}
