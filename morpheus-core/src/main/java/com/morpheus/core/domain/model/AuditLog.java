package com.morpheus.core.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "audit_logs")
public class AuditLog {
    
    @Id
    private UUID id;
    
    private Instant timestamp;
    private String actorId;
    private String agentId;
    private String capability;
    private String decision;
    private String policyVersion;
    private String risk;
    private String approvalId;
    private String correlationId;
    private String result;
    private Long durationMs;
    
    public AuditLog() {
    }

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public Instant getTimestamp() { return timestamp; }
    public void setTimestamp(Instant timestamp) { this.timestamp = timestamp; }
    public String getActorId() { return actorId; }
    public void setActorId(String actorId) { this.actorId = actorId; }
    public String getAgentId() { return agentId; }
    public void setAgentId(String agentId) { this.agentId = agentId; }
    public String getCapability() { return capability; }
    public void setCapability(String capability) { this.capability = capability; }
    public String getDecision() { return decision; }
    public void setDecision(String decision) { this.decision = decision; }
    public String getPolicyVersion() { return policyVersion; }
    public void setPolicyVersion(String policyVersion) { this.policyVersion = policyVersion; }
    public String getRisk() { return risk; }
    public void setRisk(String risk) { this.risk = risk; }
    public String getApprovalId() { return approvalId; }
    public void setApprovalId(String approvalId) { this.approvalId = approvalId; }
    public String getCorrelationId() { return correlationId; }
    public void setCorrelationId(String correlationId) { this.correlationId = correlationId; }
    public String getResult() { return result; }
    public void setResult(String result) { this.result = result; }
    public Long getDurationMs() { return durationMs; }
    public void setDurationMs(Long durationMs) { this.durationMs = durationMs; }

    public static AuditLogBuilder builder() {
        return new AuditLogBuilder();
    }

    public static class AuditLogBuilder {
        private AuditLog log = new AuditLog();

        public AuditLogBuilder id(UUID id) { log.setId(id); return this; }
        public AuditLogBuilder timestamp(Instant timestamp) { log.setTimestamp(timestamp); return this; }
        public AuditLogBuilder actorId(String actorId) { log.setActorId(actorId); return this; }
        public AuditLogBuilder agentId(String agentId) { log.setAgentId(agentId); return this; }
        public AuditLogBuilder capability(String capability) { log.setCapability(capability); return this; }
        public AuditLogBuilder decision(String decision) { log.setDecision(decision); return this; }
        public AuditLogBuilder policyVersion(String policyVersion) { log.setPolicyVersion(policyVersion); return this; }
        public AuditLogBuilder risk(String risk) { log.setRisk(risk); return this; }
        public AuditLogBuilder approvalId(String approvalId) { log.setApprovalId(approvalId); return this; }
        public AuditLogBuilder correlationId(String correlationId) { log.setCorrelationId(correlationId); return this; }
        public AuditLogBuilder result(String result) { log.setResult(result); return this; }
        public AuditLogBuilder durationMs(Long durationMs) { log.setDurationMs(durationMs); return this; }

        public AuditLog build() {
            return log;
        }
    }
}
