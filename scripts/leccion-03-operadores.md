# Guion – Lección 3: Operadores y expresiones

**Duración:** 6 min
**Editor:** OnlineGDB (lenguaje: Java)
**Video:** https://youtu.be/uJkGvDI8ySY
**Práctica:** https://onlinegdb.com/ynYEGD_JR
**Archivos:** `/starter-files/leccion-03-operadores` → `/completed-examples/leccion-03-operadores`

**Objetivo:** al terminar, el estudiante calcula con operadores matemáticos, compara valores y combina condiciones.

**Contenido que debe cubrir:**
- Operadores `+ - * / %` y la división entera (`7 / 2` da 3).
- `+=` y `++` para actualizar variables.
- Comparación: `> < >= <= == !=`, que dan `true` o `false`.
- Lógicos: `&&` (y), `||` (o) y `!` (no).
- Operaciones con textos: `toUpperCase()` y `length()`.

---
Parte 1: Presentación (diapositivas)

**Diapositiva 1 – Portada**

"¡Hola! Ya sabes guardar datos en variables. Ahora vamos a hacer que esos datos cambien: tu héroe va a recibir golpes, ganar monedas y revisar si puede comprar una espada, usando operadores."

> Texto en pantalla: Lección 3 · Operadores y expresiones

**Diapositiva 2 – ¿Qué aprenderás hoy?**

"Hoy verás tres cosas: los operadores matemáticos para sumar, restar y calcular; los operadores de comparación y los lógicos que dan verdadero o falso; y los usaremos para decidir si el héroe puede comprar una espada."

> Texto en pantalla: 1) Operadores matemáticos · 2) Comparar y combinar con && y || · 3) ¿Puede comprar la espada?

**Diapositiva 3 – Así empieza tu código**

"Este es el código de inicio en OnlineGDB. Ya trae cuatro variables listas: vida 100, monedas 25, el daño del golpe 30 y el precio de la espada 40. Tú completarás cinco pasos para actualizar los valores y hacer preguntas."

> Texto en pantalla: Código de inicio: 4 variables listas y PASOS 1 al 5 por completar.

**Diapositiva 4 – Operadores matemáticos y atajos**

"Los operadores matemáticos son cinco: +, -, *, / y %. En el juego: vida = vida - danoGolpe; resta el golpe a la vida. Para actualizar variables más rápido tenemos atajos: monedas += 20; suma 20 y guarda el resultado, y ++ suma 1 a una variable."

> Texto en pantalla: + - * / % · Atajos: += y ++ para actualizar variables

**Diapositiva 5 – Cuidado con la división entera**

"Un detalle importante: entre números enteros, la división no da decimales. 7 / 2 no da 3.5, da 3. Y el operador porcentaje (%) nos dice cuánto sobra: 7 % 2 da 1. Ese es el resto de la división."

> Texto en pantalla: División entera: 7 / 2 = 3 · Resto (%): 7 % 2 = 1

**Diapositiva 6 – Comparar da true o false**

"Para hacer preguntas usamos los operadores de comparación: mayor (>), menor (<), mayor o igual (>=), menor o igual (<=), igual (==) y distinto (!=). Cuidado: un solo igual guarda un valor, dos iguales comparan. El resultado siempre es true o false."

> Texto en pantalla: = guarda · == compara · > < >= <= == != → true o false

**Diapositiva 7 – Y / O / No: combina condiciones**

"Los operadores lógicos combinan o invierten condiciones. && significa Y: ambas condiciones tienen que ser verdaderas. || significa O: basta con que una sea verdadera. Y ! significa NO: invierte un booleano."

> Texto en pantalla: && (y) · || (o) · ! (no)

**Diapositiva 8 – Actividad práctica**

"Abre el enlace de OnlineGDB de la descripción. No necesitas instalar nada ni crear una cuenta. Sigue los PASOS y pausa el video cuando lo necesites."

> Texto en pantalla: Abre el enlace de la descripción

---
## Parte 2: Práctica en OnlineGDB

**Inicio**

"En el código de inicio completaremos cinco pasos para simular que el héroe recibe un golpe, encuentra un cofre y evalúa si puede comprar el arma."

**Pasos 1 y 2 – El golpe y el cofre**

"Paso uno: el héroe recibe un golpe, así que restamos danoGolpe a la vida: de 100 pasa a 70. Paso dos: encuentra un cofre y sumamos 20 monedas con +=: de 25 pasa a 45."

**Pasos 3 y 4 – Las preguntas**

"Paso tres: creamos boolean puedeComprar = monedas >= precioEspada;, que vale true. Paso cuatro: boolean listoParaLuchar = vida > 0 && puedeComprar;."

**Paso 5 – Muestra los resultados**

"Paso cinco: mostramos los resultados con println y probamos la división entera 7 / 2 y el resto 7 % 2."

**Código terminado y Reto**

"Aquí está el código terminado con todas las expresiones evaluadas. Pausa el video y cambia danoGolpe a 100 para ver qué pasa con listoParaLuchar. La solución está en la carpeta completed-examples."

---
## Parte 3: Cierre

**Diapositiva 9 – Resumen y buenas prácticas**

"Resumen: + - * / % calculan y la división entera trunca decimales; += y ++ actualizan variables; > < >= <= == != comparan; &&, || y ! combinan o niegan. Un error común es usar = en lugar de == para comparar."

> Texto en pantalla: Operadores matemáticos y lógicos · Cuidado: usa == para comparar, no =

**Diapositiva 10 – Próxima lección**

"En la próxima lección tu héroe aprenderá a tomar decisiones con if y else. ¡Nos vemos!"
