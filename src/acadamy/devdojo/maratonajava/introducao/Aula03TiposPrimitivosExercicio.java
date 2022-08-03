package acadamy.devdojo.maratonajava.introducao;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {

        String nome = "Júlio";
        String endereco = "Rua Dália, 538, Jardim das Palmeiras - Palhoça/SC";
        double salario = 5000.0;
        String dataRecebimentoSalario = "10/08/2022";

        //\r\n = quebra uma linha (universal);
        System.out.println("Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de "
                + salario + ", na data " + dataRecebimentoSalario + "." + "\r\n");



        //String.format possui um atalho para imprimir, utilizando "System.out.printf";
        System.out.println(String.format("Eu %s, morando no endereço %s, confirmo que recebi o salário de %s, " +
                "na data %s.", nome, endereco, salario, dataRecebimentoSalario));
    }
}
