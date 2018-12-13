import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JOptionPane;
import java.util.*;
public class MatrizFloat extends Matriz{
    float array[][];

    public MatrizFloat(int renglones,int columnas)
    {
        super(renglones,columnas);
        array= new float [renglones][columnas];
    }

    public void iniciarMatFloat()
    {
        Random gen=new Random();
        for(int i=0; i<this.renglones; i++)
        {
            for(int j=0; j<this.columnas; j++)
            {
                this.array[i][j]=(float)(gen.nextInt(1000))/100;
            }
        }
    }
    public void imprimirMatFloat()
    {
        for(int i=0; i<this.renglones; i++)
        {
            for(int j=0; j<this.columnas; j++)
            {
                System.out.print(this.array[i][j]+"\t");
            }
            System.out.println();
        }
    }

public void imprimirMatFloatG()
{
    DecimalFormat df = new DecimalFormat("#00");
    String cadena="";
    for(int i=0; i<this.renglones; i++)
    {
        for(int j=0; j<this.columnas; j++)
        {
            cadena+= df.format(array[i][j])+"       ";
        }
        cadena+="\n";
    }
   JOptionPane.showMessageDialog(null,cadena);
}
}