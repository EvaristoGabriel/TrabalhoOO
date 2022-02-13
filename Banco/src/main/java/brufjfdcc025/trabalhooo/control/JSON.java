package brufjfdcc025.trabalhooo.control;

import brufjfdcc025.trabalhooo.model.Cliente;
import brufjfdcc025.trabalhooo.model.PessoaFisica;
import brufjfdcc025.trabalhooo.model.PessoaJuridica;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JSON {
    
    public static String toJSON(Cliente c){
        Gson gson = new Gson();
        return gson.toJson(c);
    }
    
    public static Cliente toCliente(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, Cliente.class);
    }
    
    public static String toJSON(List<Cliente> clientes){
        Gson gson = new Gson();
        return gson.toJson(clientes);
    }
    
    public static List<Cliente> toPessoaFisica(String json){
        Gson gson = new Gson();
        Type clientesType = new TypeToken<List<PessoaFisica>>(){}.getType();
        return gson.fromJson(json, clientesType);
    }
    
    public static List<Cliente> toPessoaJuridica(String json){
        Gson gson = new Gson();
        Type clientesType = new TypeToken<List<PessoaJuridica>>(){}.getType();
        return gson.fromJson(json, clientesType);
    }
    
    public static String toJSON2(Cliente cliente){
        Gson gson = new Gson();
        return gson.toJson(cliente);
    }
}
