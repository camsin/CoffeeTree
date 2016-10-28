package oraclegeneral;
import GUI.Inicio;

public class InicioSistema {
     
    public static void main(String[] args) { 
             
        if(Conexion.verificarUsuario()==true){
            Inicio in = new Inicio(); 
             in.setVisible(true);
             
        }else{
            if((Conexion.creacionUsuario() == true) && (Conexion.creacionBase()== true)){
            Inicio in = new Inicio();
            in.setVisible(true);
            }
        }
            }

}
