import java.util.HashMap;
import java.util.Map.Entry;

public class PessoaDAO {

    public void getById(Integer id){
        HashMap<Integer, Pessoa> pessoas = new HashMap<Integer, Pessoa>();    
    }
    
    public void getALL(){
        System.out.println("Registros: ");
        HashMap<Integer, Pessoa> hash;
        for(Map.EntryInteger String > entry : hash.entrySet()){
            System.out.println("id: "+entry.getKey()+ " Nome "+entry.getValue());
        }
    }
    
    public void add(Integer id, String nome){
        HashMap<Integer, Pessoa> hash;
        hash.put(id,nome)
        System.out.println("Adicionado ID: "+id+" e Nome "+nome);
    }

    public void delete(Integer id){

        Integer key = 0;

        HashMap<Integer, Pessoa> hash;
        for(Entry<Integer, Pessoa> entry : hash.entrySet()){
            key = entry.getKey();
            
            
        hash.remove(id);
        System.out.println("removido ID:" +id);

    }

    public void encerrar(){
        System.out.println("\n Encerrando \n");
    }
    
    public void getByNome(String nome){
        System.out.println("Registros: ");
        for(Map.EntryInteger String > entry : hash.entrySet()){
            if(entry.getValue().equals(nome)){
                System.out.println("id: "+entry.getKey()+ " Nome "+entry.getValue());
            }

}
