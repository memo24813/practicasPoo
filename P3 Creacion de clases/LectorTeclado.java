import java.io.*;


public class LectorTeclado{

    public static String leer()
    {
        String lectura = new String();

        InputStreamReader lectorTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(lectorTeclado);

        try{
            lectura = buffer.readLine();

        }catch(IOException IOerror)
        {
            System.out.println("hubo un error: ");
            System.out.println(IOerror);
        }
        return lectura;
    }
}