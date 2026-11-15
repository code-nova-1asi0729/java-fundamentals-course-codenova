# Guion – Lección 1: ¿Qué es programar y qué es Java?

**Duración:** 5 min
**Editor:** OnlineGDB (lenguaje: Java)
**Video:** PENDIENTE-VIDEO-L1
**Práctica:** PENDIENTE-ONLINEGDB-L1
**Archivos:** `/starter-files/leccion-01-hola-java` → `/completed-examples/leccion-01-hola-java`

**Objetivo:** al terminar, el estudiante explica qué es un programa, sabe dónde se usa Java y muestra mensajes con `System.out.println`.

**Contenido que debe cubrir:**
- Qué es programar: darle instrucciones a la computadora en orden, como una receta.
- Qué es Java y dónde se usa (apps de Android, Minecraft: Java Edition, sistemas de bancos).
- Cómo abrir OnlineGDB y elegir Java, sin instalar nada.
- Partes del programa: `public class Main`, `main` y las llaves.
- `System.out.println` y el punto y coma; presentar el juego "La aventura del héroe".

---

## Parte 1: Presentación (diapositivas)

**Diapositiva 1 – Portada**

"¡Hola! Soy [tu nombre] y en este curso vas a crear la aventura de un héroe usando Java. En esta primera lección descubrirás qué es programar y escribirás tus primeras líneas de código. No necesitas saber nada antes, empezamos desde cero."

> Texto en pantalla: Lección 1 · ¿Qué es programar y qué es Java?

**Diapositiva 2 – ¿Qué aprenderás hoy?**

"Hoy vamos a ver tres cosas: primero, qué es un programa; segundo, dónde se usa Java en la vida real; y tercero, vas a escribir tu primer código con System.out.println para mostrar mensajes en pantalla."

> Texto en pantalla: 1) Qué es un programa · 2) Dónde se usa Java · 3) Tu primer código con System.out.println

**Diapositiva 3 – Así empieza tu código**

"Esto es lo que verás al abrir el ejercicio en OnlineGDB y elegir Java como lenguaje, sin instalar nada. Es el código de inicio: ya tiene la estructura del programa, pero está vacío. Las líneas que empiezan con dos barras son comentarios: no se ejecutan, solo nos dan instrucciones. Aquí hay tres pasos: mostrar el título del juego La aventura del héroe, dar la bienvenida y despedirnos con un mensaje final. Al terminar la lección, este código estará completo."

> Texto en pantalla: Código de inicio: main vacío con los PASOS 1, 2 y 3 como comentarios.

**Diapositiva 4 – Un programa es una lista de instrucciones**

"Un programa es simplemente darle instrucciones a la computadora en orden, como una receta: primero haces un paso, luego el siguiente. La computadora hace lo mismo: sigue las instrucciones de arriba hacia abajo, una por una, sin saltarse ninguna. Por ejemplo, nuestro juego primero muestra el título, después saluda al héroe y al final empieza la aventura."

> Texto en pantalla: Instrucciones: 1 Muestra el título · 2 Saluda al héroe · 3 Empieza la aventura → la computadora las sigue en orden.

**Diapositiva 5 – Java está en todas partes**

"Y Java, ¿dónde se usa? Está en muchos lugares. Muchas apps de Android se programan con Java; Minecraft: Java Edition, uno de los juegos más famosos del mundo, también está hecho con Java; y los sistemas de muchos bancos funcionan con este lenguaje. Desde hoy, tú también lo usarás para crear tu propio juego de aventuras."

> Texto en pantalla: Apps de Android · Minecraft: Java Edition · Sistemas de bancos · Tu propio juego de aventuras

**Diapositiva 6 – Las partes de tu primer programa**

"Veamos las partes de un programa en Java. Todo empieza en public class Main y dentro está main, que es la puerta de entrada donde la computadora comienza a leer. Fíjate en las llaves { }: abren y cierran cada bloque de código. Dentro escribimos System.out.println, que muestra un mensaje en pantalla entre comillas. Y cada instrucción termina con punto y coma, como el punto al final de una oración. Recuerda que en OnlineGDB la clase debe llamarse Main."

> Texto en pantalla:

`public class Main {
    public static void main(String[] args) {
        System.out.println("¡Hola, Java!");
    }
}`


> Anotación: Señalar con flechas: 1) public class Main, 2) main, 3) las comillas del texto y 4) el punto y coma ;

**Diapositiva 7 – Actividad práctica**

"Abre el enlace de OnlineGDB de la descripción. No necesitas instalar nada ni crear una cuenta. Sigue los PASOS y pausa el video cuando lo necesites."

> Texto en pantalla: ⏸ Abre el enlace de la descripción

---
## Parte 2: Práctica en OnlineGDB
---

**Inicio**

"En el código de inicio ya tienes lista la estructura con Main y main, pero con los comentarios de los pasos por completar."

**Paso 1 – El título del juego**

"Paso uno: el título del juego La aventura del héroe. Escribimos tres líneas con System.out.println. La primera y la última son una línea de signos igual para decorar; la del medio es el nombre del juego. Recuerda las comillas y el punto y coma al final de cada línea."

**Pasos 2 y 3 – Bienvenida y mensaje final**

**"Paso dos**: un mensaje de bienvenida para el héroe, con dos líneas de println. **Paso tres**: el mensaje final, ¡Comienza la aventura!. Ahora pulsa Run y mira la consola: ahí aparece todo lo que escribimos, de arriba hacia abajo y en el mismo orden."

**Código terminado**

"Y este es el código terminado. Fíjate: una clase Main, el método main con sus llaves y seis instrucciones println que se ejecutan en orden. A la derecha ves la salida en la consola: el título, la bienvenida y el mensaje final. ¡Acabas de escribir tu primer programa en Java!"

**Reto**

"Pausa el video y agrega una línea nueva con println que diga el nombre de tu héroe. Pulsa Run y revisa la consola. Pista: no olvides las comillas ni el punto y coma. La solución está en la carpeta completed-examples del repositorio."

---
## Parte 3: Cierre
---

**Diapositiva 8 – Resumen y buenas prácticas**

"Resumiendo: un programa es una lista de instrucciones en orden; todo programa en Java empieza en main dentro de sus llaves; System.out.println muestra un mensaje; y cada instrucción termina en punto y coma. Un error común es olvidar las comillas o el punto y coma al final."

>Texto en pantalla: Un programa = lista de instrucciones · Todo empieza en main · println muestra un mensaje · No olvides ;

**Diapositiva 9 – Próxima lección**

"En la próxima lección vamos a guardar los datos de nuestro héroe, como su nombre, su vida y sus monedas, usando variables. ¡Nos vemos!"
