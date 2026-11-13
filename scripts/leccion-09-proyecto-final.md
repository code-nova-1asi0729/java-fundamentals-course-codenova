# Guion – Lección 9: Proyecto final y errores comunes

**Duración:** 9 min
**Editor:** OnlineGDB (lenguaje: Java)
**Video:** PENDIENTE-VIDEO-L9
**Práctica 1 (juego):** PENDIENTE-ONLINEGDB-L9-JUEGO
**Práctica 2 (caza de errores):** PENDIENTE-ONLINEGDB-L9-ERRORES
**Archivos:** `/starter-files/leccion-09-proyecto-final` → `/completed-examples/leccion-09-proyecto-final`

**Objetivo:** al terminar, el estudiante construye un juego completo que combina clases, objetos, `Scanner`, `while`, `if-else` y métodos; reconoce los errores más comunes de un principiante y sabe cómo corregirlos.

---

## Parte 1: Presentación (diapositivas)

**Diapositiva 1 – Portada**
"¡Llegamos a la última lección! Hoy vas a programar un juego completo: el cofre del tesoro. Tu héroe tiene cinco intentos para adivinar el número secreto que abre el cofre. Y al final, vamos a cazar los errores más comunes de los que empiezan a programar."

> Texto en pantalla: **Lección 9 · Proyecto final: El cofre del tesoro**

**Diapositiva 2 – Cómo funciona el juego**
"El juego pregunta el nombre del héroe. Después, el cofre elige un número al azar del 1 al 20. En cada intento escribes un número: si aciertas, el cofre se abre y ganas monedas; si no, el cofre te da una pista: 'es mayor' o 'es menor'. Cuantos más intentos te sobren, más monedas ganas."

> Anotación: diagrama simple *Pedir nombre → Elegir número → ¿Acertó? → Sí: monedas / No: pista → repetir*.

**Diapositiva 3 – Las piezas que ya conoces**
"Mira todo lo que vamos a usar: `Scanner` para leer el teclado, de la lección 6; un `while` para repetir los intentos, de la lección 5; `if-else` para revisar si acertaste, de la lección 4; y dos clases con datos protegidos, `Heroe` y `Cofre`, de las lecciones 7 y 8. ¡Lo tienes todo!"

**Diapositiva 4 – Actividad práctica**
"Abre el primer enlace de OnlineGDB de la descripción. Las clases ya están escritas; tú completas el juego dentro de `main`. Pausa cuando lo necesites."

> Texto en pantalla: **⏸ Abre la Práctica 1 de la descripción**

---

## Parte 2: Práctica en OnlineGDB – El cofre del tesoro

**Inicio**
"Revisemos rápido las clases. `Heroe` guarda el nombre, los intentos y las monedas, todos `private`. `Cofre` guarda el número secreto; lo elige con `Random`, que da un número al azar. Su método `abrir` dice si acertaste y `pista` te dice si el secreto es mayor o menor."

**Paso 1 – El nombre**
"Escribimos `System.out.print("¿Cómo se llama tu héroe? ");` y `String nombre = teclado.nextLine();`."

**Paso 2 – Crear los objetos**
"`Heroe heroe = new Heroe(nombre, 5);` y `Cofre cofre = new Cofre(20);`. Ya tenemos héroe con cinco intentos y un cofre con un número del 1 al 20."

**Paso 3 – ¿Está abierto?**
"`boolean abierto = false;` Al principio, el cofre está cerrado."

**Paso 4 – El bucle del juego**
"`while (heroe.tieneIntentos() && !abierto)`. Se lee así: mientras el héroe tenga intentos **y** el cofre **no** esté abierto. Dentro pedimos el número con `nextInt()`, el héroe usa un intento y revisamos: si `cofre.abrir(numero)` es verdadero, ponemos `abierto = true` y el héroe gana monedas; si no, mostramos `cofre.pista(numero)`."

> Texto en pantalla: `&&` = "y" · `!` = "no"

**Paso 5 – El final**
"Después del bucle: si `abierto`, felicitamos al héroe y mostramos sus monedas; si no, mostramos el número secreto. Pulsamos **Run**, escribimos un nombre y… ¡a jugar! Fíjate cómo las pistas te ayudan a acercarte."

**Reto**
"Pausa y cambia el juego a tu gusto: más intentos, números hasta 50 o un mensaje especial si ganas en el primer intento."

---

## Parte 3: Caza de errores

**Diapositiva 5 – Los 5 errores más comunes**
"Todo programador se equivoca, incluso los expertos. La diferencia es que saben leer los mensajes de error. Estos son los cinco más comunes:
1. Olvidar el punto y coma al final de una línea.
2. Escribir `system` en vez de `System`: Java distingue mayúsculas y minúsculas.
3. Usar `=` para comparar. Un `=` guarda un valor; para comparar se usan dos: `==`.
4. Usar una variable sin declararla antes con su tipo.
5. Pedir un casillero que no existe en un array, como el 3 en un array de tamaño 3."

**Diapositiva 6 – Un error especial con los textos**
"Para comparar dos textos no uses `==`, usa `.equals()`: `nombre.equals("Luna")`. El `==` a veces parece funcionar, pero puede fallar cuando el texto viene del teclado."

**Práctica 2 – Caza los errores**
"Abre el segundo enlace. Este programa tiene los cinco errores. Pulsa **Run**, lee el **primer** mensaje de error, mira el número de línea, corrige una sola cosa y vuelve a ejecutar. Repite hasta que funcione. Pausa el video y ¡a cazar!"

> Texto en pantalla: **Lee el error → Mira la línea → Corrige UNA cosa → Run**

"¿Lo lograste? Fíjate que el último error no apareció hasta que el programa empezó a funcionar: es un error que pasa mientras el programa se ejecuta. La solución completa está en la carpeta `completed-examples`."

---

## Parte 4: Cierre

**Diapositiva 7 – Buenas prácticas**
"Cuatro consejos para el camino. Uno: usa nombres claros, `vida` es mejor que `v`. Dos: ordena tu código con espacios al inicio de cada bloque para ver dónde empieza y dónde termina. Tres: haz un cambio a la vez y ejecuta. Y cuatro: un error no es un fracaso, es una pista."

**Diapositiva 8 – Próximos pasos**
"¡Felicitaciones, terminaste el curso! Ya sabes crear variables, tomar decisiones, repetir tareas, escribir métodos, crear clases y proteger sus datos. Para seguir aprendiendo, visita dev.java, la página oficial para aprender Java, y sigue practicando en OnlineGDB. Comparte tu juego con tus amigos. ¡Gracias por acompañarnos y sigue programando!"

> Texto en pantalla: **dev.java/learn · ¡Gracias por completar el curso!**
