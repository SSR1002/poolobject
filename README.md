poolobject
==========


[![codecov](https://codecov.io/gh/SSR1002/poolobject/branch/master/graph/badge.svg)](https://codecov.io/gh/SSR1002/poolobject)


Java code example of  design creational pattern pool object

Example to apply good practise in software developmemnt: test and mesurement.

## Objetivos específicos

 - Comprender los objetivos de medición relacionados con la caracterización y la evaluación deproductos, procesos y recursos software

 - Comprender, aplicar y analizar técnicas de medición sobre entidades de productos softwarerelacionados con conjuntos de pruebas de software

 - Comprender, aplicar y analizar medidas relacionadas sobre entidades de proceso y recursos deprueba del software
 
## Enunciado
En la práctica se va simular un pequeño desarrollo de un producto software para realizar mediciones sobre él.El objetivo es establecer un caso de estudio que sirva para caracterizar y evaluar tanto el producto desarrollado como el proceso seguido.

### (a) Descripción del producto
Dado un código de ejemplo del patrón diseño creacional Pool Object, se debe crear una batería de pruebas talque las coberturas de sus clases sean del 100%. El código de las clases se puede obtener en el repositorio https://github.com/clopezno/poolobject. La batería de pruebas JUnit debe estar contenida en la `claseubu.gii.dass.test.c01.ReuseblePoolTest.java`.

### (b) Descripción del proceso
El proceso de desarrollo de la batería de pruebas se va a gestionar utilizando el control de versiones delsistema Git proporcionado por el repositorio de proyectos GitHub (https://github.com).
Los pasos para gestionar el procesos son los siguientes:
1. Cada miembro del equipo tiene que estar registrado en GitHub, Travis CI y Codecov.io.
2. Uno de los miembros tiene que realizar un fork del repositoriodonde se encuentra el código que sequiere probar https://github.com/clopezno/poolobject. El nuevo repositorio tiene que ser público.
3. Invitar al resto de miembros del equipo para que puedan participar en el desarrollo de las pruebas.
4. Vincular el proyecto con Travis CI y Codecov.io.
5. Cada nuevo test realizado ejecutar un commit/push al repositorio del grupo. El texto del commit tiene que describir el caso de prueba añadido.
6. Verificar el resultado de las pruebas en el pipeline de integración continua y cómo la calidad del producto va mejorando con las sucesivas integraciones.

