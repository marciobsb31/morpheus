package com.morpheus.core.service;

import com.morpheus.core.domain.model.AuditLog;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.UUID;

@Service
public class AuditService {

    private final AuditLogRepository auditLogRepository;

    public AuditService(AuditLogRepository auditLogRepository) {
        this.auditLogRepository = auditLogRepository;
    }

    public void log(AuditLog log) {
        if (log.getId() == null) {
            log.setId(UUID.randomUUID());
        }
        if (log.getTimestamp() == null) {
            log.setTimestamp(Instant.now());
        }
        auditLogRepository.save(log);
    }
}
