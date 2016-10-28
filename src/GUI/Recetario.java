
package GUI;

import controladores.Productos;
import datos.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Recetario extends javax.swing.JFrame {
     
    private List<Productos> prod = new ArrayList<Productos>();
   
    public Recetario() {
        setUndecorated(true);
        initComponents();
        this.setSize(607, 201);
        this.setLocationRelativeTo(null);
        Productos p = new Productos();
        prod = Productos.productosRecetas();
        for(int i=0;i<prod.size();i++){
            lstProductos.addItem(prod.get(i).toString());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lstProductos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecetas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Producto");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 19, 43, 14);

        lstProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        lstProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstProductosActionPerformed(evt);
            }
        });
        getContentPane().add(lstProductos);
        lstProductos.setBounds(10, 39, 56, 20);

        jLabel2.setText("Receta");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 40, 34, 14);

        tblRecetas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Ingrediente", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(tblRecetas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(130, 80, 460, 150);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstProductosActionPerformed
        
        

    }//GEN-LAST:event_lstProductosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Recetario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recetario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recetario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recetario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recetario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> lstProductos;
    private javax.swing.JTable tblRecetas;
    // End of variables declaration//GEN-END:variables
}
