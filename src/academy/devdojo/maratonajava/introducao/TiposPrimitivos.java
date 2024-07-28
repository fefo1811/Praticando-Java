package academy.devdojo.maratonajava.introducao;

import java.util.Arrays;

public class TiposPrimitivos {
    public static void main (String[] args) {
        int idade = 23;
        long meuPatrimonio = 100000000;
        double salarioDouble = 3000.0d;
        float salarioFloat = 3000.0F;
        byte idadeByte = 127;
        short idadeShort = 23;
        boolean verdade = true;
        boolean falso = false;
        char caractere = 87;

        String nome = "Felipe";

        System.out.println("Meu nome é " + nome + " e minha idade atualmente é " + idade +  " anos.");
        System.out.println("87 na tabela ASCII representa a letra: " + caractere);
        System.out.println(salarioFloat);
    }
}
