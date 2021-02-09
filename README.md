Este repositorio ha sido creado como ejercicio práctico de la asignatura “Factoría del Software” del MIT de la Universidad de Sevilla por David Garcia Ramos
El código de este proyecto está extraído de “Java Design Patterns Tutorial” cuyo autor es Rohit Joshi y que se encuentra disponible en:
https://www.javacodegeeks.com/2015/09/java-design-patterns.html
El patrón aquí presentado es Template Dessign Pattern disponible en https://www.javacodegeeks.com/2015/09/template-design-pattern.html

Se han realizado pruebas a la clase GeneraNumeros.
Esta no tiene mucho que ver con el patrón, pero permite crear test artificiales puesto que el código original no era muy probable.
Se realizan cuatro tests, uno sigue con el fallo por defecto, otro prueba que se devuelva una cadena correcta (diseñado para fallar puesto que no está bien implementado), otro prueba que se copia bien un número (se hace un uso, aunque no muy inteligente (se usa esencialmente para demostrar que se puede), de un mock) y finalmente una prueba de que se cambia un atributo. Todos estos tests tienen mucha redundancia, pero están diseñados para probar capacidades de Junit.
