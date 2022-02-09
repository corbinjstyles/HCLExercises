package java8;

import java.util.HashMap;
import java.util.Map;

public class Java8ForEach {

    public static void main(String... args) {

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("1", "Java");
        map.put("2", "PHP");
        map.put("3", "Python");
        map.put("4", "Sharepoint");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println("Key: " + key + ", " + "Value: " + value);
        }
    }
}
