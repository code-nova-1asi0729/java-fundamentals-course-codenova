// Lección 5: Bucles for y while (ejemplo terminado)

public class Main {
    public static void main(String[] args) {
        String nombre = "Luna";
        int monedas = 0;
        int vida = 100;

        for (int ronda = 1; ronda <= 5; ronda++) {
            System.out.println("Ronda " + ronda + ": " + nombre + " entrena y gana 10 monedas");
            monedas = monedas + 10;
        }
        System.out.println("Total de monedas: " + monedas);

        int golpes = 0;
        while (vida > 0) {
            vida = vida - 30;
            golpes++;
            System.out.println("¡Golpe! Vida: " + vida);
        }
        System.out.println("¡Game over! " + nombre + " resistió " + golpes + " golpes.");
    }
}
