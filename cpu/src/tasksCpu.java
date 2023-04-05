import java.io.*;
import java.util.Arrays;

public class tasksCpu {
    public static void writeFile(String output, int cores) throws IOException {
        //Se crea la ruta para el archivo
        //se crea el archivo en la ruta especificada
        String archivo = System.getProperty("user.home") + "/cpuInfo.txt";
        File file = new File(archivo.replace("\\", "/"));
        //Se crea objeto encargado de escribir en el archivo el archivo
        FileWriter Writer = new FileWriter(archivo, true);
        //Se crea un buffer
        BufferedWriter bWriter = new BufferedWriter(Writer);
        //en caso de que exista el archivo solo escribe en el
        if(file.exists() && !file.isDirectory()){
            try{
                //escribe en el archivo
                bWriter.write(output +"\r\n");
            }catch(Exception e){
                System.out.println(e);
            }finally {
                bWriter.close();
            }
        }else{
            //en caso de que no exista el archivo lo crea y escribe las primeras lineas en el
            file.createNewFile();
            System.out.println("File created succesfully");
            try{
                //Escribe las primeras lineas
                bWriter.write(output);
            }catch(Exception e){
                System.out.println(e);
            }finally{
                bWriter.close();
            }
        }

    }
}
