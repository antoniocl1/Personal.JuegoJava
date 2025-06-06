import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jugador jugador = new Jugador();
        Pinguino pinguino = new Pinguino();

        System.out.println("¡Bienvenido al juego de los pingüinos asesinos!");
        System.out.println("Empiezas con " + jugador.puntos_de_vida + " puntos de vida y 3 pescados.");

        while (jugador.puntos_de_vida > 0 && pinguino.pescado > 0) {
            int tamanyo = pinguino.Tamanyo();
            String tipo = pinguino.mostrarTamanyo(tamanyo);
            System.out.println("\n¡Aparece un pingüino tamaño " + tipo + "!");
            pinguino.mostrarTamanyoPinguino(tamanyo);

            System.out.println("\n¿Quieres luchar (1) o huir (2)?");
            int decision = sc.nextInt();

            boolean puedeSeguir = jugador.lucharHuir(decision, pinguino.pescado);

            if (!puedeSeguir) {
                System.out.println("¡Intentaste huir sin pescados! ¡Te comió el pingüino!");
                pinguino.mostrarDerrota();
                break;
            }

            if (decision == 2) {
                pinguino.pescadoCantidad(decision);
                System.out.println("Has huido. Pescados restantes:");
                pinguino.dibujoPescado(pinguino.pescado);
            } else {
                int daño = tamanyo * 5;
                jugador.puntos_de_vida -= daño;
                System.out.println("Has luchado y perdido " + daño + " puntos de vida. Vida restante: " + jugador.puntos_de_vida);
            }

            if (jugador.puntos_de_vida <= 0) {
                System.out.println("\nTe has quedado sin vida...");
                pinguino.mostrarDerrota();
                break;
            }

            if (pinguino.pescado <= 0) {
                System.out.println("\nTe has quedado sin pescados, ¡ya no puedes huir!");
            }
        }

        if (jugador.puntos_de_vida > 0 && pinguino.pescado > 0) {
            pinguino.mostrarVictoria();
        }

        sc.close();
    }
}
