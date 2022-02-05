package brufjfdcc025.trabalhooo.arq;

import brufjfdcc025.trabalhooo.Cliente;
import com.google.gson.Gson;

public class JSON {
    
    public static String toJSON(Cliente c){
        Gson gson = new Gson();
        return gson.toJson(c);
    }
}
