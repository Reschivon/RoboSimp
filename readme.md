# Robot Simulator
## Future Software Division 2021
An exercise of Git and cooperation

Link to doc of specifications [Here]
https://docs.google.com/document/d/1VVhSrgWwDnfUjVF9tT6lh-mtl9sm6oMbe_J9YvOLEMw/edit

###Proof that you can make anything sound good in the ENB

We implement a pure pursuit based target following algorithm. We also implement wheel simulators and global state to provide an environment for the algoithm to be tested in.

We structure the code in nodes, with each node performing one task, having clear input and output points to minimize coupling.

Nodes:
- Global State
- Motor simulation
- Pursuit Controller
- Display
- UI

If for some reason you feel the need to question a simple and innocent project like this, please contact future14473@gmail.com