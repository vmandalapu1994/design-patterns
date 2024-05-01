**Example: Internet Access Proxy**

Suppose you have an interface Internet representing the ability to access the internet, and a RealInternet class that implements this interface to provide real internet access. However, you want to control access to certain websites and monitor internet usage. You can use a proxy to achieve this.

In this example:

* `Internet` is the interface that defines the operations for accessing the internet.
* `RealInternet` is the real object that provides actual internet access. It implements the Internet interface.
* `InternetProxy` is the proxy object that controls access to the real internet. It checks if the website is allowed before allowing the connection and logs access. It also forwards the request to the real internet if the website is allowed.
* The client code creates an instance of InternetProxy instead of RealInternet. When connectTo is called, the proxy decides whether to allow the connection or block it based on the website being accessed.

This example demonstrates how the Proxy pattern can be used to add additional functionality such as access control and logging without modifying the core functionality of the real object.