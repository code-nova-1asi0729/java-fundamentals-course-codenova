# Guion – Lección 7: Clases y objetos

**Duración:** 8 min
**Editor:** OnlineGDB (lenguaje: Java)
**Video:** PENDIENTE-VIDEO-L7
**Práctica:** PENDIENTE-ONLINEGDB-L7
**Archivos:** `/starter-files/leccion-07-clases-y-objetos` → `/completed-examples/leccion-07-clases-y-objetos`

**Objetivo:** al terminar, el estudiante crea una clase con atributos, un constructor y métodos, y crea varios objetos a partir de ella.

---

## Parte 1: Presentación (diapositivas)

**Diapositiva 1 – Portada**
"¡Hola! Bienvenido a la lección 7. Hasta ahora nuestro héroe vivía en variables sueltas: una para el nombre, otra para la vida, otra para las monedas. ¿Y si el juego tiene diez héroes? ¡Serían treinta variables! Hoy vamos a juntar todo en un solo lugar con algo que se llama clase."

> Texto en pantalla: **Lección 7 · Clases y objetos**

**Diapositiva 2 – El molde y las galletas**
"Imagina un molde de galletas con forma de estrella. El molde no se come: solo dice qué forma tendrá cada galleta. Con un solo molde puedes hacer muchas galletas, y cada una puede tener su propio sabor. En Java, el molde es la **clase** y cada galleta es un **objeto**."

> Texto en pantalla: **Clase = molde · Objeto = cosa creada con el molde**

**Diapositiva 3 – Lo que el héroe TIENE y lo que HACE**
"Toda clase responde dos preguntas. ¿Qué tiene? Un nombre, una vida y monedas: eso son los **atributos**. ¿Qué hace? Se presenta, recibe golpes, gana monedas: eso son los **métodos**. Los métodos ya los conoces de la lección 6; ahora viven dentro de la clase."

> Anotación: tabla de dos columnas, *Tiene (atributos)* y *Hace (métodos)*.

**Diapositiva 4 – El constructor**
"Cuando nace un héroe, alguien tiene que darle su nombre y su vida inicial. Ese trabajo lo hace el **constructor**: un método especial que tiene el mismo nombre de la clase y se ejecuta solo cuando creamos el objeto. La palabra `this` significa 'este héroe', y la usamos para no confundir el atributo `nombre` con el parámetro `nombre`."

> Texto en pantalla: `Heroe(String nombre) { this.nombre = nombre; }`

**Diapositiva 5 – Crear objetos con new**
"Para hacer una galleta usamos la palabra `new`. `Heroe luna = new Heroe("Luna");` crea un héroe nuevo y lo guarda en la variable `luna`. Para que haga algo, escribimos el nombre del objeto, un punto y el método: `luna.presentarse();`."

> Anotación: flecha de `new` hacia un dibujo de dos héroes, Luna y Max.

**Diapositiva 6 – Actividad práctica**
"¡Ahora te toca! Abre el enlace de OnlineGDB que está en la descripción del video. No necesitas instalar nada ni crear una cuenta. Sigue los comentarios PASO 1, PASO 2… y pausa el video cuando lo necesites."

> Texto en pantalla: **⏸ Abre el enlace de la descripción**

---

## Parte 2: Práctica en OnlineGDB

**Inicio**
"Este es el código de inicio. Arriba está la clase `Heroe`, todavía vacía, y abajo está `Main`, donde empieza el programa. Los comentarios te dicen qué hacer."

**Paso 1 – Atributos**
"Dentro de la clase escribimos `String nombre;`, `int vida;` e `int monedas;`. Son las mismas variables de antes, pero ahora pertenecen al héroe."

**Paso 2 – Constructor**
"Escribimos `Heroe(String nombre)` y, entre llaves, `this.nombre = nombre;`, `this.vida = 100;` y `this.monedas = 0;`. Así todo héroe nace con 100 de vida y sin monedas."

**Paso 3 – Método presentarse**
"Creamos `void presentarse()`. `void` significa que el método no devuelve nada, solo hace algo: imprime 'Soy', el nombre, 'y tengo', la vida, 'de vida'."

**Paso 4 – Método recibirGolpe**
"Este método recibe un número, el golpe, y se lo resta a la vida: `vida = vida - golpe;`."

**Paso 5 – Crear dos héroes**
"Ahora vamos a `main`. Escribimos `Heroe luna = new Heroe("Luna");` y `Heroe max = new Heroe("Max");`. ¡Usamos el mismo molde dos veces!"

**Paso 6 – Presentarlos**
"`luna.presentarse();` y `max.presentarse();`. Pulsamos **Run** y… los dos tienen 100 de vida."

**Paso 7 – Un golpe para Luna**
"`luna.recibirGolpe(30);` y la presentamos otra vez. Luna baja a 70, pero Max sigue con 100. Cada objeto guarda sus propios datos: el golpe a Luna no le duele a Max."

> Texto en pantalla: **Cada objeto tiene sus propios datos**

**Reto**
"Pausa el video y crea el método `ganarMonedas(int cantidad)`. Luego haz que Max gane 15 monedas. Si te trabas, la solución está en la carpeta `completed-examples` del repositorio."

---

## Parte 3: Cierre

**Diapositiva 7 – Resumen y buenas prácticas**
"¡Muy bien! Repasemos. La clase es el molde y el objeto es lo que creas con `new`. Los atributos son lo que el objeto tiene y los métodos, lo que hace. Dos consejos: el nombre de una clase empieza con mayúscula, como `Heroe`, y el de un objeto con minúscula, como `luna`. Y no olvides el `new`: sin él, el objeto no existe."

**Diapositiva 8 – Lo que viene**
"Pero hay un problema: ahora cualquiera puede escribir `luna.vida = -50` y romper el juego. En la próxima lección vamos a proteger los datos del héroe y a formar un equipo completo. ¡Nos vemos!"
