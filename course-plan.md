# Fundamentos de Java para Principiantes: La aventura del héroe

## Resumen del Curso

Este curso de aproximadamente 1 hora introduce a estudiantes de secundaria a la programación con Java, desde su primer "¡Hola, mundo!" hasta la programación orientada a objetos (POO). Lección a lección, el estudiante construye a un héroe de videojuego: primero guarda sus datos en variables, luego le enseña a tomar decisiones y a repetir acciones, después lo convierte en una clase con datos protegidos y, al final, programa con él un juego completo: **El cofre del tesoro**.

* **Público objetivo**: Estudiantes de 12 a 17 años sin experiencia en programación
* **Prerrequisitos**: Ninguno
* **Herramientas necesarias**: **Solo tu navegador web** (Chrome, Firefox, Safari o Edge)
* **Editor en línea**: [OnlineGDB](https://www.onlinegdb.com/online_java_compiler)
* **Repositorio de código fuente**: [https://github.com/code-nova-1asi0729/java-fundamentals-course-codenova](https://github.com/code-nova-1asi0729/java-fundamentals-course-codenova)

### ¿Cómo usar cada práctica?

1. Mira el video de la lección.
2. Abre el enlace **Práctica** de esa lección: el código de inicio ya está cargado en OnlineGDB.
3. Sigue los comentarios `PASO 1`, `PASO 2`… y pulsa **Run** para ver el resultado.
4. Pausa el video cuando lo necesites. Si te trabas, compara con el **Ejemplo terminado**.

---

## Secuencia de Lecciones

### Módulo A: Primeros pasos con Java

#### Lección 1: ¿Qué es programar y qué es Java? (5 minutos)
* **Descripción**: Descubre qué es un programa, dónde se usa Java (desde apps de Android hasta Minecraft: Java Edition) y escribe tus primeras líneas de código para mostrar el título de nuestro juego.
* **Video**: [Ver la lección](https://youtu.be/UdrG6q2G-3w)
* **Conclusiones clave**: Un programa es una lista de instrucciones; todo programa en Java empieza en `main`; `System.out.println("...")` muestra un mensaje; cada instrucción termina en `;`.
* **Práctica**: [¡Hola, Java! en OnlineGDB](https://onlinegdb.com/UfaxAoSTH)
* **Ejemplo terminado**: [Ver solución](https://onlinegdb.com/tNUQztBRN)

#### Lección 2: Variables y tipos de datos (7 minutos)
* **Descripción**: Guarda los datos de tu héroe (nombre, vida, monedas, velocidad y si tiene escudo) en variables, y conoce los tipos de datos más usados.
* **Video**: [Ver la lección](https://youtu.be/QxVeY7YMZiY)
* **Conclusiones clave**: Una variable es una caja con nombre; `int` para enteros, `double` para decimales, `String` para textos, `boolean` para verdadero o falso; declara como `int vida = 100;` y une textos con `+`.
* **Práctica**: [Crea a tu héroe en OnlineGDB](https://onlinegdb.com/7KD1UtWZZM)
* **Ejemplo terminado**: [Ver solución](https://onlinegdb.com/t22bOuVhb)

#### Lección 3: Operadores y expresiones (6 minutos)
* **Descripción**: Haz que tu héroe reciba golpes, gane monedas y revise si puede comprar una espada usando operadores matemáticos, de comparación y lógicos.
* **Video**: [Ver la lección](https://youtu.be/uJkGvDI8ySY)
* **Conclusiones clave**: `+ - * / %` para calcular; `+=` suma y guarda; `> < >= <= ==` comparan y dan `true` o `false`; `&&` significa "y", `||` significa "o"; entre enteros, `7 / 2` da `3`.
* **Práctica**: [Calcula en OnlineGDB](https://onlinegdb.com/ynYEGD_JR)
* **Ejemplo terminado**: [Ver solución](https://onlinegdb.com/f4dCP-7mD)

### Módulo B: Haciendo que el programa piense

#### Lección 4: Decisiones con if-else (7 minutos)
* **Descripción**: Enséñale al juego a decidir: ¿game over, poca vida o en plena forma? ¿Alcanzan las monedas para una poción?
* **Video**: [Ver la lección](https://youtu.be/I7EI_EXhO_U)
* **Conclusiones clave**: `if (condición) { }` se ejecuta solo si la condición es verdadera; `else if` revisa otra opción; `else` cubre todo lo demás; la condición va entre paréntesis y el bloque entre llaves.
* **Práctica**: [Toma decisiones en OnlineGDB](https://onlinegdb.com/cWlf0J6RB)
* **Ejemplo terminado**: [Ver solución](https://onlinegdb.com/dxuwLMLag)

#### Lección 5: Bucles for y while (7 minutos)
* **Descripción**: Repite acciones sin copiar y pegar: entrena a tu héroe varias rondas con `for` y haz que resista golpes hasta el game over con `while`.
* **Video**: [Ver la lección](https://youtu.be/S4ZP-7SsSk4)
* **Conclusiones clave**: `for (int i = 1; i <= 5; i++)` repite un número fijo de veces; `while (condición)` repite mientras la condición sea verdadera; si nada cambia dentro del `while`, el bucle nunca termina.
* **Práctica**: [Repite en OnlineGDB](https://onlinegdb.com/kQNt54Hyg)
* **Ejemplo terminado**: [Ver solución](https://onlinegdb.com/BZAQNi7j7)

#### Lección 6: Métodos, parámetros y entrada con Scanner (8 minutos)
* **Descripción**: Ordena tu código en métodos reutilizables, envíales datos con parámetros y deja que el jugador escriba el nombre de su héroe con `Scanner`.
* **Video**: [Ver la lección](https://youtu.be/LHql1UR-fRM)
* **Conclusiones clave**: Un método es un bloque con nombre que se puede llamar muchas veces; los parámetros son los datos que recibe; `return` devuelve un resultado; `Scanner` lee el teclado con `nextLine()` y `nextInt()`.
* **Práctica**: [Habla con el programa en OnlineGDB](https://onlinegdb.com/39WPM2FEH)
* **Ejemplo terminado**: [Ver solución](https://onlinegdb.com/DjR-5Ilnn)

### Módulo C: Programación orientada a objetos y proyecto final

#### Lección 7: Clases y objetos (8 minutos)
* **Descripción**: Junta todos los datos y acciones del héroe en una clase, el "molde", y crea varios héroes a partir de ella con `new`.
* **Video**: [Ver la lección](https://youtu.be/vItsI56gIk8)
* **Conclusiones clave**: Una clase es un molde y un objeto es lo que creas con él; los atributos son lo que el objeto tiene y los métodos lo que hace; el constructor da los valores iniciales; cada objeto guarda sus propios datos.
* **Práctica**: [Crea tu clase Heroe en OnlineGDB](https://onlinegdb.com/QrwwPNsC8)
* **Ejemplo terminado**: [Ver solución](completed-examples/leccion-07-clases-y-objetos/Main.java)

#### Lección 8: Encapsulación y arrays de objetos (7 minutos)
* **Descripción**: Protege los datos del héroe para que nadie pueda ponerle vida negativa y forma un equipo de héroes en un array.
* **Video**: [Ver la lección](https://youtu.be/4amYrVKeS08)
* **Conclusiones clave**: `private` protege los atributos; los getters leen y los setters cambian con reglas; un array guarda varios objetos y empieza en la posición 0; `toUpperCase()`, `length()` y `charAt()` trabajan con textos.
* **Práctica**: [Protege a tu héroe en OnlineGDB](https://onlinegdb.com/IxVGC2IcVD)
* **Ejemplo terminado**: [Ver solución](completed-examples/leccion-08-encapsulacion-y-arrays/Main.java)

#### Lección 9: Proyecto final: El cofre del tesoro y errores comunes (9 minutos)
* **Descripción**: Junta todo lo aprendido en un juego de adivinanzas con clases y, al final, caza los cinco errores más comunes de los principiantes.
* **Video**: [Ver la lección](https://youtu.be/RsmKTq2GCII)
* **Conclusiones clave**: Un programa real combina clases, objetos, `Scanner`, `while` e `if-else`; lee el primer mensaje de error y la línea que indica; corrige una cosa a la vez; compara textos con `.equals()`.
* **Proyecto final**: [Juega y programa El cofre del tesoro](https://onlinegdb.com/DBMPvS0Tg)
* **Caza de errores**: [Encuentra los 5 errores](https://onlinegdb.com/UI648Mmdd3)
* **Ejemplo terminado**: [Ver solución del juego](completed-examples/leccion-09-proyecto-final/juego-del-cofre/Main.java)

---

## Recursos Adicionales

* **Código fuente completo**: [Repositorio de GitHub](https://github.com/code-nova-1asi0729/java-fundamentals-course-codenova)
* **Todas las actividades prácticas**:

| Lección | Actividad | Empezar a programar | Código en el repositorio |
| :---: | :--- | :--- | :--- |
| 1 | ¡Hola, Java! | [OnlineGDB](https://onlinegdb.com/UfaxAoSTH) | [Inicio](starter-files/leccion-01-hola-java) · [Terminado](completed-examples/leccion-01-hola-java) |
| 2 | Crea a tu héroe | [OnlineGDB](https://onlinegdb.com/7KD1UtWZZM) | [Inicio](starter-files/leccion-02-variables-y-tipos) · [Terminado](completed-examples/leccion-02-variables-y-tipos) |
| 3 | Golpes y monedas | [OnlineGDB](https://onlinegdb.com/ynYEGD_JR) | [Inicio](starter-files/leccion-03-operadores) · [Terminado](completed-examples/leccion-03-operadores) |
| 4 | ¿Game over? | [OnlineGDB](https://onlinegdb.com/cWlf0J6RB) | [Inicio](starter-files/leccion-04-decisiones-if-else) · [Terminado](completed-examples/leccion-04-decisiones-if-else) |
| 5 | Entrenamiento | [OnlineGDB](https://onlinegdb.com/kQNt54Hyg) | [Inicio](starter-files/leccion-05-bucles) · [Terminado](completed-examples/leccion-05-bucles) |
| 6 | Habla con el programa | [OnlineGDB](https://onlinegdb.com/39WPM2FEH) | [Inicio](starter-files/leccion-06-metodos-y-scanner) · [Terminado](completed-examples/leccion-06-metodos-y-scanner) |
| 7 | La clase Heroe | [OnlineGDB](https://onlinegdb.com/QrwwPNsC8) | [Inicio](starter-files/leccion-07-clases-y-objetos) · [Terminado](completed-examples/leccion-07-clases-y-objetos) |
| 8 | Protege a tu equipo | [OnlineGDB](https://onlinegdb.com/IxVGC2IcVD) | [Inicio](starter-files/leccion-08-encapsulacion-y-arrays) · [Terminado](completed-examples/leccion-08-encapsulacion-y-arrays) |
| 9 | El cofre del tesoro | [OnlineGDB](https://onlinegdb.com/DBMPvS0Tg) | [Inicio](starter-files/leccion-09-proyecto-final) · [Terminado](completed-examples/leccion-09-proyecto-final) |
| 9 | Caza de errores | [OnlineGDB](https://onlinegdb.com/UI648Mmdd3) | [Inicio](starter-files/leccion-09-proyecto-final/caza-errores) · [Terminado](completed-examples/leccion-09-proyecto-final/caza-errores) |

* **Cuestionario**: [Pon a prueba tus conocimientos](https://docs.google.com/forms/d/e/1FAIpQLSc30Qhgv4D7NH6eEX2FvYbn2Vz9WD7n83zFCGg4dnQZsMcpAQ/viewform)
* **Para seguir aprendiendo**: [dev.java (sitio oficial para aprender Java)](https://dev.java/learn/) · [Documentación de Java de Oracle](https://docs.oracle.com/en/java/)
* **Compartir**: #JavaBeginners

**¡Gracias por completar el curso!**

---

## Elaboración

**Resumen de la elaboración en equipo**: El equipo definió primero la ruta de aprendizaje y un hilo conductor común (el héroe de videojuego) para que cada lección se apoye en la anterior. Cada integrante tuvo a su cargo un módulo de tres lecciones: escribió el código de inicio y el ejemplo terminado, redactó el guion, grabó y editó el video, preparó las prácticas en OnlineGDB y registró sus aportes en este repositorio con ramas `feature/*` y Conventional Commits, siguiendo GitFlow (`feature` → `develop` → `main`).

* **Universidad Peruana de Ciencias Aplicadas**
* **Carrera de Ingeniería de Software**
* **Periodo**: 202620
* **Curso**: 1ASI0729 Desarrollo de Aplicaciones Open Source
* **NRC**: 16692
* **Nombre del equipo**: CodeNova
* **Líder del equipo**: Valladolid Jiménez, Arturo Fernando
* **Integrantes del equipo**:
  * Valladolid Jiménez, Arturo Fernando (u202420147): Lecciones 7, 8 y 9; estructura del repositorio, plan de curso y cuestionario
  * Diaz Vargas, Fernanda Ysabella (u202411843): Lecciones 1, 2 y 3
  * Romero Veliz, Matthias Alonso (u20241b178): Lecciones 4, 5 y 6
