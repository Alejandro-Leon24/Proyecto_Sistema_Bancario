
package GUIE;

import java.util.Map;
import javax.swing.JFrame;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        //super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Pagina Principal");
        cambiarContenido();
        
        
    }

    public static <K, V> K obtenerPrimeraKey(Map<K, V> mapa) {
        // Obtener el conjunto de claves del mapa
        if (!mapa.isEmpty()) {
            return mapa.keySet().iterator().next();
        } else {
            return null; // Retorna null si el mapa está vacío
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Cerrar_sesion = new javax.swing.JButton();
        Inicio = new javax.swing.JButton();
        Movimientos = new javax.swing.JButton();
        Transaccion = new javax.swing.JButton();
        Mostrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        conte = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        saldo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        numero = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        Tcuenta = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menú principal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cerrar_sesion.setBackground(new java.awt.Color(255, 255, 102));
        Cerrar_sesion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Cerrar_sesion.setForeground(new java.awt.Color(51, 51, 51));
        Cerrar_sesion.setText("Salir");
        Cerrar_sesion.setFocusable(false);
        Cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cerrar_sesionActionPerformed(evt);
            }
        });
        jPanel1.add(Cerrar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 140, 40));

        Inicio.setBackground(new java.awt.Color(255, 255, 102));
        Inicio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Inicio.setForeground(new java.awt.Color(51, 51, 51));
        Inicio.setText("Inicio");
        Inicio.setFocusable(false);
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });
        jPanel1.add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 150, 40));

        Movimientos.setBackground(new java.awt.Color(255, 255, 102));
        Movimientos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Movimientos.setForeground(new java.awt.Color(51, 51, 51));
        Movimientos.setText("Depositar/Retirar");
        Movimientos.setFocusable(false);
        Movimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MovimientosActionPerformed(evt);
            }
        });
        jPanel1.add(Movimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 150, 40));

        Transaccion.setBackground(new java.awt.Color(255, 255, 102));
        Transaccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Transaccion.setForeground(new java.awt.Color(51, 51, 51));
        Transaccion.setText("Transacciones");
        Transaccion.setFocusable(false);
        Transaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransaccionActionPerformed(evt);
            }
        });
        jPanel1.add(Transaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, 40));

        Mostrar.setBackground(new java.awt.Color(255, 255, 102));
        Mostrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Mostrar.setForeground(new java.awt.Color(51, 51, 51));
        Mostrar.setText("Cuentas");
        Mostrar.setFocusable(false);
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });
        jPanel1.add(Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 150, 40));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 30, 550));

        conte.setBackground(new java.awt.Color(255, 255, 255));
        conte.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        conte.setFocusable(false);
        conte.setPreferredSize(new java.awt.Dimension(720, 540));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        saldo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        saldo.setForeground(new java.awt.Color(204, 255, 204));
        saldo.setText("$ ");
        jPanel2.add(saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 60, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tarjeta.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 90, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Saldo Disponible");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 110, -1));

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 16, 209, 31));

        nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 53, 120, 20));

        Tcuenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(Tcuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("F. Creacion");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 70, 20));

        fecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 80, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Bienvenido");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Dinero depositado");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 7, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 204));
        jLabel6.setText("$");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 70, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ingresado.png"))); // NOI18N
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 50, 40));

        tabla.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
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
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Transacciones recientes");

        javax.swing.GroupLayout conteLayout = new javax.swing.GroupLayout(conte);
        conte.setLayout(conteLayout);
        conteLayout.setHorizontalGroup(
            conteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(conteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(conteLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(conteLayout.createSequentialGroup()
                        .addGroup(conteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(conteLayout.createSequentialGroup()
                                .addGroup(conteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(conteLayout.createSequentialGroup()
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15))))
        );
        conteLayout.setVerticalGroup(
            conteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteLayout.createSequentialGroup()
                .addGroup(conteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(conteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(conteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(conteLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(conte, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 720, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cerrar_sesionActionPerformed

        dispose();
    }//GEN-LAST:event_Cerrar_sesionActionPerformed

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        cambiarContenido();
    }//GEN-LAST:event_InicioActionPerformed

    private void MovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MovimientosActionPerformed
        Deposito_Retirar dR = new Deposito_Retirar(null, true);
        conte.removeAll();
        conte.add(dR.getContentPane());
        conte.revalidate();
        conte.repaint();
        conte.setVisible(true);
    }//GEN-LAST:event_MovimientosActionPerformed

    private void TransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransaccionActionPerformed
        Historial historial = new Historial(null, true);
        conte.removeAll();
        conte.add(historial.getContentPane());
        conte.revalidate();
        conte.repaint();
        conte.setVisible(true);
    }//GEN-LAST:event_TransaccionActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        Cuentas Cuenta = new Cuentas(null, true);
        conte.removeAll(); // Elimina todos los componentes actuales del panel conte
        conte.add(Cuenta.getContentPane()); // Agrega el JPanel deseado (otroPanel) al panel conte
        conte.revalidate(); // Revalida el panel para que se muestren los cambios
        conte.repaint(); // Repinta el panel
        conte.setVisible(true); // Hace visible el panel
    }//GEN-LAST:event_MostrarActionPerformed

    private void cambiarContenido() {
        Inicio_Infor principal = new Inicio_Infor(null, true);
        conte.removeAll(); // Elimina todos los componentes actuales del panel conte
        conte.add(principal.getContentPane()); // Agrega el JPanel deseado (otroPanel) al panel conte
        conte.revalidate(); // Revalida el panel para que se muestren los cambios
        conte.repaint(); // Repinta el panel
        conte.setVisible(true); // Hace visible el panel
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar_sesion;
    private javax.swing.JButton Inicio;
    private javax.swing.JButton Mostrar;
    private javax.swing.JButton Movimientos;
    private javax.swing.JLabel Tcuenta;
    private javax.swing.JButton Transaccion;
    private javax.swing.JPanel conte;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel numero;
    private javax.swing.JLabel saldo;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
