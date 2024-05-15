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

## [Structurel](src/main/java/structural)
Les Design Patterns structurels se concentrent sur la manière dont les classes et les objets sont structurés pour former des architectures logicielles plus flexibles et plus facile à maintenir. Ils facilitent la composition d'objets pour créer des structures plus complexes tout en minimisant les dépendances entre les différents éléments du système.
