package acadamy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    // psvm é o atalho para public static void main(String[] args) {};
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean;
        int idade = 10;
        long numeroGrande = 100000;
        double salarioDouble = 2000.0;
        float salarioFloat = 20000000;
        byte idadeByte = 127;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';

        //sout é o atalho para System.out.println;
        // ctrl alt L = identar o código;
        System.out.println("A idade é " + idade + " anos");

        //classe sempre inicia com letra maiúscula;
        String nome = "Goku";

        System.out.println("Oi, eu sou " + nome + "!");
    }
}