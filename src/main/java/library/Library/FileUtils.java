package library.Library;

import java.io.*;

public class FileUtils {

    public static void  writeFile(String value, File file) throws IOException {
        FileWriter fw = new FileWriter(file,true);
        fw.write(value);
        fw.close();
    }
}
