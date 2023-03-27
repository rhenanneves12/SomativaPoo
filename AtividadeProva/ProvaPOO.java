import java.util.Scanner;

public class ProvaPOO {
    Scanner sc = new Scanner(System.in);

    public void atividade1() {
        System.out.println("Insira o número 1 ");
        double num1 = sc.nextDouble();
        System.out.println("Insira o número 2");
        double num2 = sc.nextDouble();

        System.out.println("Escolha a operação aritmética:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int opcao = sc.nextInt();

        double result = 0;

        switch (opcao) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
            case 5:
                result = num1 / 0;
                break;
            default:
                System.out.println("Não foi possivel fazer essa operação");
                return;
        }

        System.out.println("O resultado da operação é: " + result);
    }

    public void atividade2() {
        System.out.println("Numero da Matricula do Aluno");
        int matri = sc.nextInt();
        int resultado = (matri % 4);

        if (resultado == 0) {
            System.out.println("Coloque no time 1 (Cris)");
        }
        if (resultado == 1) {
            System.out.println("Coloque no time 2 (Greg)");
        }
        if (resultado == 2) {
            System.out.println("Coloque no time 3 (Caruso)");
        }
        if (resultado == 3) {
            System.out.println("Coloque no time 4 (Jerome)");
        }
    }

    public void atividade3() {
        System.out.println("Digite o valor do Kilo do Morango");
        int kgMorangos = sc.nextInt();
        System.out.println("Digite o valor do Kilo da Maçã");
        int kgMaca = sc.nextInt();
        System.out.println("Digite o valor do Kilo da sua Banana");
        int kgBanana = sc.nextInt();
        int totalKg = kgMorangos + kgBanana + kgMaca;
        System.out.println("O valor em KG da sua sacola é R$ " + totalKg);
        double Desconto = 0.90;
        double valorKgMorango = kgMorangos * 3.50;
        double valorKgMaca = kgMaca * 2.30;
        double valorKgBanana = kgBanana * 1.80;
        double valorTotal = valorKgMorango + valorKgMaca + valorKgBanana;
        System.out.println("O valor total da sua compra foi  R$ " + valorTotal);
        if (valorTotal >= 0) {
            Desconto = 0;
        } else if (valorTotal >= 30) {
            Desconto = 0.90;
        } 
        double valorTotalDesconto = valorTotal * Desconto;
        System.out.println("O valor total da sua compra com Desconto é R$ " + valorTotalDesconto);

    }
}