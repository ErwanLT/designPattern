[![](https://img.shields.io/badge/sfeir.dev-Adapter-green)]()
# Adaptateur
## Definition
Le design pattern Adaptateur est un modèle structurel qui permet à des interfaces incompatibles de collaborer entre elles. Il agit comme un intermédiaire qui convertit l'interface d'une classe en une autre interface attendue par le client.

Ce design pattern définit un adaptateur qui enveloppe l'objet à adapter, fournissant ainsi une interface conforme aux attentes du client. De cette manière, le client peut utiliser l'adaptateur comme s'il s'agissait de l'interface originale, sans connaître les détails de l'implémentation sous-jacente.

Chaque adaptateur implémente l'interface attendue par le client et utilise l'objet à adapter pour répondre aux appels de méthode. Cela permet d'intégrer des composants existants dans de nouvelles architectures sans avoir à les modifier, favorisant ainsi la réutilisation du code et la compatibilité entre différentes parties d'un système logiciel.
## ⚖️ Avantanges et inconvénients
### ➕Avantages
- **Réutilisation de code existant** : L'adaptateur permet d'intégrer des classes ou des composants existants dans de nouveaux systèmes sans avoir à les modifier, ce qui favorise la réutilisabilité du code.
- **Inter-opérabilité entre interfaces incompatibles** : Il facilite la collaboration entre des classes ou des systèmes qui ont des interfaces incompatibles, en fournissant une interface commune pour la communication.
- **Séparation des préoccupations** : L'adaptateur isole le client des détails d'implémentation de la classe adaptée, ce qui permet de maintenir une meilleure séparation des préoccupations dans le code.
- **Facilite l'évolution du système** : En utilisant des adaptateurs, il devient plus facile d'ajouter de nouvelles classes ou de modifier les classes existantes sans impacter le reste du système.
### ➖Inconvénients
- **Complexité accrue** : L'ajout d'adaptateurs peut introduire de la complexité supplémentaire dans le système, notamment lorsqu'il y a plusieurs adaptateurs pour différentes classes ou interfaces.
- **Surcharge de l'interface** : Si de nombreux adaptateurs sont utilisés, cela peut entraîner une surcharge d'interfaces et une difficulté à maintenir une cohérence dans tout le système.
- **Indirection supplémentaire** : L'utilisation d'adaptateurs peut introduire une indirection supplémentaire lors de l'appel de méthodes, ce qui peut affecter les performances dans certains cas.
- **Potentiel de mauvaise conception** : Si mal utilisé, le pattern Adaptateur peut conduire à une mauvaise conception logicielle, notamment si l'adaptation est faite de manière excessive ou peu claire.
## Implementation
![adapter.png](adapter.png)