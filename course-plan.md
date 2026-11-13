# Fundamentos de Java para Principiantes: La aventura del héroe

## Resumen del Curso

Este curso de aproximadamente 1 hora introduce a estudiantes de secundaria a la programación con Java, desde su primer "¡Hola, mundo!" hasta la programación orientada a objetos (POO). Lección a lección, el estudiante construye a un héroe de videojuego: primero guarda sus datos en variables, luego le enseña a tomar decisiones y a repetir acciones, después lo convierte en una clase con datos protegidos y, al final, programa con él un juego completo: **El cofre del tesoro**.

**¡No requiere descargas!** Todo se programa en el navegador con un editor en línea gratuito.

* **Duración total**: ~64 minutos (9 lecciones de 5 a 9 minutos)
* **Público objetivo**: Estudiantes de 12 a 17 años sin experiencia en programación
* **Prerrequisitos**: Ninguno
* **Herramientas necesarias**: **¡Solo tu navegador web!** (Chrome, Firefox, Safari o Edge)
* **Editor en línea**: [OnlineGDB](https://www.onlinegdb.com/online_java_compiler) 👈 **¡No necesitas registrarte!**
* **📂 Repositorio de código fuente**: [https://github.com/code-nova-1asi0729/java-fundamentals-course-codenova](https://github.com/code-nova-1asi0729/java-fundamentals-course-codenova)

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
* **Video**: [Ver la lección](PENDIENTE-VIDEO-L1)
* **Conclusiones clave**: Un programa es una lista de instrucciones; todo programa en Java empieza en `main`; `System.out.println("...")` muestra un mensaje; cada instrucción termina en `;`.
* **Práctica**: [¡Hola, Java! en OnlineGDB](PENDIENTE-ONLINEGDB-L1) 👈 **¡No necesitas registrarte!**
* **Ejemplo terminado**: [Ver solución](PENDIENTE-ONLINEGDB-L1-SOLUCION)

#### Lección 2: Variables y tipos de datos (7 minutos)
* **Descripción**: Guarda los datos de tu héroe (nombre, vida, monedas, velocidad y si tiene escudo) en variables, y conoce los tipos de datos más usados.
* **Video**: [Ver la lección](PENDIENTE-VIDEO-L2)
* **Conclusiones clave**: Una variable es una caja con nombre; `int` para enteros, `double` para decimales, `String` para textos, `boolean` para verdadero o falso; declara como `int vida = 100;` y une textos con `+`.
* **Práctica**: [Crea a tu héroe en OnlineGDB](PENDIENTE-ONLINEGDB-L2) 👈 **¡Inicio inmediato!**
* **Ejemplo terminado**: [Ver solución](PENDIENTE-ONLINEGDB-L2-SOLUCION)

#### Lección 3: Operadores y expresiones (6 minutos)
* **Descripción**: Haz que tu héroe reciba golpes, gane monedas y revise si puede comprar una espada usando operadores matemáticos, de comparación y lógicos.
* **Video**: [Ver la lección](PENDIENTE-VIDEO-L3)
* **Conclusiones clave**: `+ - * / %` para calcular; `+=` suma y guarda; `> < >= <= ==` comparan y dan `true` o `false`; `&&` significa "y", `||` significa "o"; entre enteros, `7 / 2` da `3`.
* **Práctica**: [Calcula en OnlineGDB](PENDIENTE-ONLINEGDB-L3)
* **Ejemplo terminado**: [Ver solución](PENDIENTE-ONLINEGDB-L3-SOLUCION)

### Módulo B: Haciendo que el programa piense

#### Lección 4: Decisiones con if-else (7 minutos)
* **Descripción**: Enséñale al juego a decidir: ¿game over, poca vida o en plena forma? ¿Alcanzan las monedas para una poción?
* **Video**: [Ver la lección](PENDIENTE-VIDEO-L4)
* **Conclusiones clave**: `if (condición) { }` se ejecuta solo si la condición es verdadera; `else if` revisa otra opción; `else` cubre todo lo demás; la condición va entre paréntesis y el bloque entre llaves.
* **Práctica**: [Toma decisiones en OnlineGDB](PENDIENTE-ONLINEGDB-L4)
* **Ejemplo terminado**: [Ver solución](PENDIENTE-ONLINEGDB-L4-SOLUCION)

#### Lección 5: Bucles for y while (7 minutos)
* **Descripción**: Repite acciones sin copiar y pegar: entrena a tu héroe varias rondas con `for` y haz que resista golpes hasta el game over con `while`.
* **Video**: [Ver la lección](PENDIENTE-VIDEO-L5)
* **Conclusiones clave**: `for (int i = 1; i <= 5; i++)` repite un número fijo de veces; `while (condición)` repite mientras la condición sea verdadera; si nada cambia dentro del `while`, el bucle nunca termina.
* **Práctica**: [Repite en OnlineGDB](PENDIENTE-ONLINEGDB-L5)
* **Ejemplo terminado**: [Ver solución](PENDIENTE-ONLINEGDB-L5-SOLUCION)

#### Lección 6: Métodos, parámetros y entrada con Scanner (8 minutos)
* **Descripción**: Ordena tu código en métodos reutilizables, envíales datos con parámetros y deja que el jugador escriba el nombre de su héroe con `Scanner`.
* **Video**: [Ver la lección](PENDIENTE-VIDEO-L6)
* **Conclusiones clave**: Un método es un bloque con nombre que se puede llamar muchas veces; los parámetros son los datos que recibe; `return` devuelve un resultado; `Scanner` lee el teclado con `nextLine()` y `nextInt()`.
* **Práctica**: [Habla con el programa en OnlineGDB](PENDIENTE-ONLINEGDB-L6)
* **Ejemplo terminado**: [Ver solución](PENDIENTE-ONLINEGDB-L6-SOLUCION)

### Módulo C: Programación orientada a objetos y proyecto final

#### Lección 7: Clases y objetos (8 minutos)
* **Descripción**: Junta todos los datos y acciones del héroe en una clase, el "molde", y crea varios héroes a partir de ella con `new`.
* **Video**: [Ver la lección](PENDIENTE-VIDEO-L7)
* **Conclusiones clave**: Una clase es un molde y un objeto es lo que creas con él; los atributos son lo que el objeto tiene y los métodos lo que hace; el constructor da los valores iniciales; cada objeto guarda sus propios datos.
* **Práctica**: [Crea tu clase Heroe en OnlineGDB](PENDIENTE-ONLINEGDB-L7) 👈 **¡No necesitas registrarte!**
* **Ejemplo terminado**: [Ver solución](PENDIENTE-ONLINEGDB-L7-SOLUCION)

#### Lección 8: Encapsulación y arrays de objetos (7 minutos)
* **Descripción**: Protege los datos del héroe para que nadie pueda ponerle vida negativa y forma un equipo de héroes en un array.
* **Video**: [Ver la lección](PENDIENTE-VIDEO-L8)
* **Conclusiones clave**: `private` protege los atributos; los getters leen y los setters cambian con reglas; un array guarda varios objetos y empieza en la posición 0; `toUpperCase()`, `length()` y `charAt()` trabajan con textos.
* **Práctica**: [Protege a tu héroe en OnlineGDB](PENDIENTE-ONLINEGDB-L8)
* **Ejemplo terminado**: [Ver solución](PENDIENTE-ONLINEGDB-L8-SOLUCION)

#### Lección 9: Proyecto final: El cofre del tesoro y errores comunes (9 minutos)
* **Descripción**: Junta todo lo aprendido en un juego de adivinanzas con clases y, al final, caza los cinco errores más comunes de los principiantes.
* **Video**: [Ver la lección](PENDIENTE-VIDEO-L9)
* **Conclusiones clave**: Un programa real combina clases, objetos, `Scanner`, `while` e `if-else`; lee el primer mensaje de error y la línea que indica; corrige una cosa a la vez; compara textos con `.equals()`.
* **Proyecto final**: [Juega y programa El cofre del tesoro](PENDIENTE-ONLINEGDB-L9-JUEGO) 👈 **¡Comparte tu juego!**
* **Caza de errores**: [Encuentra los 5 errores](PENDIENTE-ONLINEGDB-L9-ERRORES)
* **Ejemplo terminado**: [Ver solución del juego](PENDIENTE-ONLINEGDB-L9-SOLUCION)

---

## Recursos Adicionales

* **Código fuente completo**: [Repositorio de GitHub](https://github.com/code-nova-1asi0729/java-fundamentals-course-codenova)
* **Todas las actividades prácticas**:

| Lección | Actividad | Empezar a programar | Código en el repositorio |
| :---: | :--- | :--- | :--- |
| 1 | ¡Hola, Java! | [OnlineGDB](PENDIENTE-ONLINEGDB-L1) | [Inicio](starter-files/leccion-01-hola-java) · [Terminado](completed-examples/leccion-01-hola-java) |
| 2 | Crea a tu héroe | [OnlineGDB](PENDIENTE-ONLINEGDB-L2) | [Inicio](starter-files/leccion-02-variables-y-tipos) · [Terminado](completed-examples/leccion-02-variables-y-tipos) |
| 3 | Golpes y monedas | [OnlineGDB](PENDIENTE-ONLINEGDB-L3) | [Inicio](starter-files/leccion-03-operadores) · [Terminado](completed-examples/leccion-03-operadores) |
| 4 | ¿Game over? | [OnlineGDB](PENDIENTE-ONLINEGDB-L4) | [Inicio](starter-files/leccion-04-decisiones-if-else) · [Terminado](completed-examples/leccion-04-decisiones-if-else) |
| 5 | Entrenamiento | [OnlineGDB](PENDIENTE-ONLINEGDB-L5) | [Inicio](starter-files/leccion-05-bucles) · [Terminado](completed-examples/leccion-05-bucles) |
| 6 | Habla con el programa | [OnlineGDB](PENDIENTE-ONLINEGDB-L6) | [Inicio](starter-files/leccion-06-metodos-y-scanner) · [Terminado](completed-examples/leccion-06-metodos-y-scanner) |
| 7 | La clase Heroe | [OnlineGDB](PENDIENTE-ONLINEGDB-L7) | [Inicio](starter-files/leccion-07-clases-y-objetos) · [Terminado](completed-examples/leccion-07-clases-y-objetos) |
| 8 | Protege a tu equipo | [OnlineGDB](PENDIENTE-ONLINEGDB-L8) | [Inicio](starter-files/leccion-08-encapsulacion-y-arrays) · [Terminado](completed-examples/leccion-08-encapsulacion-y-arrays) |
| 9 | El cofre del tesoro | [OnlineGDB](PENDIENTE-ONLINEGDB-L9-JUEGO) | [Inicio](starter-files/leccion-09-proyecto-final) · [Terminado](completed-examples/leccion-09-proyecto-final) |
| 9 | Caza de errores | [OnlineGDB](PENDIENTE-ONLINEGDB-L9-ERRORES) | [Inicio](starter-files/leccion-09-proyecto-final/caza-errores) · [Terminado](completed-examples/leccion-09-proyecto-final/caza-errores) |

* **Cuestionario**: [Pon a prueba tus conocimientos](PENDIENTE-FORMULARIO-CUESTIONARIO)
* **Para seguir aprendiendo**: [dev.java (sitio oficial para aprender Java)](https://dev.java/learn/) · [Documentación de Java de Oracle](https://docs.oracle.com/en/java/)
* **Compartir**: #JavaBeginners

**¡Gracias por completar el curso!**

---

## 👥 Elaboración

**Resumen de la elaboración en equipo**: El equipo definió primero la ruta de aprendizaje y un hilo conductor común (el héroe de videojuego) para que cada lección se apoye en la anterior. Cada integrante tuvo a su cargo un módulo de tres lecciones: escribió el código de inicio y el ejemplo terminado, redactó el guion, grabó y editó el video, preparó las prácticas en OnlineGDB y registró sus aportes en este repositorio con ramas `feature/*` y Conventional Commits, siguiendo GitFlow (`feature` → `develop` → `main`).

* **Universidad Peruana de Ciencias Aplicadas**
* **Carrera de Ingeniería de Software**
* **Periodo**: 202620
* **Curso**: 1ASI0729 Desarrollo de Aplicaciones Open Source
* **NRC**: 16692
* **Nombre del equipo**: CodeNova
* **Líder del equipo**: Valladolid Jiménez, Arturo Fernando
* **Integrantes del equipo**:
  * Valladolid Jiménez, Arturo Fernando (u202420147): Lecciones 7, 8 y 9; estructura del repositorio y plan de curso
  * Diaz Vargas, Fernanda Ysabella (u202411843): Lecciones 1, 2 y 3; cuestionario
  * Romero Veliz, Matthias Alonso (u20241b178): Lecciones 4, 5 y 6
* **Fecha de entrega**: 14 de noviembre de 2026
