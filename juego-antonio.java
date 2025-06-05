import java.util.InputMismatchException;
import java.util.Scanner;

public class Juego {

    // Nombre del jugador, inicializado por defecto
    static String nombre = "Explorador Sin Nombre";

    // Instancias de las clases Jugador y Pinguino
    static Pinguino pin;
    static Jugador explorador;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inicialización de objetos
        explorador = new Jugador();
        pin = new Pinguino();

        // Mensaje de bienvenida
        System.out.println("**********************************************************");
        System.out.println("*                                                        *");
        System.out.println("*  ❄️ ¡BIENVENIDO A LA ISLA DEL PINGÜINO MUTANTE! ❄️    *");
        System.out.println("*                                                        *");
        System.out.println("*   ¿Estás preparado para enfrentarte a criaturas        *");
        System.out.println("*   heladas, con aletas y MUY MALAS PULGAS?              *");
        System.out.println("*                                                        *");
        System.out.println("*   Lucha, corre o... lanza pescado. Sí, como lo oyes.   *");
        System.out.println("*                                                        *");
        System.out.println("**********************************************************");

        // Solicitud del nombre del jugador
        System.out.print("\nNecesito saber tu nombre, valiente cazador de pingüinos mutantes: ");
        nombre = sc.nextLine();

        System.out.println("\n🧊 Encantado, " + nombre + "! Empiezas tu aventura con 50 puntos de vida.");
        System.out.println("💨 Estás avanzando hacia el SUR, el lugar más frío y peligroso, ten cuidado por favor!.");
        System.out.print("🎣 ¡Tienes esto a tu favor! Pescados mágicos: ");
        pin.dibujoPescado(pin.pescado);

        // Bucle principal del juego: continúa hasta ganar o perder
        while (explorador.puntos_de_vida > 0 && pin.pin_muertos < 5) {
            String direccion = "S";
            System.out.println("\n❓ Encrucijada del destino: ¿A dónde quieres ir?");
            System.out.println("➡️ " + explorador.elegirCamino(explorador.camino));
            direccion = sc.nextLine().toUpperCase();

            boolean caminoValido = explorador.Camino(direccion);
            explorador.camino = direccion;

             if (caminoValido) {
                int tamanoPinguino = pin.Tamanyo();

                System.out.println("\n🚨 ¡ALERTA DE CRIATURA! Un pingüino mutante ha aparecido...");
                pin.mostrarTamanyoPinguino(tamanoPinguino);

                do {
                    try {
                        if (pin.pescado > 0) {
                            System.out.print("\n🎣 Te quedan estos pescaditos para huir: ");
                            pin.dibujoPescado(pin.pescadoCantidad(explorador.decision));
                            System.out.println();
                        }

                        System.out.println("\n🔥 ¿Cuál será tu jugada maestra?");
                        System.out.println("1️⃣ Luchar como un campeón");
                        if (pin.pescado > 0) {
                            System.out.println("2️⃣ Lanzar pescado y salir corriendo");
                        }

                        explorador.decision = sc.nextInt();

                    } catch (InputMismatchException ex) {
                        System.out.println("⛔ ¡Error! Eso no es un número válido. Intenta de nuevo (1 o 2).");
                        explorador.decision = 0;
                        sc.nextLine(); // Limpiar el buffer
                    }

                    // Validación si no quedan pescados
                    if (explorador.decision == 2 && pin.pescado == 0) {
                        while (explorador.decision != 1) {
                            System.out.println("😅 Lo siento, no te queda pescado. ¡A pelear toca!");
                            System.out.println("1️⃣ Luchar como un campeón");
                            explorador.decision = sc.nextInt();
                        }
                    }
                } while (explorador.decision == 0);

                // Aplicar las consecuencias del combate o huida
                explorador = Puntos(explorador.decision, tamanoPinguino, explorador);

                // Mostrar el estado actual del jugador
                System.out.println("\n❤️ Vida restante: " + explorador.puntos_de_vida);
                System.out.println("🧊 Pingüinos derrotados: " + pin.pin_muertos + "/5");
                sc.nextLine(); // Esperar Enter para continuar
            }

            // Comprobación de condiciones de fin de juego
            if (pin.pin_muertos == 5) {
                pin.mostrarVictoria();
            } else if (explorador.puntos_de_vida <= 0) {
                pin.mostrarDerrota();
            }
        }
    }

    /**
     * Método que calcula los puntos de vida ganados o perdidos según la decisión del jugador.
     *
     * @param decision   Opción elegida por el jugador: 1 (luchar) o 2 (huir).
     * @param pinguino   Tamaño del pingüino (1 a 5).
     * @param explorador Objeto que representa al jugador.
     * @return Objeto Jugador actualizado.
     */
    public static Jugador Puntos(int decision, int pinguino, Jugador explorador) {
        int num_aleatorio = switch (pinguino) {
            case 1 -> 1 + (int)(Math.random() * 10);
            case 2 -> 10 + (int)(Math.random() * 11);
            case 3 -> 20 + (int)(Math.random() * 11);
            case 4 -> 30 + (int)(Math.random() * 11);
            case 5 -> 40 + (int)(Math.random() * 11);
            default -> 0;
        };

        if (decision == 2 && pin.pescado != 0) {
            explorador.puntos_de_vida -= 1;
            System.out.println("💨 ¡Has lanzado un pescado y has huido como un campeón!");
        } else if (decision == 1) {
            int dado = Dado();
            System.out.println("🎲 Has lanzado el dado... ¡Resultado: " + dado + "!");

            if (pinguino < dado) {
                explorador.puntos_de_vida += num_aleatorio;
                pin.pin_muertos++;
                System.out.println("🎉 ¡Victoria! Has ganado " + num_aleatorio + (num_aleatorio == 1 ? " punto" : " puntos") + " de vida.");


