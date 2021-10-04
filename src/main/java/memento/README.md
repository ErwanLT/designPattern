# Factory
## Definition
`The Memento Design Pattern offers a solution to implement undoable actions. We can do this by saving the state of an object at a given instant and restoring it if the actions performed since need to be undone.`

## Where to use
Typically, the Memento Design Pattern will be used in situations where some actions are undoable, therefore requiring to rollback to a previous state. However, if the state of the Originator is heavy, using the Memento Design Pattern can lead to an expensive creation process and increased use of memory.