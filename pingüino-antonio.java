public class Pinguino {

    // Atributo que almacena el número total de pingüinos derrotados por el jugador
    int pin_muertos = 0;

    // Cantidad de pescados que posee el jugador
    int pescado = 3;

    /**
     * Genera un tamaño aleatorio entre 1 y 5 para el pingüino enemigo.
     *
     * @return Número aleatorio del 1 al 5 correspondiente al tamaño.
     */
    public int Tamanyo() {
        int ping_aleatorio = (int) (Math.random() * 5 + 1);
        return ping_aleatorio;
    }

    /**
     * Reduce la cantidad de pescado si el jugador decide huir (opción 2).
     *
     * @param decision Valor que indica la decisión del jugador (1 = luchar, 2 = huir).
     * @return Cantidad actualizada de pescados tras la acción.
     */
    public int pescadoCantidad(int decision) {
        if (decision == 2) {
            pescado = pescado - 1;
        }
        return pescado;
    }

    /**
     * Imprime en consola un dibujo de pescados según la cantidad restante.
     *
     * @param pescado Número de pescados a mostrar visualmente.
     */
    public void dibujoPescado(int pescado) {
        int contador = 0;
        while (contador != pescado) {
            System.out.print(" ><_> ");
            contador = contador + 1;
        }
        System.out.println(); // Salto de línea tras imprimir los pescados
    }
