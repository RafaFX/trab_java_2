import java.util.HashMap;
import java.util.Scanner;


public class main {

    public static void main (String [] args) {

        PessoaDAO DAO = new PessoaDAO();
        Pessoa pessoa = new Pessoa();

        Integer paramsa = 0;
        String paramsb = "";
        String escolha = "";
        boolean sair = false;

        do{
            System.out.println("Digite qual das operações deseja realizar?");
            System.out.println("I - Encontrar um registro pelo ID");
            System.out.println("M - Mostrar todos");
            System.out.println("A - Adicionar um novo registro");
            System.out.println("R - Remover");
            System.out.println("E - Encerrar");

            Scanner scanner;
            escolha = scanner.nextLine();
            
            

            Scanner leitor;
            switch (escolha) {
                case "I":
                    System.out.println("Qual o ID?");
                    
                    Scanner leitor2 = new Scanner (System.in);

                    DAO.getById(paramsa);
                    leitor.close();
                    break;
                
                case "M":
                    DAO.getALL();
                    break;

                case "A":
                    System.out.println("Qual o ID do registro para adicionar?");
                    paramsa = leitor.next.Int();
                    System.out.println("Qual o nome do registro para adicionar?");
                    paramsb = leitor.nextLine();
                    DAO.add(paramsa, paramsb);
                    break;

                case "R":
                    Integer id;
                    DAO.delete(id);
                    break;
                
                case "ESC":
                    DAO.encerrar();
                    break;
                    System.out.println("Encerrar");
                    sair = true;
                    break;
                default:
                    System.out.println(" Opção inválida");
            }
        }while(!sair);


    }
    
}
