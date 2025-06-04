public class ExercicioEstruturasCondicionais04 {
    public static void main(String[] args) {
        // Quanto terei que pagar de imposto na Holanda em 2020 baseado no meu salario anual

        double salarioAnual = 70000;
        double primeiraFaixa = 9.78 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundaFaixa;
        }
        else {
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println(valorImposto);
    }
}
