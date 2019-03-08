package code;

import java.io.*;

public class FileReader {

    public void readWrite () {
        File dir = new File(".");

        try {
           String source = dir.getCanonicalPath() + File.separator + "Source.txt";

            String dest = dir.getCanonicalPath() + File.separator + "Dest.txt";

            File fin = new File(source);
            FileInputStream input = new FileInputStream(fin);
            BufferedReader in = new BufferedReader(new InputStreamReader(input));

            FileWriter outStream = new FileWriter(dest, true);
            BufferedWriter out = new BufferedWriter(outStream);
            String aLine = null;

            while ((aLine = in.readLine()) != null) {
                out.write(aLine);
                out.newLine();
            }
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
