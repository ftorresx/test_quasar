# test_quasar
Se desarrolla un aplicativo con servicios Rest el cual realiza unas operaciones matematicos y de logica para calcular las coordenadas de una nave espacial que envia informacion(distancias y mensajes) a 3 satelites que se encuentran en una posición fija

Para desarrollar dicho aplicativo se utilizó lenguaje "Java" con el entorno de desarrollo "Intellij", el framework Springboot(el cual tiene embebido un servidor de aplicación "Tomcat").
Se realizaron pruebas con la herramienta "Postman" para verificar las entradas y salidas de este aplicativo REST.
Además se construyó la imagen de la aplicacion con "Docker" y se publicó a traves de "AWS"

## Ejecución del programa
Despues de descargado el proyecto a traves de comandos de GIT, se importa en el entorno de desarrollo(a traves del cual se actualizan dependencias de gradle) y despues se ejecuta simplemente con el boton "RUN"
{Cabe resaltar que es necesario tener instalado Java8 en el ambiente donde se probará de manera local}

### Pruebas locales
Es necesario instalar la herrmienta "Postman" y configurar tanto la url(http://localhost/topsecret) como el request a enviar:
```
{
    "satellites": [
        {
            "name": "kenobi",
            "distance": 70.00,
            "message": [
                "este",
                "",
                "",
                "mensaje",
                ""
            ]
        },
        {
            "name": "skywalker",
            "distance": 430.00,
            "message": [
                "",
                "es",
                "",
                "",
                "secreto"
            ]
        },
        {
            "name": "sato",
            "distance": 670.00,
            "message": [
                "este",
                "",
                "un",
                "",
                ""
            ]
        }
    ]
}
```
Cabe resaltar que se obtienen los codigos de respuesta 200(OK) y 404(Response not found ó algun error por data erronea en el aplicativo) para los servicios REST. 

### Pruebas con IP pública
Con la herramienta "Postman" o si se desea otra herramienta similar(ejemplo SOAPUI)
Se configura la URL de AWS(http://ec2-18-191-144-114.us-east-2.compute.amazonaws.com/topsecret) 
y el request a enviar(se utiliza el mismo del ítem anterior)


