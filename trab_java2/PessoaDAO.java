import java.util.*;

public class PessoaDAO {

    HashMap<Integer,String> hash = new HashMap<>();


    public void getAll(){
        System.out.println("Tabela de Pessoas");
        
        for(Map.Entry<Integer, String> entry : hash.entrySet()){
            System.out.println("Id: "+entry.getKey()+", Nome: "+entry.getValue());
        }
    }

    public void getById(Integer id){
        System.out.println(hash.getOrDefault(id,"Pessoa não encontrada encontrado"));
    }


    public void add(Integer id, String nome){
        hash.put(id,nome);
        System.out.println("Adicionado nova pessoa com Id: "+id+" e Nome: "+nome);
    }

    public void delete(Integer id){
        Integer key = 0;
        for(Map.Entry<Integer, String> entry : hash.entrySet()){
            key = entry.getKey();
            if (key == id){
                hash.remove(id);
                System.out.println("Excluida pessoa com Id: "+id);
            }
        }
    }
}
