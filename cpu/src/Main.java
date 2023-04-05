import java.io.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        tasksCpu fileWrite = new tasksCpu();
        String cmd = "cpu";
        int cores = Runtime.getRuntime().availableProcessors();
        String output;
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        try{
            Process job = Runtime.getRuntime().exec(cmd);
            BufferedReader input = new BufferedReader(new InputStreamReader(job.getInputStream()));
            System.out.println(cores);
            while ((output= input.readLine()) != null) {
                fileWrite.writeFile(output, cores);
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }
}