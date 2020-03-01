import org.w3c.dom.ls.LSInput;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        scanner.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        scanner.nextLine();

        System.out.println("Digite o ano de nascimento:");
        int ano = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o mês de nascimento:");
        int mes = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o dia de nascimento:");
        int dia = scanner.nextInt();

        scanner.nextLine();

        HeartRates pessoa = new HeartRates(nome, sobrenome, dia, mes, ano);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Sobrenome: " + pessoa.getSobrenome());
        System.out.println("Data de nascimento: " + pessoa.getDia() + "/" + pessoa.getMes() + "/" + pessoa.getAno());

        pessoa.idade(1, 3, 2020);
        System.out.println(pessoa.getNome() +" Tem " + pessoa.getIdade() + " anos.");

        System.out.println("A frequência máxima de batimentos cardíacos por minuto é: " + pessoa.frequenciaMaxima());

        System.out.println("A frenquência cardíaca alvo está entre " + pessoa.frenquenciaAlvoMin() + " e " + pessoa.frequenciaAlvoMax());



    }
}
