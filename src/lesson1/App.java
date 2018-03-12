package lesson1;

import java.io.*;
import java.lang.reflect.Field;

public class App {

    static String FILE = "Monitor.txt";
    static String s;


    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE));
            while ((s = br.readLine()) !=null ) {
                String[] pars  = s.split(",");

                Monitor monitor = new Monitor(pars[0], pars[1], pars[2]);
                Class monitorClass = monitor.getClass();
                Field nf = monitorClass.getDeclaredField("brand");
                nf.setAccessible(true);


                System.out.println(monitor.toString());
                System.out.println("++++++++++++++++++");


            }
            br.close();



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }

}
