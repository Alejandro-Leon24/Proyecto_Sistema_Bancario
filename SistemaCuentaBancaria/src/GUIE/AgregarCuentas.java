package GUIE;

import Logica.Cuenta;
import Logica.Usuario;
import Principal.Main;
import static Principal.Main.Usuarios;
import static Principal.Main.usuarioActivo;
import com.toedter.calendar.JDateChooser;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class AgregarCuentas extends javax.swing.JDialog {

    public AgregarCuentas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Crear Cuenta");
        this.setLocationRelativeTo(null);
        // Crear una instancia de JDateChooser
        JDateChooser dateChooser = new com.toedter.calendar.JDateChooser();
        
        // Obtener la fecha actual
        Date fechaActual = new Date();
        
        // Establecer la fecha máxima como la fecha actual
        dateChooser.setMaxSelectableDate(fechaActual);
        
        // Calcular la fecha mínima permitida (por ejemplo, hace 100 años)
        Calendar calendarioMinimo = Calendar.getInstance();
        calendarioMinimo.setTime(fechaActual);
        calendarioMinimo.add(Calendar.YEAR, -4);
        
        // Establecer la fecha mínima como hace 100 años
        dateChooser.setMinSelectableDate(calendarioMinimo.getTime());
        add(dateChooser);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Cedula = new javax.swing.JTextField();
        Deposito = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Tipo_Cuenta = new javax.swing.JComboBox<>();
        aceptar = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        nacimiento = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        Crear = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pagina de registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cedula.setBackground(new java.awt.Color(255, 255, 255));
        Cedula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Cedula.setForeground(new java.awt.Color(51, 51, 51));
        Cedula.setToolTipText("");
        Cedula.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CedulaKeyTyped(evt);
            }
        });
        jPanel2.add(Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 170, 30));

        Deposito.setBackground(new java.awt.Color(255, 255, 255));
        Deposito.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Deposito.setForeground(new java.awt.Color(51, 51, 51));
        Deposito.setToolTipText("");
        Deposito.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Deposito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DepositoKeyTyped(evt);
            }
        });
        jPanel2.add(Deposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 170, 30));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cedula:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Deposito inicial");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        String[] elementos = {"", "Ahorro", "Corriente"};
        Tipo_Cuenta.setBackground(new java.awt.Color(255, 255, 255));
        Tipo_Cuenta.setModel(new DefaultComboBoxModel<>(elementos));
        jPanel2.add(Tipo_Cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 170, 30));

        aceptar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        aceptar.setText("Aceptar terminos y condiciones");
        jPanel2.add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 230, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Tipo de cuenta:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        nacimiento.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 160, 40));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Fecha de nacimiento:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 380, 280));

        Crear.setBackground(new java.awt.Color(255, 255, 102));
        Crear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Crear.setForeground(new java.awt.Color(51, 51, 51));
        Crear.setText("Crear Cuenta");
        Crear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Crear.setFocusable(false);
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });
        jPanel1.add(Crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 110, 30));

        Salir.setBackground(new java.awt.Color(255, 255, 102));
        Salir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Salir.setForeground(new java.awt.Color(51, 51, 51));
        Salir.setText("Salir");
        Salir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Salir.setFocusable(false);
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 50, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        if (aceptar.isSelected()) {
            try{
            Usuario u = new Usuario();
            Cuenta c = new Cuenta();
            Double de = Double.valueOf(Deposito.getText());

            String Ced = Cedula.getText();
            
            //Fecha
                Date fecha1 = nacimiento.getDate();
                long fecha2 = fecha1.getTime();
                java.sql.Date Fecha3 = new java.sql.Date(fecha2);

            if (nacimiento.getCalendar() == null && Deposito.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Los campos estan vacios", "Error", JOptionPane.ERROR_MESSAGE);

            } else if ( nacimiento.getCalendar() == null || Deposito.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Faltan campos por llenar", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                if (Usuarios.containsKey(Ced)) {

                    long NCuenta2 = GenerarNumeroCuenta();

                    AtomicBoolean continuar = new AtomicBoolean(true);

                    Usuarios.forEach((a, b) -> {
                        if (b.RevisarCuentasRepetidas(NCuenta2)) {
                            continuar.set(false);
                        }
                    });

                    if (continuar.get()) {
                    
                        int edad= Main.calcularEdad(Fecha3, Main.FechaActual());
                        if(edad >=18){
                            switch (Tipo_Cuenta.getSelectedIndex()) {
                                case 1 -> {
                                    c.RegistrarCuenta(NCuenta2, de, Cuenta.TipoCuenta.AHORRO, 0, Main.FechaActual());
                                    Usuarios.get(usuarioActivo).Cuentas.put(NCuenta2, c);
                                    JOptionPane.showMessageDialog(this, "Cuenta agreada con exito");
                                }
                                case 2 -> {
                                    c.RegistrarCuenta(NCuenta2, de, Cuenta.TipoCuenta.CORRIENTE, 0.01, Main.FechaActual());
                                    Usuarios.get(usuarioActivo).Cuentas.put(NCuenta2, c);
                                    JOptionPane.showMessageDialog(this, "Cuenta agregada con exito");
                                }
                                default -> JOptionPane.showMessageDialog(this, "Seleccione el tipo de cuenta.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                               
                        }else{
                            JOptionPane.showMessageDialog(this, "Lo sentimos, eres menor de edad."+ "("+edad+")", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }

                }
            }
            }catch(Exception e){
                
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se puede continuar si no acepta los terminos y condiciones.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CrearActionPerformed

    private void CedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CedulaKeyTyped
        char tecla = evt.getKeyChar();
        boolean esNumero = Character.isDigit(tecla);
        boolean esSeparadorDecimal = tecla == '.';
        if (!esNumero && !esSeparadorDecimal) {
            evt.consume(); // Consumir el evento para bloquear caracteres no deseados
        }

        if (tecla == '.') {
            // Verificar si ya existe un separador decimal en el texto actual
            String texto = Cedula.getText();
            if (texto.contains(",") || texto.contains(".")) {
                evt.consume(); // Consumir el evento si ya hay un separador decimal
            }
        }

        // Limitar la longitud total, incluyendo el separador decimal
        if (Cedula.getText().trim().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_CedulaKeyTyped

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void DepositoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DepositoKeyTyped
        char tecla = evt.getKeyChar();
        boolean esNumero = Character.isDigit(tecla);
        boolean esSeparadorDecimal = tecla == '.';
        if (!esNumero && !esSeparadorDecimal) {
            evt.consume(); // Consumir el evento para bloquear caracteres no deseados
        }

        if (tecla == '.') {
            // Verificar si ya existe un separador decimal en el texto actual
            String texto = Deposito.getText();
            if (texto.contains(",") || texto.contains(".")) {
                evt.consume(); // Consumir el evento si ya hay un separador decimal
            }
        }

        // Limitar la longitud total, incluyendo el separador decimal
        if (Deposito.getText().trim().length() >= 6) {
            evt.consume();
        }
    }//GEN-LAST:event_DepositoKeyTyped

    public long GenerarNumeroCuenta() {
        Random random = new Random();

        // Generar un número aleatorio con 12 dígitos
        long numeroAleatorio = Math.abs(random.nextLong()) % 1000000000000L;

        // Formatear el número aleatorio a 12 dígitos
        String Ncuenta = String.format("%012d", numeroAleatorio);
        return Long.parseLong(Ncuenta);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cedula;
    private javax.swing.JButton Crear;
    private javax.swing.JTextField Deposito;
    private javax.swing.JButton Salir;
    private javax.swing.JComboBox<String> Tipo_Cuenta;
    private javax.swing.JCheckBox aceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser nacimiento;
    // End of variables declaration//GEN-END:variables
}
