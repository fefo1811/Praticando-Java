package academy.devdojo.maratonajava.introducao;

public class Operadores {
    public static void main (String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero02 + numero01;
        System.out.println(resultado);

        // AND e OR
        System.out.println("==================");
        System.out.println("Operadores lógicos AND e OR");
        int idade = 23;
        float salario = 3500.0f;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);
    }
}
