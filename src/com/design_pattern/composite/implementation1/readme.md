Composite design pattern is used to treat individual objects and composition of objects uniformly.


In this example:

1) `Shape` is the Component interface, defining the common interface for Leaf and Composite classes.
2) `Circle` and Rectangle are Leaf classes that implement the Shape interface.
3) `Drawing` is a Composite class that can contain other shapes (both individual shapes and other drawings). It also implements the Shape interface.
4) The main method demonstrates how you can add individual shapes and drawings to a composite drawing and then call the draw method to draw all the shapes.