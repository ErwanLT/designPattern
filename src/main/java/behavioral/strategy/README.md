# Strategie
## Definition
En programmation orientée objet, le design pattern Stratégie définit une famille d'algorithmes, encapsulant chacun d'eux, et les rendant interchangeables. Il permet à un client de choisir un algorithme parmi plusieurs sans modifier la structure du code. Cela favorise la flexibilité et l'extensibilité du code.

## ⚖️ Avantanges et inconvénients
### ➕Avantages
- **Séparation des Comportements** : Les algorithmes sont encapsulés dans leurs propres classes, ce qui sépare clairement les différentes stratégies et réduit le couplage.
- **Interchangeabilité des Algorithmes** : Permet de changer l'algorithme utilisé par un objet au moment de l'exécution sans modifier le code client.
- **Extensibilité** : Il est facile d'ajouter de nouvelles stratégies sans modifier le contexte ou les autres stratégies, suivant le principe ouvert/fermé (Open/Closed Principle).
- **Maintenance Améliorée** : Code Plus Lisible et Organisé: La logique de chaque algorithme est séparée dans des classes distinctes, ce qui rend le code plus lisible et plus facile à maintenir.

### ➖Inconvénients
- **Surcharge de Code** :Peut entraîner la création d'un grand nombre de classes pour chaque stratégie, rendant le projet plus verbeux et potentiellement plus difficile à naviguer.
- **Complexité de Gestion** : La gestion des stratégies peut devenir complexe si de nombreuses stratégies doivent être maintenues ou changées dynamiquement.
- **Dépendance sur le Client** : Le client doit connaître et choisir la stratégie appropriée, ce qui peut ajouter une certaine complexité au niveau de l'implémentation du client.

## Implementation
![strategy.drawio.png](strategy.drawio.png)