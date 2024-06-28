[![](https://img.shields.io/badge/sfeir.dev-Proxy-green)]()
# Proxy
## Definition
Le design pattern Proxy est un modèle de conception structurel qui fournit un substitut ou un intermédiaire à un autre objet pour contrôler l'accès à cet objet.<br>
En Java, un proxy peut être utilisé pour ajouter une couche d'indirection et d'interception, permettant de modifier ou de contrôler l'accès aux fonctionnalités d'un objet sans en altérer le code source.
## ⚖️ Avantanges et inconvénients
### ➕Avantages
- **Contrôle d'accès** : Le proxy peut contrôler l'accès à l'objet réel, ce qui est utile pour des raisons de sécurité.
- **Réduction des coûts** : Un proxy peut différer la création d'un objet coûteux jusqu'à ce qu'il soit réellement nécessaire.
- **Gestion des ressources** : En utilisant un proxy, les ressources peuvent être gérées plus efficacement, par exemple en instanciant des objets à la demande.
- **Ajout de fonctionnalités** : Il permet d'ajouter des fonctionnalités supplémentaires telles que la journalisation, la gestion des transactions, ou la mise en cache sans modifier l'objet d'origine.
### ➖Inconvénients
- **Complexité accrue** : L'ajout de proxies peut augmenter la complexité du système, rendant le code plus difficile à comprendre et à maintenir.
- **Dégradation des performances** : L'interception des appels de méthode via un proxy peut introduire une surcharge et potentiellement dégrader les performances.
- **Débug plus difficile** : La présence de proxies peut rendre le débogage plus compliqué car il ajoute un niveau d'indirection entre le client et l'objet réel.
## Implementation
