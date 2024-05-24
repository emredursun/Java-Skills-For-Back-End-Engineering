**Java 9 Modularity**

Familiarize on how to create a modularized component by leveraging Java 9 modules.

Correlating this session to Java 9 Modularity Course, we will create Services component which allow for loose coupling between service consumers modules and service providers modules.

This example has a service consumer module and a service provider module:

- module`com.reactive`exports an API for event driven channels. The API is in package`com.reactive`so this package is exported. The API is plug-able to allow for alternative implementations. The service type is class`com.reactive.api.EventBusProvider`in the same module and thus package`com.reactive.api`is also exported.
- module`org.myCompanyEventBus`is a service provider module. It provides an implementation of`com.reactive.api.EventBusProvider`. It does not export any packages.

Fill in the content of below files for the module`com.reactive`

NOTE:With the current limitation of the coding platform, we can not provide isolation for 2 or more`module-info.java`for our exercise we will rename module-info.java into a relevant text file since what is important would be to familiarize the content of a module-info.java (declaration of a module and exposing packages or declaring required modules. The classes [`EventBus.java, EventBusProvider.java`], on each packages need not to implement methods and instance attributes, it only needs to declare what is its package.

1) com.reactive/module-info.com.reactive.txt
2) com.reactive/com/reactive/EventBus.java
3) com.reactive/com/reactive/api/EventBusProvider.java`

Fill in the content of below files for the module`org.myCompanyEventBus`

NOTE:With the current limitation of the coding platform, we can not provide isolation for 2 or more`module-info.java` for our exercise we will rename module-info.java into a relevant text file since what is important would be to familiarize the content of a module-info.java. (declaration of a module and exposing packages or declaring required modules. The classes [`KafkaEventBus.java, KafkaEventBusProvider.java`] on each packages need not to implement methods and instance attributes, it only needs to declare what is its package.

1) org.myCompanyEventBus/module-info.org.myCompanyEventBus.txt
2) org.myCompanyEventBus/com/myCompanyEventBus/KafkaEventBus.java
3) org.myCompanyEventBus/com/myCompanyEventBus/api/KafkaEventBusProvider.java`


**Hints**

 for the classes it should declare their corresponding packages.

Hint for the module com.reactive

module com.reactive {
<--- export the package that contains the event bus class --->;
<--- export the package that contains the provider (service type) class --->;
<--- modules way of specifying that this module makes use of a specific service type (fully qualified) --->;
}


Hint for the module org.myCompanyEventBus

module org.myCompanyEventBus {
<--- Anounces that this module provides a service type and
also the implementation of that service type --->;
}


**Solution**

The correct answer for the coding exercises is that for the classes to have their designated package declarations.

The correct answer for the module declaration of com.reactive is that it should exports the packages of com.reactive and com.reactive.api because its a service provider module.

module com.reactive {

        exports com.reactive;

        exports com.reactive.api;

}

The correct answer for the module declaration of com.myCompanyEventBus is that it should require the packages exposed through com.reactive module because its a service consumer module.

module org.myCompanyEventBus {

        requires com.reactive;

}   