package mista1984gmail;

import java.io.*;
import java.util.Arrays;

import static java.lang.System.out;

public class App {
    private static final String PATH = "C:\\Users\\intelisoft\\Desktop\\1112.txt";

    public static void main(String[] args) {
        /*OutputStream stream = null;
        try {
            stream = new FileOutputStream(PATH);
            System.setOut(new PrintStream(stream));
            for (int i = 0; i < Byte.MAX_VALUE; i++) {
                System.out.println(i + "t\n");
            }
            stream.flush();
            if (stream != null) {
                stream.close();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeCloseble(stream);

        }
    }*/

        File file = new File(PATH);
        InputStream inputStream = null;
        byte[]buffer=new byte[10240];
        try {
            inputStream = new FileInputStream(file);
            while (inputStream.available() > 0) {
                int i=inputStream.read(buffer);
                System.out.println(i);
                inputStream.read(buffer);
                System.out.println(Arrays.toString(Arrays.copyOfRange(buffer,0,i)));
                //System.out.println(new String(buffer));
                //System.out.println((char) inputStream.read());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void closeCloseble(Closeable closeable){
        try{
            if(closeable!=null){
                closeable.close();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
