public class Jugador {
    // Atributos del jugador: nombre, puntos de vida, dirección actual y decisión tomada
    String nombre = " ";
    int puntos_de_vida = 50;
    String camino = "S";
    int decision = 0;

    /**
     * Método que evalúa si el jugador puede huir.
     * Solo se permite huir si el jugador tiene pescados disponibles.
     *
     * @param decision Valor 1 (luchar) o 2 (huir).
     * @param pescado Número de pescados disponibles.
     * @return true si puede huir o luchar; false si intenta huir sin pescados.
     */
    public boolean lucharHuir(int decision, int pescado) {
        boolean resultado = true;
        if (pescado > 0) {
            resultado = true;
        } else if (pescado == 0 && decision == 2) {
            return resultado = false;
        }
        return resultado;
    }

    /**
     * Comprueba si el jugador intenta retroceder, lo cual no está permitido.
     * No se puede volver por el mismo camino desde el que se vino.
     *
     * @param nuevo_camino Dirección introducida por el jugador.
     * @return false si intenta volver atrás; true en caso contrario.
     */
    public boolean Camino(String nuevo_camino) {
        if (nuevo_camino.equals("N") && camino.equals("S")) {
            System.out.println("❌ ¡No puedes volver atrás! Esa ruta está congelada.");
            return false;
        } else if (nuevo_camino.equals("E") && camino.equals("O")) {
            System.out.println("❌ ¡No puedes volver atrás! El hielo ya se rompió por ahí.");
            return false;
        } else if (nuevo_camino.equals("O") && camino.equals("E")) {
            System.out.println("❌ ¡No puedes volver atrás! Demasiado resbaladizo.");
            return false;
        } else if (nuevo_camino.equals("S") && camino.equals("N")) {
            System.out.println("❌ ¡No puedes volver atrás! Ya quemaste esa etapa del mapa.");
            return false;
        } else {
            return true;
        }
    }
