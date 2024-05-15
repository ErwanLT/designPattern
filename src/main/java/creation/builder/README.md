# Builder
## Definition
Le design pattern Builder est un modèle de conception qui permet de créer des objets complexes en séparant leur construction de leur représentation. En programmation orientée objet, ce design pattern est couramment utilisé pour créer des objets avec de nombreuses propriétés, en évitant de définir chacune de ces propriétés à chaque fois qu'un nouvel objet est créé.

## ⚖️ Avantanges et inconvénients
### ➕Avantages
- **Lisibilité et Maintenabilité du Code** :
  - Constructeurs Lisibles : Les objets complexes peuvent être créés de manière claire et lisible, avec des noms de méthodes explicites pour chaque attribut, ce qui améliore la compréhension du code.
  - Facilité d'Ajout d'Options : Ajouter de nouvelles options ou attributs est plus simple et ne nécessite pas de modifier les constructeurs existants.
- **Gestion de la Complexité** :
  - Séparation de la Construction et de la Représentation : Le pattern Builder permet de séparer la logique de construction de la logique métier, facilitant ainsi la gestion de la complexité.
  - Réduction des Constructeurs Téléscopiques : Il évite le problème des constructeurs à multiples paramètres (constructeurs télescopiques), ce qui rend le code plus propre et plus maniable.
- **Immutabilité** :
  - Objets Immutables : Il facilite la création d'objets immuables, car tous les paramètres peuvent être définis avant la création de l'objet final, garantissant que l'état de l'objet ne change pas après sa création.
- **Chaining Fluide** :
  - Appels Chaînés : Permet des appels de méthode chaînés (fluent interface), ce qui améliore la lisibilité et réduit le besoin de code répétitif.
### ➖Inconvénients
- **Surcharge Verbale** :
  - Code Verbose : Le pattern Builder peut rendre le code plus verbeux, car il nécessite la définition de classes supplémentaires (le Builder lui-même) et de méthodes pour chaque attribut.
- **Complexité Additionnelle** :
  - Configuration Initiale : La configuration initiale du Builder peut être complexe et prendre du temps, surtout pour des objets simples où un constructeur classique serait suffisant.
- **Duplication de Code** :
  - Duplication Potentielle : Il peut y avoir une certaine duplication de code entre les méthodes du Builder et les méthodes de la classe cible, surtout si les validations ou les transformations sont nécessaires.
- **Performance** :
  - Coût en Mémoire : La création d'un Builder intermédiaire peut introduire un coût en mémoire supplémentaire, ce qui peut être significatif dans des contextes où les objets sont créés fréquemment et rapidement.

## Implementation
![Builder.png](Builder.png)