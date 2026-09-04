CREATE TABLE audit_logs (
    id UUID PRIMARY KEY,
    timestamp TIMESTAMP NOT NULL,
    actor_id VARCHAR(255) NOT NULL,
    agent_id VARCHAR(255) NOT NULL,
    capability VARCHAR(255) NOT NULL,
    decision VARCHAR(50) NOT NULL,
    policy_version VARCHAR(50),
    risk VARCHAR(50),
    approval_id VARCHAR(255),
    correlation_id VARCHAR(255) NOT NULL,
    result VARCHAR(255),
    duration_ms BIGINT
);
