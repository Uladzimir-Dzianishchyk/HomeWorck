import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        Planet ozz = new Planet("Ozz", 120034);

        Thread myThread = new Thread(() -> {
            try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myClass.txt")))
            {

                oos.writeObject(ozz);
            }
            catch(Exception ex){

                System.out.println(ex.getMessage());
            }
        });
        myThread.start();

        ObjectMapper mapper = new ObjectMapper();

        mapper.writeValue(new File("first.json"),ozz);

        Planet ozz2 = mapper.readValue(new File("first.json"),Planet.class);

        System.out.println(ozz2);


    }
}
