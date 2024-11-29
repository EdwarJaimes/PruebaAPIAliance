package com.example.TextProcessorAPI;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        boolean allSystemsOperational = checkSystemHealth();

        if (allSystemsOperational) {
            return Health.up().withDetail("custom", "All systems are operational").build();
        } else {
            return Health.down().withDetail("custom", "Some systems are not operational").build();
        }
    }

    private boolean checkSystemHealth() {
        //verificar health
        return true;
    }
}
