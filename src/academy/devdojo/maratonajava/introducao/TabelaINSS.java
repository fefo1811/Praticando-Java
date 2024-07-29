package academy.devdojo.maratonajava.introducao;

public class TabelaINSS {
    public static void main (String[] args) {
        double salario = 2667.68;
        double descontoINSS;

        if (salario <= 1412.0) {
            descontoINSS = salario * 0.075;
        } else if (salario > 1412.0 && salario <= 2666.68) {
            descontoINSS = salario * 0.09;
        } else if (salario > 2666.68 && salario <= 4000.04) {
            descontoINSS = salario * 0.12;
        } else {
            descontoINSS = salario * 0.14;
        }

        String resultado = "Como seu salário é de R$" + salario + " então o seu desconto do INSS é de R$" + descontoINSS;

        System.out.println(resultado);
    }
}
