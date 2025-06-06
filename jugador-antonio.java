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
