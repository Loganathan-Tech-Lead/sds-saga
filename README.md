# 25. Saga (checkout flow)

**Category:** Resilience and consistency  |  **Status:** Scaffold - implement the TODOs

Orchestrated saga with compensations.

## Sequence
```mermaid
sequenceDiagram
    participant Order
    participant Inventory
    participant Payment
    Order->>Inventory: reserve
    Order->>Payment: authorize
    Payment->>Order: 402 CARD_DECLINED
    Order->>Inventory: release (compensate)
```

## Run
```bash
docker compose up -d
mvn spring-boot:run
```

## Part of
[system-design-concepts-master](../../README.md) - see the master repo for the full concept map.
