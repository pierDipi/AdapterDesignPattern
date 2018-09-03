# Adapter Design Pattern

___

Adapter Design Pattern

> **Convert the interface of a class into another interface clients expect. 
  Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.** 
  
  
___  


> **Applicability** 
> * Use the Adapter pattern when :
>   * You want to use an existing class, and its interface does not match the one you need.
>   * you want to create a reusable class that cooperates with unrelated or unforeseen classes, that is, classes that don't necessarily have compatible interfaces. 
>   * (object adapter only) you need to use several existing subclasses, but it's impractical to adapt their interface by subclassing every one. An object adapter can adapt the interface of its parent class. 


___


### Example

* Java example (**Book**)

![UML diagram.](/uml/AdapterExample.jpg)


___


### Usage

```java
Person person = new Person();
		
person.read(new Book("Book"));		// Use compatible classes
person.turnPage();
person.turnPage();
		
person.read(new EReaderAdapter(new Kindle("Kindle book"))); // Use incompatible classes and adapt them.
person.turnPage();
person.turnPage();
person.turnPage();

```
### Output

```
Open the book : Book
Book: go to the next page : 1
Book: go to the next page : 2
Turn on the kindle : Kindle book
Kindle book: go to the next page : 1
Kindle book: go to the next page : 2
Kindle book: go to the next page : 3
```

___


#### Credits 
* [Book](https://en.wikipedia.org/wiki/Design_Patterns)


