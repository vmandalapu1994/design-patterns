The Strategy design pattern is a behavioral pattern that allows you to define a family of algorithms, 
encapsulate each one of them, and make them interchangeable. It lets the algorithm vary independently 
from clients that use it.

Let's consider a simple example of a sorting algorithm, where we want to be able to switch 
between different sorting strategies (e.g., bubble sort, merge sort, quick sort) without changing the client code.