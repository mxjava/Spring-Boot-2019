# Spring-Boot-2019

# API Gas Payments

Test Spring boot - 

mvn clean install

mvn spring-boot:run

# Swagger ui
http://localhost:8080/swagger-ui.html

# Example Request - gasolineRq


{
	"email" : "info@srpago.com",
	"name" : "Juan",
	"lastName" : "Perez",
	"cardNumber" : "4242424242424242",
	"expirationDateYear" : 2020,
	"expirationDateMonth" : 12,
	"gasType" : "587fbd68edfe99480a072f16",
	"amount" : 350.00,
	"gasStation" : 1,
	"sellerName" : "Pedro Perez"
}


# Example Response

{
  "success": true,
  "error": "null",
  "message": "“Informacion correcta”"
}

#  Request URL

http://localhost:8080/api/v1/gasolines

# CURL

curl -X POST "http://localhost:8080/api/v1/gasolines" -H  "accept: */*" -H  "Content-Type: application/json" -d "{\t\"email\" : \"info@srpago.com\",\t\"name\" : \"Juan\",\t\"lastName\" : \"Perez\",\t\"cardNumber\" : \"4242424242424242\",\t\"expirationDateYear\" : 2020,\t\"expirationDateMonth\" : 12,\t\"gasType\" : \"587fbd68edfe99480a072f16\",\t\"amount\" : 350.00,\t\"gasStation\" : 1,\t\"sellerName\" : \"Pedro Perez\"}"


