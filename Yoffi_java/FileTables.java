import java.io.FileOutputStream;
import java.io.IOException;
public class FileTables {
    public static void main(String[] args) {
        try {
            FileOutputStream fout=new FileOutputStream("tables.txt");
            for (int i=1;i<=10;i++) {
                for (int j=1;j<=10;j++) {
                    String line = i+"x"+j+"="+(i*j)+"\n";
                    fout.write(line.getBytes());
                }
                fout.write("\n".getBytes());
            }
            fout.close();
            } catch (IOException e) {
            e.getStackTrace();
        }
    }
}