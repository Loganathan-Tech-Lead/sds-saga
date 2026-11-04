package com.example.sds;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

/** Entry point for the "Saga (checkout flow)" demo. Replace with the real implementation (see TODO.md). */
@RestController
public class SagaController {
    @GetMapping("/demo/saga")
    public Map<String, String> demo() {
        return Map.of("concept", "Saga (checkout flow)", "status", "scaffold - implement me");
    }
}
