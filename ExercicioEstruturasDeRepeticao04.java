public class ExercicioEstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // Dado o vaor de um carro, descruba em quantas vezes ele pode ser parcelado
        // condição valorParcela >= 1000

        double valorCarro = 50000;
        for (int parcela =1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
               break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
