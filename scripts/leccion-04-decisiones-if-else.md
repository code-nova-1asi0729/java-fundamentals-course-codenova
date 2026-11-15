# Guion – Lección 4: Decisiones con if-else

**Duración:** 7 min
**Editor:** OnlineGDB (lenguaje: Java)
**Video:** https://youtu.be/I7EI_EXhO_U
**Práctica:** https://onlinegdb.com/cWlf0J6RB
**Archivos:** `/starter-files/leccion-04-decisiones-if-else` → `/completed-examples/leccion-04-decisiones-if-else`

**Objetivo:** al terminar, el estudiante hace que el programa decida qué hacer según una condición.

---

## Parte 1: Presentación (diapositivas)

**Diapositiva 1 – Portada**
"¡Hola! Bienvenido a la lección 4. Hasta ahora nuestro programa hacía siempre lo mismo, de arriba hacia abajo. Pero un juego tiene que decidir: si el héroe se queda sin vida, se acabó la partida; si le queda poca, hay que avisarle. Hoy le enseñamos al programa a tomar decisiones."

> Texto en pantalla: **Lección 4 · Decisiones con if-else**

**Diapositiva 2 – Decides todos los días**
"Tú ya tomas decisiones así sin darte cuenta. Si llueve, llevo paraguas; si no, llevo gorra. Primero miras una condición y, según sea verdadera o falsa, haces una cosa u otra. En Java, 'si' se escribe `if` y 'si no' se escribe `else`."

> Texto en pantalla: **Si llueve → paraguas · Si no → gorra**

**Diapositiva 3 – Cómo se escribe un if**
"Primero va la palabra `if`, luego la condición entre paréntesis y después, entre llaves, lo que se hace si la condición es verdadera. La condición es una de las comparaciones de la lección 3, como `vida <= 0`, que da `true` o `false`. Si es `false`, Java salta el bloque y sigue de largo."

> Texto en pantalla: `if (vida <= 0) { System.out.println("¡Game over!"); }`

> Anotación: una flecha a los paréntesis (condición) y otra a las llaves (bloque).

**Diapositiva 4 – else if y else**
"¿Y si hay más de dos caminos? Para revisar otra condición usamos `else if` y, para todo lo demás, `else`. Java las revisa en orden, de arriba hacia abajo, y solo ejecuta el primer bloque cuya condición sea verdadera. Los demás se saltan."

> Texto en pantalla: **if → else if → else: se ejecuta solo uno**

**Diapositiva 5 – Dos errores que hay que evitar**
"Dos errores muy comunes. Uno: poner punto y coma justo después del paréntesis, `if (vida <= 0);`. Ese punto y coma termina el `if` y el bloque se ejecuta siempre. Dos: usar un solo igual para comparar. Recuerda: un igual guarda, dos iguales comparan."

> Texto en pantalla: **Sin `;` después del if · `==` compara, `=` guarda**

**Diapositiva 6 – Actividad práctica**
"¡Ahora te toca! Abre el enlace de OnlineGDB que está en la descripción del video. No necesitas instalar nada ni crear una cuenta. Sigue los comentarios PASO 1, PASO 2… y pausa el video cuando lo necesites."

> Texto en pantalla: **Abre el enlace de la descripción**

---

## Parte 2: Práctica en OnlineGDB

**Inicio**
"Este es el código de inicio. Luna tiene 25 de vida y 40 monedas. Vamos a hacer que el juego reaccione según esos números."

**Paso 1 – Game over**
"Escribimos `if (vida <= 0)` y, entre llaves, un `println` con '¡Game over!'. Pulsamos **Run** y… no sale nada. Claro: Luna tiene 25 de vida, así que la condición es falsa y Java salta el bloque."

**Paso 2 – Poca vida**
"Después de la llave de cierre agregamos `else if (vida < 30)` y mostramos '¡Cuidado, poca vida!'. Ahora sí aparece el mensaje, porque 25 es menor que 30."

**Paso 3 – En plena forma**
"Cerramos con un `else` que muestre '¡En plena forma!'. Fíjate que `else` no lleva condición: cubre todos los casos que no entraron arriba."

> Anotación: cambiar `vida` a 0 y luego a 80, y pulsar **Run** cada vez para ver cómo cambia el mensaje.

**Paso 4 – Comprar una poción**
"Una poción cuesta 30 monedas. Escribimos `if (monedas >= 30)`: dentro restamos 30 a las monedas, sumamos 50 a la vida y mostramos 'Compraste una poción'. En el `else` mostramos 'No tienes monedas suficientes'. Con 40 monedas, Luna compra la poción y queda con 75 de vida y 10 monedas."

> Texto en pantalla: **Vida: 75 · Monedas: 10**

**Reto**
"Pausa el video y cambia `vida` y `monedas` a otros valores, por ejemplo 0 de vida y 10 monedas. Antes de pulsar **Run**, adivina qué mensajes van a salir. La solución está en la carpeta `completed-examples` del repositorio."

---

## Parte 3: Cierre

**Diapositiva 7 – Resumen y buenas prácticas**
"¡Muy bien! Repasemos. `if` ejecuta un bloque solo si la condición es verdadera; `else if` revisa otra opción y `else` cubre todo lo demás. La condición va entre paréntesis y el bloque entre llaves. Y recuerda: nada de punto y coma después del `if`, y `==` para comparar."

> Texto en pantalla: **Condición entre ( ) · Bloque entre { } · Solo se ejecuta un camino**

**Diapositiva 8 – Lo que viene**
"Ahora el juego sabe decidir. Pero, ¿y si Luna quiere entrenar diez veces? ¿Copiamos la misma línea diez veces? ¡No! En la próxima lección aprenderemos a repetir con bucles. ¡Nos vemos!"
