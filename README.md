Este repositorio ha sido creado como ejercicio prÃ¡ctico de la asignatura â€œFactorÃ­a del Softwareâ€� del MIT de la Universidad de Sevilla por David Garcia Ramos
El cÃ³digo de este proyecto estÃ¡ extraÃ­do de â€œJava Design Patterns Tutorialâ€� cuyo autor es Rohit Joshi y que se encuentra disponible en:
https://www.javacodegeeks.com/2015/09/java-design-patterns.html
El patrÃ³n aquÃ­ presentado es Template Dessign Pattern disponible en https://www.javacodegeeks.com/2015/09/template-design-pattern.html

Se han realizado pruebas a la clase GeneraNumeros.
Esta no tiene mucho que ver con el patrÃ³n, pero permite crear test artificiales puesto que el cÃ³digo original no era muy probable.
Se realizan cuatro tests, uno sigue con el fallo por defecto, otro prueba que se devuelva una cadena correcta (diseÃ±ado para fallar puesto que no estÃ¡ bien implementado), otro prueba que se copia bien un nÃºmero (se hace un uso, aunque no muy inteligente (se usa esencialmente para demostrar que se puede), de un mock) y finalmente una prueba de que se cambia un atributo. Todos estos tests tienen mucha redundancia, pero estÃ¡n diseÃ±ados para probar capacidades de Junit.
OK, revisado
