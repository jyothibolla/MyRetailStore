1) This MyRetailStore application has data models.
Datamodels: Product, CurrentPrice
CurrentPrice object is embedded in Product object

2) Future Enhancements: 
We can give another service to retrieve all the products exists in the database.
Removing a Product from the DB also can be implemented. 

3) Running MyRetailStore Application
Pre-requisites:
MongoDB should be up and running on local machine.
Run the spring boot application as specified below.
RightClick on the project ->run as -> maven build -> Goal is "spring-boot:run"
OR
RightClick on the MyRetailStoreApplication.java -> Run As -> Java Application

Rest API applications like postman or Application REST Client can be used 
to test the created REST API services in the MyRetailStore application

===========API USAGE==================
(i) POST:
URI: http://localhost:8080/products/post/
Sample RequestData: {"id":13860427,"current_price":{"value": 24.99,"currency_code":"USD"}}
Sample Response:
{
"message": "Product details are stored successfully"
"product details saved": {
"id": "13860427"
"name": ""Conan the Barbarian""
"current_price": {
"value": "24.99"
"currency_code": "USD"
}-
}-
}


(ii)GET
URI: http://localhost:8080/products?id=13860427
Response:
{
"id": "13860427"
"name": ""Conan the Barbarian""
"current_price": {
"value": "24.99"
"currency_code": "USD"
}-
}


(iii) PUT
URI: http://localhost:8080/products/13860427
Sample Request Payload: {"value": "29.49","currency_code":"USD"}
Sample Response:
{
  "message": "Product details are updated successfully",
  "product details updated": {
    "id": "13860427",
    "name": "\"Conan the Barbarian\"",
    "current_price": {
      "value": "29.49",
      "currency_code": "USD"
    }
  }
}

4) Download, Install and Configure MongoDB
i) Download & Install MongoDB
ii) create mongod.conf to give dbpath & log file path and other configurations
	Run
	./mongod --config mongod.conf
	to start up the MongoDB


 











	