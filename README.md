# Fundamentos de Java para Principiantes: La aventura del héroe

Código fuente del curso en video de introducción a Java y a la programación orientada a objetos (POO) para estudiantes de secundaria (12 a 17 años) sin experiencia previa.

📘 **Plan de curso completo** (videos, prácticas y recursos): [`course-plan.md`](course-plan.md)

---

## Requisitos

**Solo un navegador web** (Chrome, Firefox, Safari o Edge). No hay que instalar nada ni crear una cuenta: todo el código se ejecuta en [OnlineGDB](https://www.onlinegdb.com/online_java_compiler).

## Instrucciones de configuración

**Opción A: usar el enlace de la lección (recomendado)**

1. Abre [`course-plan.md`](course-plan.md) y elige una lección.
2. Haz clic en **Práctica**: OnlineGDB se abre con el código de inicio ya cargado.
3. Sigue los comentarios `PASO 1`, `PASO 2`… y pulsa **Run**.
4. Si el programa pide datos (lecciones 6 y 9), escríbelos en la consola de abajo y presiona Enter.

**Opción B: copiar el código desde este repositorio**

1. Entra a [OnlineGDB](https://www.onlinegdb.com/online_java_compiler) y verifica que arriba a la derecha diga **Java**.
2. Abre el archivo `Main.java` de la lección en `/starter-files`, cópialo y pégalo en el editor reemplazando todo.
3. Pulsa **Run**. Para comparar tu resultado, usa el mismo archivo en `/completed-examples`.

> En OnlineGDB, la clase con `main` debe llamarse `Main`. Por eso cada lección tiene un único archivo `Main.java`; las demás clases van en el mismo archivo, sin la palabra `public`.

## Estructura del repositorio

```
├── course-plan.md         Plan de curso: lecciones, videos, prácticas y recursos
├── starter-files/         Código de inicio de cada lección (con los PASOS a completar)
├── completed-examples/    Ejemplo terminado de cada lección
└── scripts/               Guion de cada video (narración, diapositivas y texto en pantalla)
```

## Lecciones

| # | Lección | Duración | Código de inicio | Ejemplo terminado | Guion |
| :---: | :--- | :---: | :--- | :--- | :--- |
| 1 | ¿Qué es programar y qué es Java? | 5 min | [inicio](starter-files/leccion-01-hola-java) | [terminado](completed-examples/leccion-01-hola-java) | [guion](scripts/leccion-01-hola-java.md) |
| 2 | Variables y tipos de datos | 7 min | [inicio](starter-files/leccion-02-variables-y-tipos) | [terminado](completed-examples/leccion-02-variables-y-tipos) | [guion](scripts/leccion-02-variables-y-tipos.md) |
| 3 | Operadores y expresiones | 6 min | [inicio](starter-files/leccion-03-operadores) | [terminado](completed-examples/leccion-03-operadores) | [guion](scripts/leccion-03-operadores.md) |
| 4 | Decisiones con if-else | 7 min | [inicio](starter-files/leccion-04-decisiones-if-else) | [terminado](completed-examples/leccion-04-decisiones-if-else) | [guion](scripts/leccion-04-decisiones-if-else.md) |
| 5 | Bucles for y while | 7 min | [inicio](starter-files/leccion-05-bucles) | [terminado](completed-examples/leccion-05-bucles) | [guion](scripts/leccion-05-bucles.md) |
| 6 | Métodos, parámetros y Scanner | 8 min | [inicio](starter-files/leccion-06-metodos-y-scanner) | [terminado](completed-examples/leccion-06-metodos-y-scanner) | [guion](scripts/leccion-06-metodos-y-scanner.md) |
| 7 | Clases y objetos | 8 min | [inicio](starter-files/leccion-07-clases-y-objetos) | [terminado](completed-examples/leccion-07-clases-y-objetos) | [guion](scripts/leccion-07-clases-y-objetos.md) |
| 8 | Encapsulación y arrays de objetos | 7 min | [inicio](starter-files/leccion-08-encapsulacion-y-arrays) | [terminado](completed-examples/leccion-08-encapsulacion-y-arrays) | [guion](scripts/leccion-08-encapsulacion-y-arrays.md) |
| 9 | Proyecto final y errores comunes | 9 min | [inicio](starter-files/leccion-09-proyecto-final) | [terminado](completed-examples/leccion-09-proyecto-final) | [guion](scripts/leccion-09-proyecto-final.md) |

## Flujo de trabajo

- **GitFlow:** `main` (versión publicada), `develop` (integración) y una rama `feature/leccion-XX-...` por lección o grupo de lecciones. Cada `feature` se integra a `develop` con un pull request; `develop` se integra a `main` para la entrega.
- **Conventional Commits** en inglés, con la lección como alcance:
  - `feat(lesson-04): add starter and completed examples`
  - `docs(lesson-04): add lesson script`
  - `docs(course-plan): add lesson 4 video and practice links`
- Los enlaces pendientes del plan de curso y de los guiones están marcados con `PENDIENTE-...` para encontrarlos con una búsqueda.

## Licencia

Material educativo de uso libre con fines de aprendizaje.
