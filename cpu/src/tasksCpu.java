import java.io.*;
import java.util.Arrays;

public class tasksCpu {
    public static void writeFile(String output, int cores) throws IOException {
        String archivo = System.getProperty("user.home") + "/cpuInfo.txt";
        File file = new File(archivo.replace("\\", "/"));
        FileWriter Writer = new FileWriter(archivo, true);
        BufferedWriter bWriter = new BufferedWriter(Writer);
        if(file.exists() && !file.isDirectory()){
            try{
                PrintWriter print = new PrintWriter(bWriter);
                bWriter.write(output +"\r\n");
                bWriter.newLine();
            }catch(Exception e){
                System.out.println(e);
            }finally {
                bWriter.close();
            }
        }else{
            file.createNewFile();
            System.out.println("File created succesfully");
            try{

                PrintWriter print = new PrintWriter(bWriter);
                print.write(output);
                for(int i = 0; i <= cores; i++){

                    //System.out.println(output[]);
                }

            }catch(Exception e){
                System.out.println(e);
            }finally{
                bWriter.close();
            }
        }

    }
}
