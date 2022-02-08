package brufjfdcc025.trabalhooo.arq;

import brufjfdcc025.trabalhooo.Cliente;
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
    
    public static Set<Cliente> toClientes(String json){
        Gson gson = new Gson();
        Type clientesType = new TypeToken<Set<Cliente>>(){}.getType();
        return gson.fromJson(json, clientesType);
    }
}
