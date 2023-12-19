package connector;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

public abstract class Connector {
    public static <T> List<T> readFromJson(String path, Type type) {
        Gson gson = new Gson();
        List<T> list = null;
        try (FileReader reader = new FileReader(path)) {
            list = gson.fromJson(reader, type);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
