# Guion – Lección 6: Métodos, parámetros y entrada con Scanner

**Duración:** 8 min
**Editor:** OnlineGDB (lenguaje: Java)
**Video:** https://youtu.be/LHql1UR-fRM
**Práctica:** https://onlinegdb.com/39WPM2FEH
**Archivos:** `/starter-files/leccion-06-metodos-y-scanner` → `/completed-examples/leccion-06-metodos-y-scanner`

**Objetivo:** al terminar, el estudiante crea métodos con parámetros y `return`, y lee datos del teclado con `Scanner`.

---

## Parte 1: Presentación (diapositivas)

**Diapositiva 1 – Portada**
"¡Hola! Bienvenido a la lección 6. Hasta ahora el nombre y la vida de nuestro héroe estaban escritos en el código. Hoy el jugador va a escribirlos con el teclado, y vamos a ordenar el programa en partes con nombre que podemos usar muchas veces: los métodos."

> Texto en pantalla: **Lección 6 · Métodos, parámetros y Scanner**

**Diapositiva 2 – Un método es una receta**
"Piensa en una receta de cocina: tiene un nombre, como 'panqueques', y una lista de pasos. Cuando quieres panqueques, no vuelves a inventar los pasos: solo dices 'haz panqueques'. Un método es igual: un bloque de código con nombre que puedes llamar las veces que quieras."

> Texto en pantalla: **Método = receta con nombre que puedes usar muchas veces**

**Diapositiva 3 – Parámetros: los ingredientes**
"Algunas recetas necesitan ingredientes. Los métodos también: se llaman parámetros y van entre paréntesis. `mostrarEstado(String nombre, int vida)` recibe un nombre y una vida, y muestra el estado de cualquier héroe que le pasemos."

> Texto en pantalla: `static void mostrarEstado(String nombre, int vida) { … }`

**Diapositiva 4 – void o return**
"Hay métodos que solo hacen algo, como mostrar un mensaje: esos llevan `void`. Y hay métodos que calculan un resultado y te lo devuelven con `return`: esos dicen qué tipo devuelven, por ejemplo `int`. `curar(vida, 20)` devuelve la vida más 20, y la guardamos con `vida = curar(vida, 20);`."

> Texto en pantalla: **void = solo hace algo · int + return = devuelve un número**

**Diapositiva 5 – Leer el teclado con Scanner**
"Para que el jugador escriba datos usamos `Scanner`. Primero lo importamos con `import java.util.Scanner;` y lo creamos con `new Scanner(System.in)`. Luego, `nextLine()` lee un texto y `nextInt()` lee un número entero."

> Texto en pantalla: **nextLine() → texto · nextInt() → número**

**Diapositiva 6 – Actividad práctica**
"¡Ahora te toca! Abre el enlace de OnlineGDB que está en la descripción del video. No necesitas instalar nada ni crear una cuenta. Sigue los comentarios PASO 1, PASO 2… y pausa el video cuando lo necesites."

> Texto en pantalla: **Abre el enlace de la descripción**

---

## Parte 2: Práctica en OnlineGDB

**Inicio**
"Este es el código de inicio. Arriba ya están el `import` y el `Scanner` llamado `teclado`. Al final, `teclado.close()` lo cierra cuando terminamos. Los pasos 3 y 5 van abajo, fuera de `main`, porque ahí se crean los métodos."

**Pasos 1 y 2 – Preguntar al jugador**
"Mostramos '¿Cómo se llama tu héroe?' y guardamos la respuesta con `String nombre = teclado.nextLine();`. Luego preguntamos '¿Cuánta vida tiene?' y la guardamos con `int vida = teclado.nextInt();`."

**Cómo escribir en la consola de OnlineGDB**
"Pulsamos **Run**. El programa se detiene y espera. Haz clic en la consola de abajo, escribe el nombre, por ejemplo Luna, y presiona Enter. Luego escribe la vida, por ejemplo 60, y Enter otra vez."

> Anotación: flecha hacia la consola de OnlineGDB con el texto **Escribe aquí y presiona Enter**.

**Paso 3 – Crear mostrarEstado**
"Debajo de `main` creamos `static void mostrarEstado(String nombre, int vida)`, que muestra el nombre, 'tiene', la vida y 'de vida'."

**Paso 4 – Llamar a mostrarEstado**
"Volvemos a `main` y lo llamamos con `mostrarEstado(nombre, vida);`. Al ejecutar sale 'Luna tiene 60 de vida'."

**Paso 5 – Crear curar con return**
"Abajo creamos `static int curar(int vida, int cantidad)`. Dentro solo escribimos `return vida + cantidad;`. El método no muestra nada: devuelve el resultado."

**Paso 6 – Curar al héroe**
"En `main` escribimos `vida = curar(vida, 20);` y volvemos a llamar a `mostrarEstado`. Ahora sale 'Luna tiene 80 de vida'. ¡Usamos el mismo método dos veces sin repetir código!"

> Texto en pantalla: **Luna tiene 60 de vida → Luna tiene 80 de vida**

**Reto**
"Pausa el video y crea un método `static int recibirGolpe(int vida, int golpe)` que devuelva la vida menos el golpe. Úsalo y muestra el estado otra vez. La solución de la práctica está en la carpeta `completed-examples` del repositorio."

---

## Parte 3: Cierre

**Diapositiva 7 – Resumen y buenas prácticas**
"¡Muy bien! Repasemos. Un método es una receta con nombre; los parámetros son sus ingredientes; `void` solo hace algo y `return` devuelve un resultado. `Scanner` lee el teclado: `nextLine()` para textos y `nextInt()` para números. Un consejo: ponle a cada método un nombre que diga lo que hace, como `curar` o `mostrarEstado`."

> Texto en pantalla: **Método · Parámetros · return · Scanner**

**Diapositiva 8 – Lo que viene**
"Ya tenemos variables, decisiones, bucles y métodos, pero los datos del héroe siguen sueltos por todo el programa. En la próxima lección vamos a juntarlos en un molde: la clase `Heroe`. ¡Nos vemos!"
