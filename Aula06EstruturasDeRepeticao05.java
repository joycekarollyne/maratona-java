public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        // Dado o vaor de um carro, descruba em quantas vezes ele pode ser parcelado
        // condição valorParcela >= 1000

        double valorCarro = 50000;
        for (int parcela = (int) valorCarro; parcela >= 1; parcela--) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
