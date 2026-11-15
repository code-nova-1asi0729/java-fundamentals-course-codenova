# Guion – Lección 5: Bucles for y while

**Duración:** 7 min
**Editor:** OnlineGDB (lenguaje: Java)
**Video:** https://youtu.be/S4ZP-7SsSk4
**Práctica:** https://onlinegdb.com/kQNt54Hyg
**Archivos:** `/starter-files/leccion-05-bucles` → `/completed-examples/leccion-05-bucles`

**Objetivo:** al terminar, el estudiante repite instrucciones con `for` y `while` y sabe cuándo usar cada uno.

---

## Parte 1: Presentación (diapositivas)

**Diapositiva 1 – Portada**
"¡Hola! Bienvenido a la lección 5. Luna quiere entrenar cinco rondas para ganar monedas. Podríamos escribir la misma línea cinco veces… ¿pero y si fueran cien? Hoy vamos a aprender a repetir instrucciones sin copiar y pegar, usando bucles."

> Texto en pantalla: **Lección 5 · Bucles for y while**

**Diapositiva 2 – ¿Qué es un bucle?**
"Un bucle es como una canción en modo repetir: el programa vuelve a ejecutar el mismo bloque de código varias veces. Java tiene dos bucles muy usados: `for`, cuando sabes cuántas veces quieres repetir, y `while`, cuando repites mientras algo sea verdadero."

> Texto en pantalla: **for = sé cuántas veces · while = mientras algo sea verdadero**

**Diapositiva 3 – El bucle for**
"El `for` tiene tres partes entre paréntesis, separadas por punto y coma. Primero, dónde empieza el contador: `int ronda = 1`. Segundo, hasta cuándo sigue: `ronda <= 5`. Tercero, cómo avanza: `ronda++`, que suma 1 en cada vuelta. Así, el bloque se repite exactamente cinco veces."

> Texto en pantalla: `for (int ronda = 1; ronda <= 5; ronda++) { … }`

> Anotación: etiquetas *inicio*, *condición* y *avance* sobre cada parte.

**Diapositiva 4 – El bucle while**
"El `while` es más sencillo: solo tiene una condición. Mientras sea verdadera, el bloque se repite. Por ejemplo, `while (vida > 0)`: mientras Luna tenga vida, sigue recibiendo golpes. No sabemos cuántos golpes resistirá; el bucle termina cuando la condición deja de cumplirse."

> Texto en pantalla: `while (vida > 0) { … }`

**Diapositiva 5 – Cuidado con el bucle infinito**
"Un peligro: si dentro del `while` nada cambia la condición, el bucle nunca termina. Si nos olvidamos de restar la vida, `vida > 0` siempre será verdadero y el programa se queda trabado. Si te pasa en OnlineGDB, pulsa **Stop**."

> Texto en pantalla: **Algo dentro del while debe cambiar la condición**

**Diapositiva 6 – Actividad práctica**
"¡Ahora te toca! Abre el enlace de OnlineGDB que está en la descripción del video. No necesitas instalar nada ni crear una cuenta. Sigue los comentarios PASO 1, PASO 2… y pausa el video cuando lo necesites."

> Texto en pantalla: **Abre el enlace de la descripción**

---

## Parte 2: Práctica en OnlineGDB

**Inicio**
"Este es el código de inicio. Luna empieza con 0 monedas y 100 de vida. Primero va a entrenar y después va a pelear."

**Paso 1 – Cinco rondas con for**
"Escribimos `for (int ronda = 1; ronda <= 5; ronda++)` y, entre llaves, mostramos 'Ronda' más el número y sumamos 10 monedas. Pulsamos **Run** y aparecen las rondas de la 1 a la 5. ¡Cinco líneas con una sola instrucción!"

**Paso 2 – Total de monedas**
"Después de la llave de cierre del `for` mostramos el total: 50 monedas. Fíjate que esta línea está fuera del bucle, por eso sale una sola vez."

> Texto en pantalla: **Total de monedas: 50**

**Paso 3 – Golpes con while**
"Ahora escribimos `while (vida > 0)`. Dentro, Luna recibe un golpe de 30 con `vida = vida - 30;` y mostramos su vida. Esa resta es la que hace que el bucle termine algún día."

**Paso 4 – Game over**
"Al salir del `while` mostramos '¡Game over!'. Pulsamos **Run**: la vida baja a 70, 40, 10 y… menos 20. ¡Vida negativa! Guarda ese detalle: en la lección 8 vamos a proteger los datos para que eso no pase."

> Anotación: resaltar el `-20` en la consola.

**Reto**
"Pausa el video y cuenta cuántos golpes resistió Luna. Pista: crea `int golpes = 0;` antes del `while` y súmale 1 en cada vuelta con `golpes++`. La solución está en la carpeta `completed-examples` del repositorio."

---

## Parte 3: Cierre

**Diapositiva 7 – Resumen y buenas prácticas**
"¡Muy bien! Repasemos. Usa `for` cuando sabes cuántas veces repetir y `while` cuando repites mientras algo sea verdadero. `ronda++` suma 1 al contador. Y nunca olvides cambiar algo dentro del `while`, o tendrás un bucle infinito."

> Texto en pantalla: **for = cuántas veces · while = mientras · Evita el bucle infinito**

**Diapositiva 8 – Lo que viene**
"Nuestro código ya está creciendo bastante. En la próxima lección vamos a ordenarlo en métodos y, además, el jugador podrá escribir el nombre de su héroe con el teclado. ¡Nos vemos!"
