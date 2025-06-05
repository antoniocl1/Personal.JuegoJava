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

