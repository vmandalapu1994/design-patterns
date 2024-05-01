**Real life examples of Adapter Design Pattern -:**
The Adapter pattern can be applied in various scenarios. Here are a few real-world examples:

a) Database Adapters: When working with different database systems, each may have its own specific API. An adapter can be used to convert the operations and queries from one database system to another, allowing the client code to work with a common interface.

b) Legacy System Integration: When integrating new software components with existing legacy systems, the Adapter pattern can be used to translate the legacy system’s interface into a more modern and compatible one.

c) Plug Adapters: In electrical systems, different countries may have different types of electrical outlets. Plug adapters allow devices with one type of plug to be used with different outlet types by adapting the plug to fit the specific outlet.

d) Java’s InputStreamReader and OutputStreamWriter : The java.io.InputStreamReader and java.io.OutputStreamWriter classes act as adapters that convert an InputStream into a Reader and an OutputStream into a Writer, respectively. These adapters allow for seamless data conversion between different formats, making it easier to work with various types of input and output streams.

e) Java’s Arrays.asList() Method :The java.util.Arrays.asList() method is another example of the Adapter Design Pattern in action. This method converts an array into a List object, allowing for easier manipulation and processing of the data.

Benefits and Drawbacks of the Adapter Pattern -:
Benefits -:
Promotes code reusability by adapting existing components instead of rewriting them.
Enables collaboration between incompatible interfaces, fostering interoperability.
Allows the client code to work with a common interface, regardless of the underlying implementation.
Drawbacks -:
Can introduce additional complexity if not used judiciously.
May result in performance overhead due to the translation between interfaces.
Increases the number of classes and complexity in the codebase.
