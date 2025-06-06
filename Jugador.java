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

    /**
     * Muestra las direcciones disponibles según el camino actual.
     *
     * @param nuevo_camino Dirección actual del jugador.
     * @return Cadena con las opciones disponibles.
     */
    public String elegirCamino(String nuevo_camino) {
        String direccion = " ";
        switch (nuevo_camino) {
            case "N":
                direccion = "🌍 Opciones: N = norte, E = este, O = oeste";
                break;
            case "S":
                direccion = "🌍 Opciones: S = sur, E = este, O = oeste";
                break;
            case "E":
                direccion = "🌍 Opciones: N = norte, S = sur, E = este";
                break;
            case "O":
                direccion = "🌍 Opciones: N = norte, S = sur, O = oeste";
                break;
        }
        return direccion;
    }
}
