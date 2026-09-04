package com.morpheus.core.controller;

import com.morpheus.core.domain.model.Approval;
import com.morpheus.core.service.ApprovalEngineService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/approvals")
public class ApprovalController {

    private final ApprovalEngineService approvalEngineService;

    public ApprovalController(ApprovalEngineService approvalEngineService) {
        this.approvalEngineService = approvalEngineService;
    }

    @GetMapping
    public ResponseEntity<List<Approval>> listPendingApprovals() {
        return ResponseEntity.ok(approvalEngineService.listPendingApprovals());
    }

    @PostMapping("/{id}/approve")
    public ResponseEntity<Void> approve(@PathVariable String id) {
        // In a real scenario, extract user from security context
        String decidedBy = "admin-user"; 
        approvalEngineService.approve(id, decidedBy);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/{id}/reject")
    public ResponseEntity<Void> reject(@PathVariable String id) {
        String decidedBy = "admin-user";
        approvalEngineService.reject(id, decidedBy);
        return ResponseEntity.ok().build();
    }
}
