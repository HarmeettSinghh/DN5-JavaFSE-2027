The Factory Method Pattern provides a way to create objects without exposing the object creation logic to the client. Instead of creating objects directly using new, the client requests a factory to create the required object. This promotes loose coupling, making the code easier to extend and maintain.

In this exercise, a common Document interface is implemented by WordDocument, PdfDocument, and ExcelDocument. An abstract DocumentFactory defines the createDocument() method, while each concrete factory (WordFactory, PdfFactory, ExcelFactory) creates a specific document type. The client interacts only with the factories, making it easy to add new document types without modifying existing code.

Singleton	                 Factory Method
Ensures only one object exists	Creates different types of objects
Focuses on object uniqueness	Focuses on object creation
Example: Logger	Example: Document Factory
Returns the same object every time	Returns a new object of the requested type