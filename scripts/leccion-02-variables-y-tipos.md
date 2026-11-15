# Guion – Lección 2: Variables y tipos de datos

**Duración:** 7 min
**Editor:** OnlineGDB (lenguaje: Java)
**Video:** https://youtu.be/QxVeY7YMZiY
**Práctica:** https://onlinegdb.com/7KD1UtWZZM
**Archivos:** `/starter-files/leccion-02-variables-y-tipos` → `/completed-examples/leccion-02-variables-y-tipos`

**Objetivo:** al terminar, el estudiante guarda los datos del héroe en variables y elige el tipo correcto para cada uno.

**Contenido que debe cubrir:**
- Variable = caja con nombre que guarda un dato.
- Tipos: `int`, `double`, `String` y `boolean` (mencionar `char`).
- Declarar y asignar: `int vida = 100;`; cambiar el valor de una variable.
- Unir textos y variables con `+`.
- Buenas prácticas: nombres claros en camelCase (`tieneEscudo`).

---

## Parte 1: Presentación (diapositivas)

**Diapositiva 1 – Portada**

"¡Hola de nuevo! En la lección anterior mostraste mensajes en pantalla. Hoy vamos a dar un paso más: guardar los datos de nuestro héroe, como su nombre, su vida y sus monedas, usando variables."

> Texto en pantalla: Lección 2 · Variables y tipos de datos

**Diapositiva 2 – ¿Qué aprenderás hoy?**

"Hoy aprenderás qué es una variable, conocerás los tipos de datos más usados (int, double, String y boolean) y verás cómo unir textos con variables usando el signo más."

> Texto en pantalla: 1) Qué es una variable · 2) Tipos int, double, String y boolean · 3) Mostrar variables con +

**Diapositiva 3 – Así empieza tu código**

"Este es el código de inicio de la lección en OnlineGDB. Está vacío, pero tiene seis pasos como comentarios: crear las cinco variables del héroe —nombre, vida, monedas, velocidad y escudo— y, en el paso seis, mostrar sus datos en la consola."

> Texto en pantalla: Código de inicio: main vacío con los PASOS 1 al 6 como comentarios.

**Diapositiva 4 – Una variable es una caja con nombre**

"Imagina una caja con nombre que guarda un dato. La etiqueta es el nombre, por ejemplo vida, y dentro de la caja guardas el valor 100. Otra caja se llama nombre y guarda "Aria", y otra se llama tieneEscudo y guarda true. Con ese nombre, el dato queda guardado y lo puedes usar o modificar cuando quieras."

> Texto en pantalla: Cajas: vida = 100 · nombre = "Aria" · tieneEscudo = true

**Diapositiva 5 – Los tipos de datos más usados**

"Cada variable tiene un tipo, que indica qué clase de dato guarda. Con int guardamos números enteros, como la vida: 100. Con double guardamos números con decimales, como la velocidad: 1.5. Con String guardamos textos, siempre entre comillas. Con boolean guardamos verdadero (true) o falso (false). También existe char, que sirve para guardar un solo carácter entre comillas simples, como 'A'."

> Texto en pantalla: int: enteros · double: decimales · String: textos · boolean: verdadero/falso

**Diapositiva 6 – Cómo se declara y cambia una variable**

"Así se declara y asigna una variable: primero el tipo, luego el nombre, el signo igual, el valor y al final el punto y coma, por ejemplo int vida = 100;. Si luego quieres cambiar su valor, escribes solo el nombre y el nuevo dato, como vida = 80;, sin repetir el tipo. Como buena práctica, usa nombres claros en camelCase: empiezan con minúscula y cada palabra nueva va con mayúscula, como tieneEscudo."

> Texto en pantalla: int vida = 100; → TIPO · NOMBRE · VALOR · punto y coma

**Diapositiva 7 – Unir textos y variables con +**

"Para mostrar una variable junto con un texto usamos el signo más (+). Escribimos el texto entre comillas, un + y el nombre de la variable. Así, System.out.println("Vida: " + vida); muestra Vida: 100. Recuerda: las comillas son solo para el texto; el nombre de la variable va sin comillas."

> Texto en pantalla: System.out.println("Vida: " + vida); → Vida: 100

**Diapositiva 8 – Actividad práctica**

"Abre el enlace de OnlineGDB de la descripción. No necesitas instalar nada ni crear una cuenta. Sigue los PASOS y pausa el video cuando lo necesites."

> Texto en pantalla: Abre el enlace de la descripción

---
## Parte 2: Práctica en OnlineGDB

**Inicio**

"En el código de inicio tienes el método main con seis pasos comentados para crear las variables de Aria y mostrar su ficha."

**Pasos 1 a 3 – Nombre, vida y monedas**

"Primero, un String para el nombre del héroe: String nombre = "Aria"; entre comillas. Después, dos int: vida = 100; y monedas = 25;. Fíjate en el orden: tipo, nombre, igual, valor y punto y coma."

**Pasos 4 y 5 – Velocidad y escudo**

"La velocidad lleva decimales, así que usamos double: double velocidad = 1.5;. Y para saber si tiene escudo usamos boolean: boolean tieneEscudo = true;."

**Paso 6 – Muestra la ficha del héroe**

"Usamos un println por cada dato, uniendo el texto y la variable con +. Al pulsar Run, la consola muestra la ficha completa del héroe."

**Código terminado y Reto**

"Este es el código terminado. Arriba declaramos las cinco variables y abajo las mostramos. Pausa el video, crea una variable int nivel = 1; y muéstrala; luego cambia el valor de vida a 80. La solución está en la carpeta completed-examples."

---
## Parte 3: Cierre

**Diapositiva 9 – Resumen y buenas prácticas**

**"Resumen**: una variable es una caja con nombre que guarda un dato. Usamos int, double, String, boolean (char). Se declara como int vida = 100;, usa camelCase y se une con textos usando +. Un error típico es poner comillas al nombre de la variable."

Texto en pantalla: Variable = caja con nombre · Tipos de datos · camelCase · Sin comillas en variables

**Diapositiva 10 – Próxima lección**

"En la próxima lección usaremos operadores para que tu héroe reciba golpes, gane monedas y decida si puede comprar una espada. ¡Nos vemos!"
