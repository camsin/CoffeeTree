package oraclegeneral;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private static  String usuario ="CoffeeTreePT1";
    private static String contrasena = "abcd1234";
    private static Connection con;
    private static Statement st;
    private static String query = null;
    
   
    public static Boolean verificarUsuario(){
    try {
            con= Conexion.getDBConexion();
            if(con!=null){
                con.close();
                return true;
            }
            return false;
        } catch (SQLException ex) {
            con=null;
            return false;
        }
        
    }
    
  
    public static Connection getDBConexion(){
        try {
            con= DriverManager.getConnection(url,usuario,contrasena);
        } catch (SQLException ex) {
            con = null;
        }
        return con;
    }
    
    
    public static Boolean creacionUsuario(){
        JOptionPane.showMessageDialog(null, "Hola, ¡bienvenido por primera vez al sistema!\n"
                    + "Porfavor, ingrese la contraseña para el usuario \"System\" \n" 
                    + "Asi se podra instalar la base de datos :D");
        File file = new File("CrearUser.txt");
        usuario = "system";
        contrasena = JOptionPane.showInputDialog("Introduzca la contraseña del usuario system");
        try {
            FileReader in =  new FileReader(file.getAbsolutePath());
            BufferedReader br = new BufferedReader(in);
            con = Conexion.getDBConexion();
            st = con.createStatement();
            while (br.readLine()!=null)   {
                query = br.readLine().toString();
                System.out.println (query);
                st.execute(query);
                query=null;
            }
            br.close();
            st.close();
            con.close();
        } catch (Exception e) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
                System.out.println("Error");
                return false;
        }
        return true;
        
    }
    
    
    public static Boolean creacionBase(){
        FileReader fstream = null;
        usuario = "CoffeeTreePT1";
        contrasena = "abcd1234";
         File file = new File("CrearBase.txt");
        try {
            con=Conexion.getDBConexion();
            st = con.createStatement();
            fstream = new FileReader(file.getAbsolutePath());
            BufferedReader br = new BufferedReader(fstream);
            while (br.readLine()!= null)   {
                query = br.readLine().toString();
                System.out.println (query);
                st.executeUpdate(query);
            }
            br.close();
            st.close();
            con.close();
        } catch (Exception e) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
                return false;
        }
        return true;
        
    }
    
    
}
