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
