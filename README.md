[![](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/ "java")
![](https://img.shields.io/badge/-French-blue?style=for-the-badge)

# Design Patterns
Les Design Patterns en programmation, représentent des bonnes pratiques de conception de code qui offrent des solutions réutilisables pour résoudre des problèmes communs. Ils permettent de structurer le code de manière à favoriser la réutilisation , la flexibilité et la facilité de maintenance. Ces modèles de conception sont le résultat de l'expérience collective des développeurs et sont présentés sous forme de solutions éprouvées à des problèmes récurrents dans le développement logiciel. Les design patterns ne sont pas des solutions prêtes à l'emploi, mais des schémas à adapter selon les besoins spécifiques de chaque projet.

Les Design Patterns sont regroupés en 3 grandes familles :

## [Création](src/main/java/creation)
Les Design Patterns de Création sont un ensemble de design patterns qui permettent de créer des objets d'une manière qui soit flexible, modulaire et qui facilite leur réutilisation. Ils sont utilisés pour résoudre des problèmes de conception liés à la création d'objets.

Les designs pattern de création les plus utilisés sont les suivants :
- **[Factory](src/main/java/creation/factory)** : En programmation orientée objet, le design pattern factory est un pattern de création qui utilise des méthodes de fabrication pour résoudre le problème de création d'objets sans avoir à spécifier la classe exacte de l'objet à créer. On utilise une interface ou une classe abstraite pour définir une méthode de création qui est implémentée par les sous-classes pour créer des objets de différentes classes. Ainsi, le Factory Method permet de créer des objets sans connaitre leur implémentation.
- **[Builder](src/main/java/creation/builder)** : Le design pattern Builder est un modèle de conception qui permet de créer des objets complexes en séparant leur construction de leur représentation. En programmation orientée objet, ce design pattern est couramment utilisé pour créer des objets avec de nombreuses propriétés, en évitant de définir chacune de ces propriétés à chaque fois qu'un nouvel objet est créé.
- **[Prototype](src/main/java/creation/prototype)** : En programmation orientée objet, le design pattern Prototype est utilisé lorsque la création d'une instance est complexe ou consommatrice en temps. Plutôt que créer plusieurs instances de la classe, on copie la première instance et on modifie la copie de façon appropriée.
- **[Singleton](src/main/java/creation/singleton)** : En programmation orientée objet, le design pattern Singleton est utilisé pour s'assurer qu'une classe ne possède qu'une seule instance et pour fournir un point d'accès à cette unique instance.

## [Comportementaux](src/main/java/behavioral)
Les Design Patterns comportementaux, en programmation, représentent des solutions éprouvées aux problèmes récurrents liés à la communication entre les objets et les responsabilités de ces objets. Ces design patterns se concentrent sur la manière dont les objets interagissent et communiquent entre eux.

Les designs patterns comportementaux les plus utilisés sont les suivants :

- **[Strategie](src/main/java/behavioral/strategy)** : En programmation orientée objet, le design pattern Stratégie définit une famille d'algorithmes, encapsulant chacun d'eux, et les rendant interchangeables. Il permet à un client de choisir un algorithme parmi plusieurs sans modifier la structure du code. Cela favorise la flexibilité et l'extensibilité du code.
- **[Mémento](src/main/java/behavioral/memento)** : Le pattern Memento, un modèle de conception comportementale, offre la possibilité de sauvegarder et de rétablir l'état interne d'un objet sans compromettre son encapsulation. En Java, ce pattern est fréquemment employé pour mettre en place des fonctionnalités de sauvegarde et de restauration d'état dans les applications.
- **[Médiateur](src/main/java/behavioral/mediator)** : Le pattern Médiateur est un design pattern comportemental qui favorise le couplage lâche en définissant un objet qui encapsule la manière dont un ensemble d'objets interagit. Plutôt que de permettre à ces objets de communiquer directement entre eux, ils communiquent uniquement à travers le médiateur. Cela réduit la dépendance entre les objets et facilite la modification et l'extension du système, car les interactions sont centralisées dans le médiateur.
- **[Observateur](src/main/java/behavioral/observer)** : Le design Pattern Observateur fait partie de la famille des design patterns comportementaux.
Il définît une relation observateurs / observé où l’observé informe de tout changement ses observateurs via l’une de leurs méthodes.
- **[Chaine de responsabilité](src/main/java/behavioral/chainResponsability)** : Le design pattern Chaîne de responsabilité est un modèle comportemental qui permet de traiter une requête à travers une série de gestionnaires, sans connaître à l'avance quel gestionnaire va la traiter.
Chaque gestionnaire possède une référence vers le gestionnaire suivant dans la chaîne. Lorsqu'une requête est envoyée à la chaîne, chaque gestionnaire décide s'il peut la traiter ou s'il doit la transmettre au gestionnaire suivant.
- **[Commande](src/main/java/behavioral/command)** : Le design pattern Commande est une approche qui prend une action à réaliser et la convertit en un objet autonome qui encapsule tous les détails de cette action. Cette conversion permet de paramétrer des méthodes avec différentes actions, de planifier leur exécution, de les mettre en file d'attente ou d'annuler des opérations déjà effectuées.
- **[Etat](src/main/java/behavioral/state)** : Le design pattern État est un design pattern comportemental qui permet à un objet de modifier son comportement en fonction de son état interne.
Plutôt que de gérer directement les transitions entre les différents états, l'objet délègue cette responsabilité à des objets État spécialisés.
Chaque objet État encapsule le comportement spécifique à un état particulier, ce qui permet à l'objet principal de déléguer dynamiquement ses actions en fonction de son état actuel.
- **[Visiteur](src/main/java/behavioral/visitor)** : Le design patterns Visiteur est un design pattern comportemental qui permet de séparer l'algorithme des éléments sur lesquels il opère. Il est souvent utilisé lorsque vous avez une structure d'objets complexe et que vous voulez ajouter de nouvelles opérations sans modifier les classes des objets eux-mêmes.
- **[Interpréteur](src/main/java/behavioral/interpretor)** : Le design pattern Interpréteur est un modèle comportemental qui permet d'interpréter ou d'évaluer un langage ou une grammaire. Il définit une représentation grammaticale d'une langue donnée, ainsi qu'un interpréteur qui utilise cette représentation pour interpréter les phrases de cette langue.
Chaque élément de la grammaire est représenté par une classe, et les combinaisons d'éléments sont interprétées par des méthodes spécifiques de ces classes. Lorsqu'une expression est passée à l'interpréteur, il utilise la représentation grammaticale pour interpréter et évaluer l'expression selon les règles définies par la grammaire.

## [Structurel](src/main/java/structural)
Les Design Patterns structurels se concentrent sur la manière dont les classes et les objets sont structurés pour former des architectures logicielles plus flexibles et plus facile à maintenir. Ils facilitent la composition d'objets pour créer des structures plus complexes tout en minimisant les dépendances entre les différents éléments du système.


## ⁉️Plus d'informations
Si jamais vous chercher plus d'informations sur comment fonctionne ces design patterns, je vous invite à vous rendre [ici](https://www.sfeir.dev/author/erwan/), vous y trouverez mes différents articles reprenant le code présent dans ce repository et expliquant en détail son fonctionnement.