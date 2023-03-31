import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.writeBytes("whoops");
    }
    public void writeBytes(String string) throws IOException {
        FileOutputStream out;
        out = new FileOutputStream("out.txt");
        out.write(string.getBytes());
    }
}

