[![](https://img.shields.io/badge/sfeir.dev-Visiteur-blue)](https://www.sfeir.dev/back/les-design-patterns-comportementaux-visiteur/)
# Visiteur
## Definition
Le design patterns Visiteur est un design pattern comportemental qui permet de séparer l'algorithme des éléments sur lesquels il opère. Il est souvent utilisé lorsque vous avez une structure d'objets complexe et que vous voulez ajouter de nouvelles opérations sans modifier les classes des objets eux-mêmes.

## ⚖️ Avantanges et inconvénients
### ➕Avantages
- **Séparation des préoccupations** : Le pattern Visiteur permet de séparer le comportement des objets de leur structure. Cela facilite la gestion des changements dans le comportement sans modifier les classes des objets.
- **Extensibilité** : Il est facile d'ajouter de nouvelles opérations sur les objets sans modifier leur structure. Vous pouvez simplement créer de nouveaux visiteurs pour implémenter de nouvelles fonctionnalités
- **Maintenabilité** : En raison de sa modularité, le pattern Visiteur rend le code plus facile à comprendre et à maintenir. Chaque visiteur peut être développé et testé indépendamment.
- **Polymorphisme** : Le pattern Visiteur exploite le polymorphisme offert par les langages de programmation orientés objet. Cela permet de traiter différents types d'objets de manière uniforme.
- **Encapsulation** : Le pattern Visiteur encapsule le comportement spécifique à chaque visiteur dans des classes distinctes, ce qui permet de réduire le couplage entre les objets et les opérations.
### ➖Inconvénients
- **Complexité accrue** : L'utilisation du pattern Visiteur peut rendre le code plus complexe, surtout si vous avez un grand nombre de classes à visiter ou de visiteurs à implémenter.
- **Violation du principe d'encapsulation** : Dans certains cas, le pattern Visiteur peut violer le principe d'encapsulation, car il nécessite que les classes à visiter exposent une méthode accept pour accepter le visiteur.
- **Ajout de nouveaux types d'objets** : Si vous devez ajouter de nouveaux types d'objets à visiter, vous devrez modifier l'interface Visitor pour inclure une méthode pour chaque nouveau type, ce qui peut rendre le code plus fragile.
- **Les structures de données complexes** : Le pattern Visiteur peut être moins adapté pour les structures de données complexes, car il peut nécessiter la création de plusieurs visiteurs pour traiter toutes les opérations souhaitées.

## Implementation
![visitor.png](visitor.png)