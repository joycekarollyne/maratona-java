public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, double e float 0
        // char '\u0000'''
        // boolean false
        // String null

        String [] nomes = new String[4];
        nomes[0] = "Joyce";
        nomes[1] = "Rhavi";
        nomes[2] = "Cecilia";
        nomes[3] = "Eduardo";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
