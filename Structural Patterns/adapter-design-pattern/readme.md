<b>Definition of Adapter Pattern</b><br/>

<b>Adapter design pattern</b> is one of the <b>structural design pattern </b> and its used so that two unrelated interfaces can work together. 
The object that joins these unrelated interface is called an Adapter.<br/>

An Adapter pattern acts as a connector between two incompatible interfaces that otherwise cannot be connected directly.
An Adapter wraps an existing class with a new interface so that it becomes compatible with the client’s interface.<br/>

<img src="https://github.com/firoze-hossain/Design-Pattern/blob/master/Structural%20Patterns/adapter-design-pattern/out/production/adapter-design-pattern/image/adapter.png" alt="Adapter" title="adapter"><br/>

The main motive behind using this pattern is to convert an existing interface into another interface that the client expects.
It’s usually implemented once the application is designed.<br/>

<b>Example of Adapter Pattern</b><br/>
<img src="https://github.com/firoze-hossain/Design-Pattern/blob/master/Structural%20Patterns/adapter-design-pattern/out/production/adapter-design-pattern/image/adapteruml.jpg" alt="AdapterUML" title="adapteruml"><br/>

<b>UML for Adapter Pattern:</b><br/>
There are the following specifications for the adapter pattern:<br/>

==>Target Interface: This is the desired interface class which will be used by the clients.<br/>
==>Adapter class: This class is a wrapper class which implements the desired target interface and modifies the specific request available from the Adaptee class.<br/>
==>Adaptee class: This is the class which is used by the Adapter class to reuse the existing functionality and modify them for desired use.<br/>
==>Client: This class will interact with the Adapter class.<br/>

<b>When to Use Adapter Pattern</b><br/>
==> When an outside component provides captivating functionality that we’d like to reuse, but it’s incompatible with our current application. A suitable Adapter can be developed to make them compatible with each other<br/>
==>When our application is not compatible with the interface that our client is expecting<br/>
==>When we want to reuse legacy code in our application without making any modification in the original code<br/>

<b>Advantages</b> <br/>
It allows two or more previously incompatible objects to interact. <br/>
It allows reusability of existing functionality and flexibility.<br/>
Client class is not complicated by having to use a different interface and can use polymorphism to swap between different implementations of adapters.<br/>
