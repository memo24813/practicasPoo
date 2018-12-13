public class RFC{

    private String regla4="";

        public RFC()
        {

        }

    public String calcular_Rfc(String primer_Nombre,String segundo_Nombre,String apellido_Paterno,String apellido_Materno,String fecha)
        {
            String rfc;
            rfc=obseno((validar_apellido(primer_Nombre,segundo_Nombre,apellido_Paterno,apellido_Materno)+validar_nombre(primer_Nombre,segundo_Nombre,apellido_Paterno,apellido_Materno)))+validar_fecha(fecha)+"YYY";
            return rfc;
        }

   private String validar_fecha(String fecha)
        {
            String fechaN="";
            if(fecha.charAt(0)!='0' && Integer.parseInt(fecha.substring(1,2))<=9 && fecha.length()==7)
            {
                fechaN=fecha.substring(5,7)+fecha.substring(1,3)+"0"+fecha.substring(0,1);
            }
            else if(fecha.charAt(2)!='0'&& Integer.parseInt(fecha.substring(3,4))<=9 && fecha.length()==7)
            {
                fechaN=fecha.substring(5,7)+"0"+fecha.substring(2,3)+fecha.substring(0,2);
            }
            else if(fecha.charAt(0)!='0' && fecha.charAt(1)!='0' && fecha.length()==6)
            {
                fechaN=fecha.substring(4,6)+"0"+fecha.substring(1,2)+"0"+fecha.substring(0,1);
            }
            else
            {
                fechaN=fecha.substring(6,8)+fecha.substring(2,4)+fecha.substring(0,2);
            }
            return fechaN;
        }

        private String validar_apellido(String primer_Nombre,String segundo_Nombre,String apellido_Paterno,String apellido_Materno)
        {
            String apellido=apellido_Paterno.substring(0,2)+apellido_Materno.substring(0,1)+primer_Nombre.substring(0,1);

            if(apellido_Paterno.length()>4){regla4=apellido_Paterno.substring(0,5);}

            if((apellido_Paterno.charAt(0)=='C' && apellido_Paterno.charAt(1)=='H') || (apellido_Paterno.charAt(0)=='L' &&apellido_Paterno.charAt(1)=='L'))
            {
                apellido=apellido_Paterno.substring(0,1)+apellido_Paterno.substring(2,3)+apellido_Materno.substring(0,1);  
            }
            else if(apellido_Paterno.length()<=2)
            {
                apellido=apellido_Paterno.substring(0,1)+apellido_Materno.substring(0,1);
            }
            else if(regla4.equalsIgnoreCase("DE LA"))
            {
                apellido=apellido_Paterno.substring(6,7)+apellido_Materno.substring(0,1);
            }
            else if(apellido_Paterno.trim().length()==0)
            {
                apellido=apellido_Materno.substring(0,2);   
            }
            else if(apellido_Materno.trim().length()==0)
            {
                apellido=apellido_Paterno.substring(0,2);
            }
            else
            {
                apellido=apellido_Paterno.substring(0,2)+apellido_Materno.substring(0,1);
            }
            return apellido;
        }

        private String validar_nombre(String primer_Nombre,String segundo_Nombre,String apellido_Paterno,String apellido_Materno)
        {
            String nombre="";
            if(primer_Nombre.equalsIgnoreCase("MARIA") || primer_Nombre.equalsIgnoreCase("JOSE"))
            {   
                if(segundo_Nombre.trim().length()==0)
                {
                    nombre=apellido_Paterno.substring(0,1);
                }
                else
                {
                    nombre=segundo_Nombre.substring(0,1);
                }    
            }
            else if(regla4.equalsIgnoreCase("DE LA") || apellido_Paterno.length()<=2)
            {
                nombre=primer_Nombre.substring(0,2);   
            }
            else
            {
                nombre=primer_Nombre.substring(0,1);
            }
            return nombre;
        }

        private String obseno(String subnombre)
        {
            String nuevo=subnombre;
            String []obsenos=new String[39];
            obsenos[0]="BUEI";
            obsenos[1]="BUEY";
            obsenos[2]="CACA";
            obsenos[3]="CAGA";
            obsenos[4]="CAGO";
            obsenos[5]="CAKA";
            obsenos[6]="COGE";
            obsenos[7]="COJA";
            obsenos[8]="COJE";
            obsenos[9]="COJI";
            obsenos[10]="COJO";
            obsenos[11]="CULO";
            obsenos[12]="FETO";
            obsenos[13]="GUEY";
            obsenos[14]="JOTO";
            obsenos[15]="KACA";
            obsenos[16]="KACO";
            obsenos[17]="KAGA";
            obsenos[18]="KAGO";
            obsenos[19]="KOGE";
            obsenos[20]="KOJO";
            obsenos[21]="KAKA";
            obsenos[22]="KULO";
            obsenos[23]="MAME";
            obsenos[24]="MAMO";
            obsenos[25]="MEAR";
            obsenos[26]="MEON";
            obsenos[27]="MION";
            obsenos[28]="MOCO";
            obsenos[29]="MULA";
            obsenos[30]="PEDA";
            obsenos[31]="PEDO";
            obsenos[32]="PENE";
            obsenos[33]="PUTA";
            obsenos[34]="PUTO";
            obsenos[35]="QULO";
            obsenos[36]="RATA";
            obsenos[37]="RUIN";
            obsenos[38]="CACO";

            for(int i=0; i<39; i++)
            {
                if(subnombre.equalsIgnoreCase(obsenos[i]))
                {
                    nuevo=subnombre.substring(0,3)+"X";
                }
            }
            
            return nuevo;
        }

}