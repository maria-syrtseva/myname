package goitpackage;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Map<String, String> jsonMap = new HashMap<>();
        jsonMap.put("name", "Maria");
        jsonMap.put("lastName", "Syrtseva");

        Gson gson = new Gson();
        String jsonString = gson.toJson(jsonMap);

        System.out.println(jsonString);
    }
}
