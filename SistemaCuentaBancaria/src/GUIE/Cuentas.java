
package GUIE;

import static GUIE.Inicio_Infor.obtenerPrimeraKey;
import static GUIE.Inicio_Infor.obtenerUltimaKey;
import Logica.Cuenta;
import static Principal.Main.Usuarios;
import static Principal.Main.usuarioActivo;
import javax.swing.table.DefaultTableModel;

public class Cuentas extends javax.swing.JDialog {

long primeraKey = obtenerPrimeraKey(Usuarios.get(usuarioActivo).Cuentas);

    public Cuentas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        iniciarDatos();
        Buscar_Cuenta.addItem("");
        
        if(!Usuarios.isEmpty()){
            Usuarios.get(usuarioActivo).Cuentas.forEach((a, b) -> {
                Buscar_Cuenta.addItem(String.valueOf(b.getNumeroCuenta()));
            });
        }
        
        titulo.setText("Cuentas creadas: "+String.valueOf(Usuarios.get(usuarioActivo).Cuentas.size()));
        
        
        
        
    }
    
    private void iniciarDatos(){

        
        numero.setText(String.valueOf(Usuarios.get(usuarioActivo).Cuentas.get(primeraKey).getNumeroCuenta()));
        nombre.setText(Usuarios.get(usuarioActivo).getNombre());
        if(Usuarios.get(usuarioActivo).Cuentas.get(primeraKey).getTipoCuenta().equals(Cuenta.TipoCuenta.AHORRO)){
            Tcuenta.setText("Cuenta de Ahorro");
        }else if(Usuarios.get(usuarioActivo).Cuentas.get(primeraKey).getTipoCuenta().equals(Cuenta.TipoCuenta.CORRIENTE)){
            Tcuenta.setText("Cuenta Corriente");
        }
        
        
        fecha.setText(String.valueOf(Usuarios.get(usuarioActivo).Cuentas.get(primeraKey).getFechaCreacion()));

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        conte = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Buscar_Cuenta = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Tcuenta = new javax.swing.JLabel();
        numero = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        conte.setBackground(new java.awt.Color(255, 255, 255));
        conte.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        conte.setFocusable(false);
        conte.setPreferredSize(new java.awt.Dimension(720, 540));
        conte.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 0));
        titulo.setText("Cuentas creadas: ");
        conte.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Seleccione una cuenta:");
        conte.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 180, 40));

        Buscar_Cuenta.setBackground(new java.awt.Color(255, 255, 255));
        Buscar_Cuenta.setForeground(new java.awt.Color(0, 0, 0));
        conte.add(Buscar_Cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 220, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Establecer cuenta");
        conte.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("F. Creacion");
        conte.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 70, 20));

        Tcuenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        conte.add(Tcuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 130, 30));

        numero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        conte.add(numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 209, 31));

        fecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        conte.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 80, 20));

        nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        conte.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 120, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tarjte.PNG"))); // NOI18N
        conte.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 300, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(conte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Buscar_Cuenta;
    private javax.swing.JLabel Tcuenta;
    private javax.swing.JPanel conte;
    private javax.swing.JLabel fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel numero;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
