package controladores;

import datos.Ingrediente;
import datos.Producto;
import java.util.List;
import java.util.stream.Collectors;
import oraclegeneral.Conexion;

public class Ingredientes extends BaseController{
    
    public static List<Ingredientes> cantDisp(){

        String query = "select * from ingredientes";
        List<Ingredientes> precios = (List<Ingredientes>) Ingredientes.select(Conexion.getDBConexion(), query, Ingrediente.class);
        System.out.println("cant_disp = " + precios.stream().collect(Collectors.toList()));
        
        return precios;
    }
    
}
