# java8notes
Lambdas
Lambdas are a new Java language feature that allows us to pass functionality or behavior into methods as parameters.

One example that illustrates the usefulness of Lambdas comes from UI coding. 

When a user clicks on button on a user interface, it usually causes some action to occur in the application. 

In this case, we really want to pass a behavior into the onClick(…) method so that the application will execute the given behavior when the button is clicked. 

In previous versions of Java, we accomplished this by passing an anonymous inner class (that implemented a known interface) into the method. 

Interfaces used in this kind of scenario usually contain only one method which defines the behavior we wish to pass into the onClick(…) method. 

Although this works, the syntax is unwieldy. Anonymous inner classes still work for this purpose, but the new Lambda syntax is much cleaner.


Aggregate Operations
--------------------------

When we use Collections to store objects in our programs, we generally need to do more than simply put the objects in the collection — we need to store, retrieve, remove, and update these objects. Aggregate operations use lambdas to perform actions on the objects in a Collection. For example, you can use aggregate operations to:

- Print the names of all the servers in inventory from a particular manufacturer
- Return all of the servers in inventory older than a particular age
- Calculate and return the average age of Servers in your inventory (provided the Server object has a purchase date field)
- All of these tasks can be accomplished by using aggregate operations along with pipelines and streams. We will see examples of these operations below.

Pipelines and Streams
-------------------------------

A pipeline is simply a sequence of aggregate operations. A stream is a sequence of items, not a data structure, that carries items from the source through the pipeline. Pipelines are composed of the following:

A data source. Most commonly, this is a Collection, but it could be an array, the return from a method call, or some sort of I/O channel.

Zero or more intermediate operations. For example, a Filter operation. Intermediate operations produce a new stream. A filter operation takes in a stream and then produces another stream that contains only the items matching the criteria of the filter.

A terminal operation. Terminal operations return a non-stream result. This result could be a primitive type (for example, an integer), a Collection, or no result at all (for example, the operation might just print the name of each item in the stream).

Some aggregate operations (i.e. forEach) look like iterators, but they have fundamental differences:


Aggregate operations use internal iteration. Your application has no control over how or when the elements are processed (there is no next() method).

Aggregate operations process items from a stream, not directly from a Collection.

Aggregate operations support Lambda expressions as parameters.

Lambda Syntax
--------------

Now that we have discussed the concepts related to Lambda expressions, it is time to look at their syntax. You can think of Lambda expressions as anonymous methods because they have no name. Lambda syntax consists of the following:

A comma-separated list of formal parameters enclosed in parentheses. Data types of parameters can be omitted in Lambda expressions. The parentheses can be omitted if there is only one formal parameter.

The arrow token: ->

A body consisting of a single expression or code block.

Using Lambdas, Streams, and Aggregate Operations

As mentioned in the overview, we’ll demonstrate the use of lambdas, streams, and aggregates by filtering and retrieving Server objects from a List. We’ll look at four examples:

- Finding and printing the names of all the servers from a particular manufacturer.
- Finding and printing the names of all of the servers older than a certain number of years.
- Finding and extracting into a new List all of the servers older than a certain number of years and then printing the names of the servers in the new list.
- Calculating and displaying the average age of the servers in the List.

Let’s get started…

The Server Class

First, we’ll look at our Server class. The Server class will keep track of the following:

- Server name
- Server IP address
- Manufacturer
- Amount of RAM (GB)
- Number of processors
- Purchase date (LocalDate)

Notice (at line 65) that we’ve added the method getServerAge() that calculates the age of the server (in years) based on the purchase date – we’ll use this method when we calculate the average age of the Servers in our inventory.

