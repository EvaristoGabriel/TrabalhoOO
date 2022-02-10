package brufjfdcc025.trabalhooo.control;

import brufjfdcc025.trabalhooo.Cliente;
import brufjfdcc025.trabalhooo.PessoaFisica;
import brufjfdcc025.trabalhooo.PessoaJuridica;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.HashSet;
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
    
    public static String toJSON(Set<Cliente> clientes){
        Gson gson = new Gson();
        return gson.toJson(clientes);
    }
    
    public static Set<Cliente> toPessoaFisica(String json){
        Gson gson = new Gson();
        Type clientesType = new TypeToken<Set<PessoaFisica>>(){}.getType();
        return gson.fromJson(json, clientesType);
    }
    
    public static Set<Cliente> toPessoaJuridica(String json){
        Gson gson = new Gson();
        Type clientesType = new TypeToken<Set<PessoaJuridica>>(){}.getType();
        return gson.fromJson(json, clientesType);
    }
}
