# MPUC Accessibility Backend Add-on

This ZIP contains the backend project from the uploaded MPUC website, with an Accessibility Statement endpoint added.

## Endpoint

- Method: `GET`
- Path: `/api/v1/accessibility/statement`
- Local URL: `http://127.0.0.1:8085/api/v1/accessibility/statement`
- Authentication: Public (added to the existing Spring Security public matcher list)

## Run

1. Configure the MySQL connection and other required environment variables using your existing backend `.env.example` / application configuration.
2. From this folder run: `mvn spring-boot:run`
3. Open the endpoint URL above or test it in Postman.

## React

With the Vite proxy configured for `/api`, call:

```js
axios.get('/api/v1/accessibility/statement')
```

The JSON response follows the existing `ApiResponse` structure, so the payload is in `response.data.data`.

## Notes

- This endpoint serves the statement only; it does not store accessibility feedback in MySQL.
- WCAG 2.1 Level AA is presented as an aim, not a claim of independently verified compliance.
- Existing application files are retained; generated `target` output and uploaded runtime files are excluded from this source ZIP.
