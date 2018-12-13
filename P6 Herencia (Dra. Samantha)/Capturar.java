import java.util.Scanner;

public class Capturar{


    public static int capturaInt(String mensaje)
    {
        Scanner captura=new Scanner(System.in);

        System.out.println(mensaje);
        return (captura.nextInt());

    }

    public static String capturaString(String mensaje)
    {
        Scanner captura=new Scanner(System.in);

        System.out.println(mensaje);
        return (captura.nextLine());

    }

    public static double capturaDouble(String mensaje)
    {
        Scanner captura=new Scanner(System.in);

        System.out.println(mensaje);
        return (captura.nextDouble());

    }


}