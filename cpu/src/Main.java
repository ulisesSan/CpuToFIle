import java.io.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        String archivo = System.getProperty("user.home") + "/ToDoList.txt";
        String output = "";
        String cmd = "cpu";
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        try{
            File file = new File(archivo.replace("\\", "/"));
            if(file.exists() && !file.isDirectory()){
                System.out.println("File Exists");
            }else{
                file.createNewFile();
                System.out.println("File created succesfully");
            }
            FileWriter Writer = new FileWriter(archivo);
            BufferedWriter bWriter = new BufferedWriter(Writer);
            Process job = Runtime.getRuntime().exec(cmd);
            BufferedReader input = new BufferedReader(new InputStreamReader(job.getInputStream()));
            while ((output = input.readLine()) != null){
                System.out.println(output);
                bWriter.write(output);
                //bWriter.close();
            }

        }catch(Exception e){
            System.out.println(e);
        }

    }
}