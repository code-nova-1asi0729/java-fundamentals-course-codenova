// Lección 8: Encapsulación y arrays de objetos (ejemplo terminado)

class Heroe {
    // private: nadie fuera de la clase puede cambiar estos datos directamente
    private String nombre;
    private int vida;

    public Heroe(String nombre) {
        this.nombre = nombre;
        this.vida = 100;
    }

    // Getters: permiten LEER los datos
    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    // Setter: permite CAMBIAR la vida, pero solo con valores válidos
    public void setVida(int vida) {
        if (vida < 0) {
            this.vida = 0;
        } else if (vida > 100) {
            this.vida = 100;
        } else {
            this.vida = vida;
        }
    }

    public void recibirGolpe(int golpe) {
        setVida(vida - golpe);
    }
}

public class Main {
    public static void main(String[] args) {
        Heroe luna = new Heroe("Luna");
        luna.setVida(-50);
        System.out.println(luna.getNombre() + " tiene " + luna.getVida() + " de vida.");

        // Un array guarda varios héroes en una sola variable
        Heroe[] equipo = new Heroe[3];
        equipo[0] = new Heroe("Luna");
        equipo[1] = new Heroe("Max");
        equipo[2] = new Heroe("Sol");

        System.out.println("--- Mi equipo ---");
        for (int i = 0; i < equipo.length; i++) {
            System.out.println(equipo[i].getNombre() + ": " + equipo[i].getVida() + " de vida");
        }

        // Métodos de String sobre el nombre del primer héroe
        String nombre = equipo[0].getNombre();
        System.out.println("En mayúsculas: " + nombre.toUpperCase());
        System.out.println("Número de letras: " + nombre.length());
        System.out.println("Primera letra: " + nombre.charAt(0));

        // Reto: la vida nunca baja de 0
        equipo[1].recibirGolpe(150);
        System.out.println(equipo[1].getNombre() + " tiene " + equipo[1].getVida() + " de vida.");
    }
}
