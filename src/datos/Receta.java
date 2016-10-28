
package datos;

import static datos.Producto.producto_id;
import java.beans.PropertyChangeSupport;
import java.math.BigDecimal;


public class Receta {
    public static final String ing_id = "ingrediente_id";
    public static final String cant_r = "cant";
    
    private BigDecimal cant;
    private BigDecimal ingrediente_id;
    
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    public BigDecimal getIngrediente_id() {
        return ingrediente_id;
    }

    public void setIngrediente_id(BigDecimal ingrediente_id) {
        java.math.BigDecimal oldId_producto = this.ingrediente_id;
        this.ingrediente_id = ingrediente_id;
        propertyChangeSupport.firePropertyChange(ing_id, oldId_producto, ingrediente_id);
    }

    

    public BigDecimal getCant() {
        return cant;
    }

    public void setCant(BigDecimal cant) {
        java.math.BigDecimal oldId_producto = this.cant;
        this.cant = cant;
        propertyChangeSupport.firePropertyChange(cant_r, oldId_producto, cant);
    }
    
    
}
