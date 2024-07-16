# ForoHub APIRest

Esta API REST proporciona endpoints para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre tópicos relacionados con cursos.

## Endpoints Disponibles

### 1. Crear un Nuevo Tópico

- **URL**: `POST /topicos`
- **Descripción**: Crea un tópico.
- **Body JSON de Ejemplo**:
  ```json
  {
    "titulo": "Java para creación de APIRest",
    "mensaje": "Herramientas para programar",
    "fecha": "2024-07-10",
    "usuario": "username",
    "curso": "Spring Boot"
  }

### 2. Mostrar todos los tópicos creados

- **URL**: `/topicos/listado`
- **Método HTTP**: GET
- **Descripción**: Lista los tópicos creado.

### 3. Mostrar un tópico específico

- **URL**: `/topicos/{id}`
- **Método HTTP**: GET
- **Descripción**: Lista un tópico en específico.

### 4. Actualizar un tópico

- **URL**: `/topicos`
- **Método HTTP**: PUT
- **Descripción**: Actualiza un tópico.
- **Body de la Solicitud**: JSON con los campos `id`, `titulo`, `mensaje`, `fecha`, `usuario`, `curso`.

### 5. Eliminar un tópico

- **URL**: `/topicos/{id}`
- **Método HTTP**: DELETE
- **Descripción**: Elimina un tópico.
