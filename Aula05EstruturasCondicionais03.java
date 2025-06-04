public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000

        double salario = 2800;
        String mensagemDoar = "Eu vou doar 50 reais";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter";
        String resultado;
        if (salario > 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);
    }
}


        // Operador Ternário OBS: usar somente em situações onde if/else for simples
        /* public class Aula05EstruturasCondicionais03 {
              public static void main(String[] args) {
                 Doar se salario > 5000

                double salario = 2800;
                String mensagemDoar = "Eu vou doar 100 reais";
                String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter";

                °°°(condicao) ? verdadeiro : falso
                String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar

                System.out.println(resultado);
              }
           }
        */



      // Deixando o codigo de forma mais limpa

        /*public class Aula05EstruturasCondicionais03 {
             public static void main(String[] args) {
                Doar se salario > 5000

                double salario = 2800;

                °°°(condicao) ? verdadeiro : falso
                String resultado = salario > 5000 ? "Eu vou doar 100 reais" : "Ainda não tenho condições, mas vou ter"

                System.out.println(resultado);
             }
          }
        */