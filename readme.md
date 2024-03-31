### Endpoints
- **GET /students**: Retrieve a list of all students.
```json
  {
    "id": 1,
    "name": "Tushar",
    "email": "tk@gmail.com",
    "phone": "1234567890"
  }
  ```
- **GET /students/{id}**: Retrieve details of a specific student by ID.
- **POST /students**: Create a new student record.
```json
  {
    "name": "Tushar",
    "email": "tk@gmail.com",
    "phone": "1234567890"
  }
  ```
- **PUT /students/{id}**: Update an existing student record. The request body should be a JSON object with the same structure as the POST /students endpoint.
- **DELETE /students/{id}**: Delete a student record.
