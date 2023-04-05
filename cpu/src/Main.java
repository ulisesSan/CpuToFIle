import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        tasksCpu fileWrite = new tasksCpu();
        String cmd = "cpu";
        //Accedemos a la camtidad de nucleos para una futura caracteristica
        int cores = Runtime.getRuntime().availableProcessors();
        String output;
        try{
            //Se ejecuta el comando
            Process job = Runtime.getRuntime().exec(cmd);
            BufferedReader input = new BufferedReader(new InputStreamReader(job.getInputStream()));
            System.out.println(cores);
            //leemos y almacenamos la informacion
            while ((output= input.readLine()) != null) {
                //Agregamos los datos a nuestro metodo
                fileWrite.writeFile(output, cores);
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }
}