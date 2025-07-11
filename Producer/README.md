# Spring Cloud Contract Demo

This project demonstrates the use of Spring Cloud Contract for contract testing in a Spring Boot application. It showcases both producer and consumer-side contract testing for RESTful endpoints.

## Features

- Contract-based testing using Spring Cloud Contract
- Contract definitions written in Groovy DSL
- Support for both successful and error scenarios
- Integration with Spring Boot

## Contract Examples

### GET Orders
- Endpoint: `/v1/orders`
- Returns a list of orders with UUID and value
- Validates UUID format and double value
- Response: 200 OK

### POST Order (Valid)
- Endpoint: `/v1/orders`
- Accepts order value between 0.00 and 10,000.00
- Creates new order with generated UUID
- Response: 201 CREATED

### POST Order (Invalid)
- Endpoint: `/v1/orders`
- Validates order value constraints
- Returns error message for invalid values
- Response: 400 BAD_REQUEST

## Contract Structure

Contracts are located in `src/contractTest/resources/contracts/`:
- `getOrders.groovy`: Contract for GET /v1/orders
- `postOrders.groovy`: Contract for successful POST /v1/orders
- `postOrdersBadRequest.groovy`: Contract for invalid POST /v1/orders

## Technology Stack

- Spring Boot
- Spring Cloud Contract
- Kotlin
- Groovy (for contract definitions)

## Project Structure

```
src/
├── main/
│   └── kotlin/  # Main application code
└── contractTest/
    └── resources/
        └── contracts/  # Contract definitions
```

## Running the Application

1. Build the project:
```bash
./gradlew build
```

2. Run the application:
```bash
./gradlew bootRun
```

## Testing

Contract tests are automatically generated and run during the build process. The tests ensure that the producer's implementation matches the contract definitions.
