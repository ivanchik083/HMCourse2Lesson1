package lesson1;

import java.io.*;
import java.lang.reflect.Field;

public class App {

    static String FILE = "Monitor.txt";
    static String s;


    public static void main(String[] args) throws IllegalAccessException {

        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE));
            while ((s = br.readLine()) !=null ) {
                String[] pars  = s.split(",");

                Monitor monitor = Monitor.createMonitor();
               Class monitorClass = monitor.getClass();
                Field nf = monitorClass.getDeclaredField("brand");
                nf.setAccessible(true);
                nf.set(monitor, pars[0]);
                Field nf1 = monitorClass.getDeclaredField("model");
                nf1.setAccessible(true);
                nf1.set(monitor, pars[1]);
                Field nf2 = monitorClass.getDeclaredField("price");
                nf2.setAccessible(true);
                nf2.set(monitor, pars[2]);

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
