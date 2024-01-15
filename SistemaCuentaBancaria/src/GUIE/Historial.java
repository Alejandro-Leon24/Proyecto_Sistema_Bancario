
package GUIE;

import static GUIE.Inicio_Infor.obtenerPrimeraKey;
import static Principal.Main.Usuarios;
import static Principal.Main.usuarioActivo;
import javax.swing.table.DefaultTableModel;

public class Historial extends javax.swing.JDialog {
DefaultTableModel model;  
    public Historial(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        model = new DefaultTableModel();
        model.addColumn("Usuario");
        model.addColumn("Cedula");
        model.addColumn("N Cuenta");
        model.addColumn("Dinero");
        tabla.setModel(model);
        
        if (!Usuarios.isEmpty()) {
            if(Usuarios.get(usuarioActivo).Cuentas.get(obtenerPrimeraKey(Usuarios.get(usuarioActivo).Cuentas)).transacciones.isEmpty()){
            
                Usuarios.get(usuarioActivo).Cuentas.forEach((a, b) -> {
                Object[] info2 = {Usuarios.get(usuarioActivo).getNombre(), Usuarios.get(usuarioActivo).getCedula(), b.getNumeroCuenta(), b.getSaldo()};
                model.addRow(info2);
                
            });
           }else{
                Usuarios.get(usuarioActivo).Cuentas.get(obtenerPrimeraKey(Usuarios.get(usuarioActivo).Cuentas)).transacciones.forEach((a, b) -> {
                Object[] info2 = {Usuarios.get(usuarioActivo).getNombre(), Usuarios.get(usuarioActivo).getCedula(), obtenerPrimeraKey(Usuarios.get(usuarioActivo).Cuentas),"+"+b};
                model.addRow(info2);
                
            });
                Usuarios.get(usuarioActivo).Cuentas.get(obtenerPrimeraKey(Usuarios.get(usuarioActivo).Cuentas)).retiros.forEach((a, b) -> {
                Object[] info2 = {Usuarios.get(usuarioActivo).getNombre(), Usuarios.get(usuarioActivo).getCedula(), obtenerPrimeraKey(Usuarios.get(usuarioActivo).Cuentas),"-"+b};
                model.addRow(info2);
                
            });
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        conte = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        conte.setBackground(new java.awt.Color(255, 255, 255));
        conte.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        conte.setFocusable(false);
        conte.setPreferredSize(new java.awt.Dimension(720, 540));
        conte.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setBackground(new java.awt.Color(255, 255, 255));
        tabla.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tabla.setForeground(new java.awt.Color(0, 0, 0));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Cedula", "N Cuenta", "Dinero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        conte.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 669, 440));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Historial de transacciones");
        conte.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 190, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(conte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel conte;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
