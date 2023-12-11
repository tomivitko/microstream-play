Get all from DB:

```GET http://localhost:8080/api```

###
Add record to DB:

```
POST http://localhost:8080/api
Content-Type: application/json

{
"name": "Book title",
"year": 1999,
"author": {"firstName": "John", "lastName": "Doe", "year": 1990},
"test": "test"
}
```