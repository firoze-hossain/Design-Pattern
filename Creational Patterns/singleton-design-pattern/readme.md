<h2>Singleton</h2><br/>
<b>Singleton</b> is a creational design pattern, which ensures that only one object of its kind exists and provides a single point of access to it for any other code.<br/>
<img src="https://github.com/firoze-hossain/Design-Pattern/blob/master/Creational%20Patterns/singleton-design-pattern/src/image/singleton.png" alt="Singleton" title="singleton"><br/>
<b>Purpose of Singleton</b><br/>
The purpose of the Singleton class is to control object creation, limiting the number of objects to only one.
The singleton allows only one entry point to create the new instance of the class.<br/>

Since there is only one Singleton instance, any instance fields of a Singleton will occur only once per class, just like static fields. 
Singletons are often useful where you have to control the resources, such as database connections or sockets.<br/>

It seems to be a simple design pattern but when it comes to implementation, it comes with a lot of implementation concerns. 
The implementation of Singleton pattern has always been a controversial topic among developers. Here, you are going to discuss how to create a Singleton class that fulfills its purpose :<br/>

<b>Restrict the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine.</b><br/>

<b>Forms of Singleton</b><br/>
There are two forms of singleton design pattern:<br/>

==>Eager Instantiation: creation of instance at load time.<br/>
In eager initialization, the instance of Singleton Class is created at the time of class loading, this is the easiest method to create a Singleton class.

By making the constructor as private you are not allowing other class to create a new instance of the class you want to create the Singleton. 
Instead, you are creating one public static method (commonly name as for getInstance()) to provide the single entry point to create the new instance of the class.<br/>
This approach has one drawback. Here instance is created even though client application might not be using it. This might be a considerable issue if your
Singleton class in creating a database connection or creating a socket. This may cause the memory leak problem. The solution is to create the new instance of the class, when needed.
This can be achieved by Lazy Initialization method.<br/>

==>Lazy Instantiation: creation of instance when required.<br/>
Opposite to Eager initialization, here you are going to initialize new instance of the class in getInstance() method it self. This method will check if there is any instance of that class is already created? If yes, then our method (getInstance()) will return that old instance and if not then it creates a new instance of the singleton class in JVM and returns that instance.
This approach is called as Lazy initialization.<br/>

<b>Usage of Singleton design pattern</b><br/>
==>Singleton pattern is mostly used in multi-threaded and database applications. 
It is used in logging, caching, thread pools, configuration settings etc.<br/>
<b>Structure</b><br/>
<img src="https://github.com/firoze-hossain/Design-Pattern/blob/master/Creational%20Patterns/singleton-design-pattern/src/image/structure.png" alt="Structure" title="structure"><br/>
The Singleton class declares the static method getInstance that returns the same instance of its own class.<br/>
The Singleton’s constructor should be hidden from the client code.
Calling the getInstance method should be the only way of getting the Singleton object.<br/>

<b>Create Singleton Design Pattern</b><br/>
To create the singleton class, we need to have static member of class, private constructor and static factory method.<br/>

==><b>Static member:</b> It gets memory only once because of static, itcontains the instance of the Singleton class.<br/>
==><b>Private constructor:</b>  It will prevent to instantiate the Singleton class from outside the class.<br/>
==><b>Static factory method:</b>  This provides the global point of access to the Singleton object and returns the instance to the caller.<br/>
<b>Advantage of Singleton design pattern</b><br/>
==>Saves memory because object is not created at each request. Only single instance is reused again and again.<br/>