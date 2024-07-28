package academy.devdojo.maratonajava.introducao;
/*
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu, <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.
 */
public class ExercicioTiposPrimitvo {
    public static void main (String[] args) {
        String nome = "Felipe";
        String endereco = "Rua Martim Pescador";
        float salario = 3800.00f;
        String data = "28/07/2024";

        System.out.println("Eu, " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de R$" + salario + " na data " + data);
    }
}
