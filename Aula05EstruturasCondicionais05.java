public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        /* O Switch me permite executar diferentes blocos de código
         dependendo do valor de uma expressão. Uma alternativa mais
         organizada e eficiente do que usar vários if/else quando
         há várias opções a serem consideradas.
         */

        // char, int, byte, shor, enum, String

        // Imprima o dia da semana, considerando 1 como domingo
        byte dia = 3;
        switch (dia) {
            case 1 :
                System.out.println("Domingo");
                break;
            case 2 :
                System.out.println("Segunda");
                break;
            case 3 :
                System.out.println("Terça");
                break;
            case 4 :
                System.out.println("Quarta");
                break;
            case 5 :
                System.out.println("Quinta");
                break;
            case 6 :
                System.out.println("Sexta");
                break;
            case 7 :
                System.out.println("Sabádo");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        // Imprima o sexo considerando M(masculino) e F(feminino)
        char sexo = 'F';
        switch (sexo) {
            case 'M' :
                System.out.println("Masculino");
                break;
            case 'F' :
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Inválido");
        }
    }
}
