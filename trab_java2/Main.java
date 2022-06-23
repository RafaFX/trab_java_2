
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PessoaDAO DAO = new PessoaDAO();

        Pessoa pessoa = new Pessoa(null, null);

        String escolha = "";

        boolean sair = false;

        Integer parametroA = 0;

        String parametroB = "";



        do{
            System.out.println("Qual a proxima escolha?");

            System.out.println("************************************");

            System.out.println(" A: Procurar pessoa pelo id");

            System.out.println(" B: Mostrar todas as pessoas");

            System.out.println(" C: Adicionar uma nova pessoa");

            System.out.println(" D: Excluir uma pessoa");

            System.out.println(" X: Sair");

            Scanner leitor1  = new Scanner (System.in);

            Scanner leitor2 = new Scanner (System.in);

            escolha = leitor1.nextLine();

            switch (escolha) {
                case "A":
                    System.out.println("Qual id deseja procurar?");

                    parametroA = leitor1.nextInt();

                    DAO.getById(parametroA);
                    break;

                case "B":
                    DAO.getAll();
                    break;

                case "C":
                    System.out.println("Qual o nome da pessoa que deseja adicionar?");

                    parametroA = leitor1.nextInt();

                    System.out.println("Qual o nome da pessoa que deseja adicionar?");

                    parametroB = leitor2.nextLine();

                    DAO.add(parametroA,parametroB);
                    break;

                case "D":
                    System.out.println("Qual o id da pessoa que deseja excluir?");

                    parametroA = leitor1.nextInt();

                    DAO.delete(parametroA);
                    break;

                case "X":
                    System.out.println("Saindo...");

                    sair = true;

                    break;

                default:
                    System.out.println("Erro na escolha");
            }
        }while(!sair);
    }

}
