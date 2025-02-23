# API Documentation

## Base URL
`http://localhost:8080/service`

---

## Endpoints

### 1. **GET** `/getjson`
Retrieve a list of orders in JSON format.

#### Request
- Method: `GET`
- URL: `/getjson`

#### Response
- Status Code: `200 OK`
- Content-Type: `application/json`
- Body:
```json
[
  {
    "id": 0,
    "orderNo": "0000000000",
    "productName": "Product 0",
    "price": 0.0,
    "quantity": 0
  },
  {
    "id": 1,
    "orderNo": "0000000001",
    "productName": "Product 1",
    "price": 1.0,
    "quantity": 1
  },
  {
    "id": 2,
    "orderNo": "0000000002",
    "productName": "Product 2",
    "price": 2.0,
    "quantity": 2
  },
  {
    "id": 3,
    "orderNo": "0000000003",
    "productName": "Product 3",
    "price": 3.0,
    "quantity": 3
  },
  {
    "id": 4,
    "orderNo": "0000000004",
    "productName": "Product 4",
    "price": 4.0,
    "quantity": 4
  }
]
```

---

### 2. **GET** `/getxml`
Retrieve a list of orders in XML format.

#### Request
- Method: `GET`
- URL: `/getxml`

#### Response
- Status Code: `200 OK`
- Content-Type: `application/xml`
- Body:
```xml
<orders>
  <order>
    <id>0</id>
    <orderNo>0000000000</orderNo>
    <price>0.0</price>
    <productName>Product 0</productName>
    <quantity>0</quantity>
  </order>
  <order>
    <id>1</id>
    <orderNo>0000000001</orderNo>
    <price>1.0</price>
    <productName>Product 1</productName>
    <quantity>1</quantity>
  </order>
  <order>
    <id>2</id>
    <orderNo>0000000002</orderNo>
    <price>2.0</price>
    <productName>Product 2</productName>
    <quantity>2</quantity>
  </order>
  <order>
    <id>3</id>
    <orderNo>0000000003</orderNo>
    <price>3.0</price>
    <productName>Product 3</productName>
    <quantity>3</quantity>
  </order>
  <order>
    <id>4</id>
    <orderNo>0000000004</orderNo>
    <price>4.0</price>
    <productName>Product 4</productName>
    <quantity>4</quantity>
  </order>
</orders>
```

---

## Error Codes

- `400 Bad Request`: The request was invalid or missing required parameters.
- `404 Not Found`: The resource could not be found.
- `500 Internal Server Error`: An unexpected error occurred on the server.

---

## Example cURL Requests

### Get Orders (JSON Format):
```bash
curl -X GET http://localhost:8080/service/getjson
```

### Get Orders (XML Format):
```bash
curl -X GET http://localhost:8080/service/getxml
```
