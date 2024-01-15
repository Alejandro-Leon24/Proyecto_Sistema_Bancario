package GUIE;

import Logica.Cuenta;
import static Principal.Main.Usuarios;
import static Principal.Main.usuarioActivo;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public final class Login extends javax.swing.JFrame {

    

    public Login() {
        initComponents();
        this.setTitle("Iniciar sesion");
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContra = new javax.swing.JPasswordField();
        Ingresar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        Crear = new javax.swing.JButton();
        Recuperar_Cuenta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user.PNG"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 30, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contraseña.PNG"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 30, 30));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(51, 51, 51));
        txtUsuario.setToolTipText("");
        txtUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 170, 30));

        txtContra.setBackground(new java.awt.Color(255, 255, 255));
        txtContra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtContra.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 170, 30));

        Ingresar.setBackground(new java.awt.Color(255, 255, 102));
        Ingresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Ingresar.setForeground(new java.awt.Color(51, 51, 51));
        Ingresar.setText("Iniciar Sesion");
        Ingresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Ingresar.setFocusable(false);
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });
        jPanel2.add(Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 120, 30));

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
        jPanel2.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 50, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Bienvenidos ");
        jLabel4.setFocusable(false);
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono2.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 250, 90));

        label.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        label.setText("Revisar terminos y condiciones");
        label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelMouseExited(evt);
            }
        });
        jPanel2.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, 10));

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
        jPanel2.add(Crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 110, 30));

        Recuperar_Cuenta.setBackground(new java.awt.Color(255, 255, 102));
        Recuperar_Cuenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Recuperar_Cuenta.setForeground(new java.awt.Color(51, 51, 51));
        Recuperar_Cuenta.setText("Recuperar");
        Recuperar_Cuenta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Recuperar_Cuenta.setFocusable(false);
        Recuperar_Cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Recuperar_CuentaActionPerformed(evt);
            }
        });
        jPanel2.add(Recuperar_Cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 80, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Contraseña");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Numero de cedula");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 310, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
        if (Usuarios.containsKey(txtUsuario.getText())) {

            if (txtContra.getText().equals(Usuarios.get(txtUsuario.getText()).getContrasena())) {
                //this.setVisible(false);
                usuarioActivo = txtUsuario.getText();
                Inicio iniciar = new Inicio();
                iniciar.setVisible(true);

                //JOptionPane.showMessageDialog(this, "Usuario existe");
            } else {
                JOptionPane.showMessageDialog(this, "Contraseña incorrecta");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No existe ninguna cuenta creada con su numero de cedula");
        }
    }//GEN-LAST:event_IngresarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        //Configuramos el boton de cerrar
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        CrearCuenta Cuenta = new CrearCuenta(this, true);
        Cuenta.setVisible(true);
    }//GEN-LAST:event_CrearActionPerformed

    private void labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMouseClicked

        // Ejecutar la acción deseada (showAndWait en este caso)
        showAndWait("Abriendo...", 300);

        // Luego puedes realizar la operación Cuenta.leerPDF(this);
        Cuenta.leerPDF(this);
    }//GEN-LAST:event_labelMouseClicked

    private void labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMouseEntered

        label.setForeground(new Color(100, 100, 100));
    }//GEN-LAST:event_labelMouseEntered

    private void labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMouseExited
        label.setForeground(new Color(50, 50, 50));
    }//GEN-LAST:event_labelMouseExited

    private void Recuperar_CuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Recuperar_CuentaActionPerformed
        String recuperar = JOptionPane.showInputDialog("Ingresa tu numero de cedula: ");
        try {
            if (!recuperar.isEmpty()) {
                if (Usuarios.containsKey(recuperar)) {
                    JOptionPane.showMessageDialog(this, "Tu contraseña es: " + Usuarios.get(recuperar).getContrasena());
                } else {
                    JOptionPane.showMessageDialog(this, "No tienes ninguna cuenta asociada con tu cedula");
                }
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_Recuperar_CuentaActionPerformed

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        int tecla = evt.getKeyChar();
        boolean numero = Character.isDigit(tecla);

        if (!numero) {
            evt.consume();
        }

        if (txtUsuario.getText().trim().length() >= 10 || !numero) {
            evt.consume();
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    public static void showAndWait(String message, int durationMillis) {
        JOptionPane optionPane = new JOptionPane(message, JOptionPane.INFORMATION_MESSAGE);

        // Crear el cuadro de diálogo sin botones
        JDialog dialog = optionPane.createDialog("Mensaje de espera");
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setModal(false);  // Hacer que no sea modal
        dialog.setAlwaysOnTop(true);  // Mantenerlo encima de otras ventanas

        // Mostrar el cuadro de diálogo
        dialog.setVisible(true);

        // Programar el cierre del cuadro de diálogo después del tiempo especificado
        new Timer(durationMillis, e -> {
            dialog.dispose();
        }).start();
    }

    public void VentanaCerrada(JFrame inicio, JFrame login) {
        inicio.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                // Cuando se cierra el JDialog, muestra nuevamente el JFrame del login
                login.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Crear;
    private javax.swing.JButton Ingresar;
    private javax.swing.JButton Recuperar_Cuenta;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
