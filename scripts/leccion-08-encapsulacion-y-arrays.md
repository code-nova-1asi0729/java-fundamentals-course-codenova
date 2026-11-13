# Guion – Lección 8: Encapsulación y arrays de objetos

**Duración:** 7 min
**Editor:** OnlineGDB (lenguaje: Java)
**Video:** PENDIENTE-VIDEO-L8
**Práctica:** PENDIENTE-ONLINEGDB-L8
**Archivos:** `/starter-files/leccion-08-encapsulacion-y-arrays` → `/completed-examples/leccion-08-encapsulacion-y-arrays`

**Objetivo:** al terminar, el estudiante protege los atributos con `private`, los usa con getters y setters, guarda varios objetos en un array y aplica métodos básicos de `String`.

---

## Parte 1: Presentación (diapositivas)

**Diapositiva 1 – Portada**
"¡Hola! Bienvenido a la lección 8. En la lección anterior creamos héroes con una clase. Hoy vamos a resolver un problema: cualquiera podía cambiar la vida de un héroe a -50. ¡Eso no tiene sentido! Vamos a proteger sus datos y a formar un equipo."

> Texto en pantalla: **Lección 8 · Encapsulación y arrays**

**Diapositiva 2 – La caja fuerte**
"Piensa en una caja fuerte. Lo que hay adentro no se puede tocar directamente: hay que pedirlo por una ventanilla, y la ventanilla revisa que la petición tenga sentido. Eso es la **encapsulación**: guardar los datos dentro del objeto y dejar que solo sus métodos los cambien."

> Texto en pantalla: **Encapsular = proteger los datos**

**Diapositiva 3 – private, getters y setters**
"Con la palabra `private`, el atributo queda dentro de la caja fuerte. Para leerlo usamos un **getter**, como `getVida()`. Para cambiarlo usamos un **setter**, como `setVida()`, y dentro del setter revisamos que el valor sea válido: la vida nunca puede ser menor que 0 ni mayor que 100."

> Anotación: dibujo de la caja fuerte con dos ventanillas, *get (leer)* y *set (cambiar con reglas)*.

**Diapositiva 4 – Un array: la fila de casilleros**
"Ahora, el equipo. Un **array** es como una fila de casilleros numerados donde guardamos varias cosas del mismo tipo. `Heroe[] equipo = new Heroe[3];` crea tres casilleros para héroes. Ojo: el primer casillero es el 0, no el 1. Con `equipo.length` sabemos cuántos casilleros hay."

> Texto en pantalla: `equipo[0]` · `equipo[1]` · `equipo[2]`

**Diapositiva 5 – Los textos también tienen métodos**
"Un `String` también es un objeto, ¡y trae métodos listos para usar! `toUpperCase()` lo pone en mayúsculas, `length()` cuenta sus letras y `charAt(0)` te da la primera letra."

**Diapositiva 6 – Actividad práctica**
"Abre el enlace de OnlineGDB de la descripción. Primero pulsa **Run** sin cambiar nada y mira lo que pasa con la vida de Luna. Después sigue los pasos y pausa cuando lo necesites."

> Texto en pantalla: **⏸ Abre el enlace de la descripción**

---

## Parte 2: Práctica en OnlineGDB

**Inicio**
"Ejecutamos: 'Luna tiene -50 de vida'. ¡Eso es un error en nuestro juego! Vamos a arreglarlo."

**Paso 1 – private**
"Escribimos `private` delante de `nombre` y de `vida`. Ejecutamos y… ¡error! Java nos dice que `vida` es privada. Eso es lo que queríamos: ya nadie puede tocarla desde afuera. Borramos esas dos líneas de `main` para seguir."

> Texto en pantalla: **El error es buena señal: los datos están protegidos**

**Paso 2 – Getters**
"Creamos `getNombre()`, que devuelve el nombre con `return nombre;`, y `getVida()`, que devuelve la vida. Se llaman con `get` porque 'get' en inglés es 'obtener'."

**Paso 3 – Setter con reglas**
"Ahora `setVida(int vida)`. Usamos el `if` de la lección 4: si la vida es menor que 0, guardamos 0; si es mayor que 100, guardamos 100; si no, guardamos el valor que llegó."

**Paso 4 – recibirGolpe usa el setter**
"Cambiamos `recibirGolpe` para que llame a `setVida(vida - golpe)`. Así, aunque el golpe sea enorme, la vida se queda en 0. Probamos con `luna.setVida(-50);` y ahora dice 0. ¡Arreglado!"

**Paso 5 – El equipo**
"Creamos `Heroe[] equipo = new Heroe[3];` y llenamos los casilleros: `equipo[0] = new Heroe("Luna");`, luego Max en el 1 y Sol en el 2."

**Paso 6 – Recorrer el equipo**
"Usamos el `for` de la lección 5: desde `i = 0` mientras `i < equipo.length`. Dentro mostramos `equipo[i].getNombre()` y `equipo[i].getVida()`. ¡Tres héroes con una sola línea de código!"

**Paso 7 – Métodos de String**
"Guardamos el nombre del primer héroe en una variable y mostramos `toUpperCase()`, `length()` y `charAt(0)`. Sale LUNA, 4 letras, y la L."

**Reto**
"Pausa el video: haz que Max reciba un golpe de 150. ¿Su vida baja de 0? Gracias a nuestro setter, no."

---

## Parte 3: Cierre

**Diapositiva 7 – Resumen y buenas prácticas**
"¡Excelente! Hoy aprendiste a proteger los datos con `private`, a leerlos con getters y a cambiarlos con setters que revisan las reglas. También guardaste un equipo entero en un array. Recuerda: los arrays empiezan en 0, y el último casillero es `length - 1`. Si pides el casillero 3 de un array de 3, Java se queja."

**Diapositiva 8 – Lo que viene**
"Ya tienes todas las piezas: variables, decisiones, bucles, métodos, clases y arrays. En la última lección vamos a juntarlas en un juego de verdad. ¡Nos vemos!"
