
/*
Prática

Criar variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salário>, na data <data>.
 */

public class ExercicioTiposPrimitivosAula03 {
    public static void main(String[] args) {
        String  nome = "Maria de Fátima";
        String endereco = "Rua das Oliveiras 237";
        double salario = 3197;
        String dataRecebimentoSalario = "30 de Agosto de 2025";
        String relatorio = "Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de R$"+salario+ ", na data "+dataRecebimentoSalario+".";
        System.out.println(relatorio);

        /*
        Tabém posso fazer da seguinte forma:

        String  nome = "Maria de Fátima";
        String endereço = "Rua das Oliveiras 237";
        double salario = 3197;
        String dataRecebimentoSalario = "30 de Agosto de 2025";

        System.out.println("Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de R$"+salario+ ", na data "+dataRecebimentoSalario+".");
         */
    }
}