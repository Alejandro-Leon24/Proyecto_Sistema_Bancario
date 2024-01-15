package GUIE;

import Logica.Cuenta;
import Logica.Usuario;
import Principal.Main;
import static Principal.Main.Usuarios;
import com.toedter.calendar.JDateChooser;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CrearCuenta extends javax.swing.JDialog {

    public CrearCuenta(java.awt.Frame parent, boolean modal) {
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
        Apellido = new javax.swing.JTextField();
        Cedula = new javax.swing.JTextField();
        Contra = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Tipo_Cuenta = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        aceptar = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        nacimiento = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        Direccion = new javax.swing.JTextField();
        Crear = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pagina de registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Apellido.setBackground(new java.awt.Color(255, 255, 255));
        Apellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Apellido.setForeground(new java.awt.Color(51, 51, 51));
        Apellido.setToolTipText("");
        Apellido.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 170, 30));

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
        jPanel2.add(Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 170, 30));

        Contra.setBackground(new java.awt.Color(255, 255, 255));
        Contra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Contra.setForeground(new java.awt.Color(51, 51, 51));
        Contra.setToolTipText("");
        Contra.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(Contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 170, 30));

        Nombre.setBackground(new java.awt.Color(255, 255, 255));
        Nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Nombre.setForeground(new java.awt.Color(51, 51, 51));
        Nombre.setToolTipText("");
        Nombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 170, 30));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cedula:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombres:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Apellidos:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Crear Contraseña:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        String[] elementos = {"", "Ahorro", "Corriente"};
        Tipo_Cuenta.setBackground(new java.awt.Color(255, 255, 255));
        Tipo_Cuenta.setModel(new DefaultComboBoxModel<>(elementos));
        jPanel2.add(Tipo_Cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 170, 30));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Direccion:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        aceptar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        aceptar.setText("Aceptar terminos y condiciones");
        jPanel2.add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 230, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Tipo de cuenta:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        nacimiento.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 160, 40));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Fecha de nacimiento:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        Direccion.setBackground(new java.awt.Color(255, 255, 255));
        Direccion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Direccion.setForeground(new java.awt.Color(51, 51, 51));
        Direccion.setToolTipText("");
        Direccion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 170, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 380, 360));

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
        jPanel1.add(Crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 110, 30));

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
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 50, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        if (aceptar.isSelected()) {
            try{
            Usuario u = new Usuario();
            Cuenta c = new Cuenta();
            String Nom = Nombre.getText();
            String Ape = Apellido.getText();
            String Ced = Cedula.getText();
            String Direc = Direccion.getText();
            String Contrasena = Contra.getText();
            
            //Fecha
                Date fecha1 = nacimiento.getDate();
                long fecha2 = fecha1.getTime();
                java.sql.Date Fecha3 = new java.sql.Date(fecha2);

            if (Nom.isEmpty() && Ape.isEmpty() && Cedula.getText().isEmpty() && Direc.isEmpty() && nacimiento.getCalendar() == null && Contra.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Los campos estan vacios", "Error", JOptionPane.ERROR_MESSAGE);

            } else if (Nom.isEmpty() || Ape.isEmpty() || Cedula.getText().isEmpty() || Direc.isEmpty() || nacimiento.getCalendar() == null || Contra.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Faltan campos por llenar", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                if (Usuarios.containsKey(Ced)) {

                    JOptionPane.showMessageDialog(this, "Ya tienes una cuenta creada. \nSi quieres crear otro tipo de cuenta debes iniciar sesion");
                } else {

                    u.RegistrarUsuario(Ced, Nom, Ape, Direc, Fecha3, Contrasena);

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
                                    c.RegistrarCuenta(NCuenta2, 0, Cuenta.TipoCuenta.AHORRO, 0, Main.FechaActual());
                                    u.crearCuenta(NCuenta2, c);
                                    Usuarios.put(Ced, u);
                                    JOptionPane.showMessageDialog(this, "Cuenta creada con exito");
                                }
                                case 2 -> {
                                    c.RegistrarCuenta(NCuenta2, 0, Cuenta.TipoCuenta.CORRIENTE, 0.01, Main.FechaActual());
                                    u.crearCuenta(NCuenta2, c);
                                    Usuarios.put(Ced, u);
                                    JOptionPane.showMessageDialog(this, "Cuenta creada con exito");
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
        int tecla = evt.getKeyChar();
        boolean numero = Character.isDigit(tecla);

        if (!numero) {
            evt.consume();
        }

        if (Cedula.getText().trim().length() >= 10 || !numero) {
            evt.consume();
        }
    }//GEN-LAST:event_CedulaKeyTyped

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_SalirActionPerformed

    public long GenerarNumeroCuenta() {
        Random random = new Random();

        // Generar un número aleatorio con 12 dígitos
        long numeroAleatorio = Math.abs(random.nextLong()) % 1000000000000L;

        // Formatear el número aleatorio a 12 dígitos
        String Ncuenta = String.format("%012d", numeroAleatorio);
        return Long.parseLong(Ncuenta);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JTextField Cedula;
    private javax.swing.JTextField Contra;
    private javax.swing.JButton Crear;
    private javax.swing.JTextField Direccion;
    private javax.swing.JTextField Nombre;
    private javax.swing.JButton Salir;
    private javax.swing.JComboBox<String> Tipo_Cuenta;
    private javax.swing.JCheckBox aceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser nacimiento;
    // End of variables declaration//GEN-END:variables
}
