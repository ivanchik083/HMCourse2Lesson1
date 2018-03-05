package lesson1;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class App {

        private static final String FILE = "Monitor.txt";

    public static void main(String[] args) throws IOException {

        try {
            Monitor monitor = new Monitor("Dell", "RLO1234", "9865");
            final FileOutputStream fos = new FileOutputStream(FILE);
            final ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(monitor);
            oos.close();

            System.out.println(monitor);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
