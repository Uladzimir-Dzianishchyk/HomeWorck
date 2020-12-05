import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Planet ozz = new Planet("Ozz", 120034);

        ObjectMapper mapper = new ObjectMapper();

        mapper.writeValue(new File("first.json"),ozz);

        Planet ozz2 = mapper.readValue(new File("first.json"),Planet.class);

        System.out.println(ozz2);
    }
}
