# Project1
## About the Project
Project1 is a Spring Boot-based RESTful API for managing items. The API allows users to perform CRUD (Create, Read, Update, Delete) operations on items stored in a MySQL database.
### Set Up
In Spring.io generate a folder by adding necessary details and dependencies per requirement. As prerequisites we need Java, Maven, MySQL. Build the Project, The API was runned at http://localhost:8080/items. 

* MySQL Database:
  * Create a database schema in MySQL, Configure Database in application.properties:
  * `spring.datasource.url=jdbc:mysql://localhost:3306/jpa_project`
  * `spring.datasource.username=user`
  * `spring.datasource.password=password`


  * `spring.jpa.hibernate.ddl-auto=create`
  * `spring.jpa.show-sql=true`
### APIs
```
1. Get All Items
URL: /items
Method: GET
Description: Retrieves a list of all items in the inventory.
Example Request Body:
{
    "itemName":"nikhil",
    "itemDesc":"nn7"
}
Response:
 [
    {
        "itemId": 1,
        "itemName": "priya",
        "itemDesc": "nn7"
    },
    {
        "itemId": 2,
        "itemName": "nikhil",
        "itemDesc": "nn7"
    },
    {
        "itemId": 3,
        "itemName": "nikhil",
        "itemDesc": "nn7"
    },
    {
        "itemId": 4,
        "itemName": "nikhil",
        "itemDesc": "nn7"
    }
]
3. Get Item by ID
URL: /items/getById/{itemId}
Method: GET
Description: Retrieves an item based on its ID.
Example Request:/items/getById/3
Response:
{
    "itemId": 3,
    "itemName": "nikhil",
    "itemDesc": "nn7"
}
4. Get Item by Name
URL: /items/getByName/{itemName}
Method: GET
Description: Retrieves a list of items that match the provided name.
Example Request URL:/items/getByName/Nikhil
Response:
[
    {
        "itemId": 2,
        "itemName": "nikhil",
        "itemDesc": "nn7"
    },
    {
        "itemId": 3,
        "itemName": "nikhil",
        "itemDesc": "nn7"
    },
    {
        "itemId": 4,
        "itemName": "nikhil",
        "itemDesc": "nn7"
    }
]
5. Add a New Item
URL: /items/add
Method: POST
Description: Adds a new item to the inventory.
Example Request Body:
{
    "itemName":"akhil",
    "itemDesc":"nn8"
}
Response:
{
    "itemId": 5,
    "itemName": "akhil",
    "itemDesc": "nn8"
}
6. Update an Item
URL: /items/update/{itemId}
Method: PUT
Description: Updates an existing item by ID.
Example Request API:/items/update/4
Request Body:
{
  "itemName": "Krish",
  "itemDesc": "kk1"
}
Response:
[
    {
        "itemId": 1,
        "itemName": "priya",
        "itemDesc": "nn7"
    },
    {
        "itemId": 2,
        "itemName": "nikhil",
        "itemDesc": "nn7"
    },
    {
        "itemId": 3,
        "itemName": "nikhil",
        "itemDesc": "nn7"
    },
    {
        "itemId": 4,
        "itemName": "Krish",
        "itemDesc": "kk1"
    },
   {
    "itemId": 5,
    "itemName": "akhil",
    "itemDesc": "nn8"
   }
]
8. Delete an Item
URL: /items/delete/{itemId}
Method: DELETE
Description: Deletes an item from the inventory by ID.
Example Request URL:/items/delete/1
```


