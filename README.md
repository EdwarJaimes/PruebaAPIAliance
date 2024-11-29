
# Text Processor API
## Descripcion
Este proyecto es un microservicio desarrollado en Spring Boot que expone una API REST para procesar textos. El servicio permite enviar texto mediante un endpoint HTTP POST, valida el formato, y genera una salida estructurada basada en reglas específicas.

## Caracteristicas.
- Validación de entrada para asegurar que el texto tenga el formato correcto.
- Procesamiento de texto con transformación de datos.
- Respuesta estructurada con la frase procesada y validación del número de palabras.
- Documentación de API generada automáticamente con Swagger UI.
- Health checks (/actuator/health) para monitorear el estado del servicio.
## Requisitos del sistema
- Java: versión 17 o superior.
- Maven o Gradle: para gestionar dependencias.
- Spring Boot: versión 2.7.0 o superiores.
# Text Processor API
## Descripcion
Este proyecto es un microservicio desarrollado en Spring Boot que expone una API REST para procesar textos. El servicio permite enviar texto mediante un endpoint HTTP POST, valida el formato, y genera una salida estructurada basada en reglas específicas.

## Caracteristicas.
- Validación de entrada para asegurar que el texto tenga el formato correcto.
- Procesamiento de texto con transformación de datos.
- Respuesta estructurada con la frase procesada y validación del número de palabras.
- Documentación de API generada automáticamente con Swagger UI.
- Health check para monitorear el estado del servicio.
## Requisitos del sistema
- Java: versión 17 o superior.
- Maven o Gradle: para gestionar dependencias.
- Spring Boot: versión 2.7.0.

## Instalacion y configuracion.
1. Clonar el repositorio:
```bash
git clone https://github.com/EdwarJaimes/PruebaAPIAliance.git
cd text-processor-api
```
2. Configurar dependencias: Si usas Maven:
 ```bash
 mvn clean install
 ```
o con Gradle:
 ```bash
./gradlew build
 ```
3. Ejecutar la aplicacion:
  ```bash
./gradlew bootRun
 ```
4. Acceder a la aplicacion:
- Endpoint de procesamiento: http://localhost:8080/api/v1/process
  Para probar el microservicio, te recomendamos utilizar Postman. Puedes enviar el archivo de
  texto como payload en una solicitud HTTP POST al endpoint del microservicio.
## USO

### Endpoint principal:
- POST `/api/v1/process`
- Descripción: Recibe un texto con formato específico y lo procesa.
- Cuerpo de la solicitud (ejemplo):
 ```bash
    3\the force is strong in this one
    7\take what you can, give nothing back
 ```
- Respuesta de la solicitud (ejemplo)
 ```bash
    [
     {
       "text": "the force is strong in this one",
       "matchesWordCount": false
     },
     {
       "text": "take what you can give nothing back",
       "matchesWordCount": true
     }
    ]
 ```
### Healt checks
- GET /actuator/health : Verifica si el servicio está activo.

### Pruebas
- Ejecutar Pruebas unitarias:
 ```bash
./gradlew test
 ```



