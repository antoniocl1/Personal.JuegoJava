public class Main {
    public static void main(String[] args) {
        Pinguino miPinguino = new Pinguino();
        int tamanyo = miPinguino.Tamanyo();
        String tipo = miPinguino.mostrarTamanyo(tamanyo);
        System.out.println("Tamaño aleatorio: " + tipo);
        miPinguino.mostrarTamanyoPinguino(tamanyo);
    }
}
