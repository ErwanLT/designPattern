[![](https://img.shields.io/badge/sfeir.dev-Singleton-purple)](https://www.sfeir.dev/back/design-pattern-singleton/)
# Singleton
## Definition
En programmation orientée objet, le design pattern Singleton est utilisé pour s'assurer qu'une classe ne possède qu'une seule instance et pour fournir un point d'accès à cette unique instance.

## ⚖️ Avantanges et inconvénients
### ➕Avantages
- **Contrôle d'Accès** :
    - Instance Unique: Assure qu'il y a une seule instance d'une classe, ce qui est utile pour des ressources partagées comme une connexion à une base de données ou un fichier de configuration.
    - Point d'Accès Centralisé: Fournit un point d'accès global à cette instance, ce qui simplifie la gestion des ressources partagées.
- **Facilité de Maintenance** :
    - Gestion Simple des Ressources: Centralise la gestion des ressources, ce qui peut simplifier le code et réduire les bugs liés à la gestion de ces ressources.
    - Initialisation à la Demande: Peut initialiser l'instance unique seulement lorsqu'elle est nécessaire (lazy initialization), ce qui peut améliorer les performances.
- **Contrôle de l'Accès Concurentiel** :
    - Synchronisation: Permet de contrôler l'accès concurrentiel à la ressource partagée, bien que cela doive être soigneusement géré pour éviter les problèmes de performance.
### ➖Inconvénients
- **Difficultés de Test** :
    - Tests Unitaires Compliqués: Les singletons peuvent rendre les tests unitaires plus difficiles, car ils introduisent une dépendance globale qui peut être difficile à isoler.
    - Mocking Complexe: Difficile à moquer pour les tests, rendant les tests de composants dépendants du singleton plus complexes.
- **Caché les Dépendances** :
    - Dépendances Cachées: Peut cacher les dépendances des classes, rendant le système plus difficile à comprendre et à maintenir.
    - Coupure de la Modularité: Peut violer le principe de responsabilité unique en gérant à la fois la création de l'instance et la logique métier.
- **Problèmes de Concurrence** :
    - Synchronisation Coûteuse: La synchronisation nécessaire pour garantir une seule instance peut être coûteuse en termes de performance, surtout dans les environnements multi-thread.
    - Initialisation à la Demande: La gestion correcte de l'initialisation à la demande (lazy initialization) peut être complexe et sujette aux erreurs.
- **Problèmes de Mémoire** :
  - Garbage Collection: Les singletons peuvent empêcher la collecte des déchets de la mémoire (garbage collection), car l'instance unique peut être maintenue en vie plus longtemps que nécessaire.

## Implementation
![singleton.png](singleton.png)