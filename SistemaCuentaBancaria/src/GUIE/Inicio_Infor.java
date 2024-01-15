
package GUIE;

import Logica.Cuenta;
import static Principal.Main.Usuarios;
import static Principal.Main.usuarioActivo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class Inicio_Infor extends javax.swing.JDialog {
 long primeraKey = obtenerPrimeraKey(Usuarios.get(usuarioActivo).Cuentas);

DefaultTableModel model;  

    public Inicio_Infor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
         iniciarDatos();

        model = new DefaultTableModel();
        model.addColumn("Usuario");
        model.addColumn("Cedula");
        model.addColumn("N Cuenta");
        model.addColumn("Dinero");
        tabla.setModel(model);
        
        if (!Usuarios.isEmpty()) {
            if(Usuarios.get(usuarioActivo).Cuentas.get(obtenerPrimeraKey(Usuarios.get(usuarioActivo).Cuentas)).transacciones.isEmpty()){
//            Usuarios.get(usuarioActivo).Cuentas.forEach((a, b) -> {
//                Object[] info2 = {Usuarios.get(usuarioActivo).getNombre(), Usuarios.get(usuarioActivo).getCedula(), b.getNumeroCuenta(), b.getSaldo()};
//                model.addRow(info2);
//                
//            });
            
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

    
      private void iniciarDatos(){

        saldo.setText("$"+String.valueOf(Usuarios.get(usuarioActivo).Cuentas.get(primeraKey).getSaldo()));
        numero.setText(String.valueOf(Usuarios.get(usuarioActivo).Cuentas.get(primeraKey).getNumeroCuenta()));
        nombre.setText(Usuarios.get(usuarioActivo).getNombre());
        if(Usuarios.get(usuarioActivo).Cuentas.get(primeraKey).getTipoCuenta().equals(Cuenta.TipoCuenta.AHORRO)){
            Tcuenta.setText("Cuenta de Ahorro");
        }else if(Usuarios.get(usuarioActivo).Cuentas.get(primeraKey).getTipoCuenta().equals(Cuenta.TipoCuenta.CORRIENTE)){
            Tcuenta.setText("Cuenta Corriente");
        }
        
        if(obtenerUltimaKey(Usuarios.get(usuarioActivo).Cuentas.get(primeraKey).transacciones)!=null){
        double ultimaKey = obtenerUltimaKey(Usuarios.get(usuarioActivo).Cuentas.get(primeraKey).transacciones);
           Udinero.setText("$"+String.valueOf(Usuarios.get(usuarioActivo).Cuentas.get(primeraKey).transacciones.get(ultimaKey))); 
        }
        fecha.setText(String.valueOf(Usuarios.get(usuarioActivo).Cuentas.get(primeraKey).getFechaCreacion()));

        
    }

    public static <K, V> K obtenerPrimeraKey(Map<K, V> mapa) {
        // Obtener el conjunto de claves del mapa
        if (!mapa.isEmpty()) {
            return mapa.keySet().iterator().next();
        } else {
            return null; // Retorna null si el mapa está vacío
        }
    }
    
    public static <K, V> K obtenerUltimaKey(Map<K, V> mapa) {
    // Obtener el conjunto de claves del mapa
    if (!mapa.isEmpty()) {
        List<K> keys = new ArrayList<>(mapa.keySet());
        return keys.get(keys.size() - 1);
    } else {
        return null; // Retorna null si el mapa está vacío
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        conte = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        saldo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Udinero = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        Crear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        numero = new javax.swing.JLabel();
        Tcuenta = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        conte.setBackground(new java.awt.Color(255, 255, 255));
        conte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        conte.setFocusable(false);
        conte.setPreferredSize(new java.awt.Dimension(720, 540));
        conte.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        saldo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        saldo.setForeground(new java.awt.Color(102, 255, 102));
        saldo.setText("$ ");
        jPanel2.add(saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 80, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tarjeta.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 90, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Saldo Disponible");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 110, -1));

        conte.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 54, 173, 100));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Bienvenido");
        conte.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 7, 144, 35));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Dinero depositado");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 7, -1, -1));

        Udinero.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Udinero.setForeground(new java.awt.Color(204, 255, 204));
        Udinero.setText("$");
        jPanel4.add(Udinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 90, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ingresado.png"))); // NOI18N
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 40, 40));

        conte.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 54, 160, 100));

        tabla.setBackground(new java.awt.Color(255, 255, 255));
        tabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        conte.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 233, 660, 240));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Transacciones recientes");
        conte.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 190, 173, 31));

        Crear.setBackground(new java.awt.Color(255, 255, 102));
        Crear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Crear.setForeground(new java.awt.Color(51, 51, 51));
        Crear.setText("Crear cuenta");
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });
        conte.add(Crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 120, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Deseas tener mas de 1 cuenta?");
        conte.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 200, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("F. Creacion");
        conte.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 70, 20));

        nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        conte.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 120, 20));

        numero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        conte.add(numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 209, 31));

        Tcuenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        conte.add(Tcuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 130, 30));

        fecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        conte.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 80, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tarjte.PNG"))); // NOI18N
        conte.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 300, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        AgregarCuentas cuenta = new AgregarCuentas(new JFrame(), true);
        cuenta.setVisible(true);
        cuenta.setLocationRelativeTo(null);
    }//GEN-LAST:event_CrearActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Crear;
    private javax.swing.JLabel Tcuenta;
    private javax.swing.JLabel Udinero;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel numero;
    private javax.swing.JLabel saldo;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
