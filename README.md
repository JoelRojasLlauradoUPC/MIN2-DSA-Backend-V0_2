# MIN 2 - DSA

Canvis realitzats:
- S'ha afegit el model Team
- S'ha afegit el servei TeamsService:
  - S'ha creat la ruta /teams/ranking
 
Conclusió:
- S'ha implementat tot el que es solicitava en l'EJ1 del MÍN 2.

# Fishing Game Backend API

This backend exposes a simple game API with authentication, catalog, in-game actions, and a shop.

Key endpoints:
- POST /auth/register, POST /auth/login
- GET /catalog/species, GET /catalog/rods
- GET /me, GET /me/inventory
- POST /game/capture
- POST /shop/rods/{rodId}/buy

Implementation notes:
- No DTOs are used. Domain models are returned. Sensitive fields are hidden (User.getPassword annotated with @XmlTransient).
- GameManager is a wrapper and keeps in-memory state. It can be migrated to repositories later.
- Inventory returns unmodifiable maps; it holds equippedRodId and helpers for common game logic.

Tests:
- Existing tests are deprecated and should be updated to match the new structure if needed.

