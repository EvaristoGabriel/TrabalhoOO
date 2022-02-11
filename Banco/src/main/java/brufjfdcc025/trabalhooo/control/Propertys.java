package brufjfdcc025.trabalhooo.control;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class Propertys implements JsonSerializer<Object>, JsonDeserializer<Object>{
    
    private static final String CLASSE = "Tipo";
    
    @Override
    public JsonElement serialize(Object objeto, Type tipo, JsonSerializationContext json) {
        JsonElement jsonelement = json.serialize(objeto,objeto.getClass());
        jsonelement.getAsJsonObject().addProperty(CLASSE, objeto.getClass().getCanonicalName());
        return jsonelement;
    }

    @Override
    public Object deserialize(JsonElement jsonelement, Type tipo, JsonDeserializationContext json) throws JsonParseException {
        JsonObject jsonobject = jsonelement.getAsJsonObject();
        String classe = jsonobject.get(CLASSE).getAsString();
        try {
            Class<?> clz = Class.forName(classe);
            return json.deserialize(jsonelement, clz);
        } catch (Exception e) {
            throw new JsonParseException(e);
        }
        
    }
    
}
