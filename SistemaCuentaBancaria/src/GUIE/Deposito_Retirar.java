package GUIE;

import static GUIE.Inicio.obtenerPrimeraKey;
import static Principal.Main.Usuarios;
import static Principal.Main.usuarioActivo;
import javax.swing.JOptionPane;

public class Deposito_Retirar extends javax.swing.JDialog {
long primeraKey = obtenerPrimeraKey(Usuarios.get(usuarioActivo).Cuentas);
    public Deposito_Retirar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        iniciarDatos();
    }

    private void iniciarDatos() {

        saldo.setText("$" + String.valueOf(Usuarios.get(usuarioActivo).Cuentas.get(primeraKey).getSaldo()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        RetirarB = new javax.swing.JButton();
        DepositarB = new javax.swing.JButton();
        retirar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        saldo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        depositar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 540));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Depositar/Retirar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingrese la cantidad a retirar:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ingrese la cantidad a depositar:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 700, 20));

        RetirarB.setBackground(new java.awt.Color(255, 255, 102));
        RetirarB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RetirarB.setForeground(new java.awt.Color(51, 51, 51));
        RetirarB.setText("Retirar");
        RetirarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetirarBActionPerformed(evt);
            }
        });
        jPanel1.add(RetirarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, 130, 40));

        DepositarB.setBackground(new java.awt.Color(255, 255, 102));
        DepositarB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DepositarB.setForeground(new java.awt.Color(51, 51, 51));
        DepositarB.setText("Depositar");
        DepositarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositarBActionPerformed(evt);
            }
        });
        jPanel1.add(DepositarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 130, 40));

        retirar.setBackground(new java.awt.Color(255, 255, 255));
        retirar.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        retirar.setForeground(new java.awt.Color(51, 51, 51));
        retirar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                retirarKeyTyped(evt);
            }
        });
        jPanel1.add(retirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 220, 70));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 0));
        jLabel4.setText("$");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 40, 70));

        saldo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 70, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Saldo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 0));
        jLabel5.setText("$");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 40, 70));

        depositar.setBackground(new java.awt.Color(255, 255, 255));
        depositar.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        depositar.setForeground(new java.awt.Color(51, 51, 51));
        depositar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                depositarKeyTyped(evt);
            }
        });
        jPanel1.add(depositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 220, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void depositarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_depositarKeyTyped
        char tecla = evt.getKeyChar();
        boolean esNumero = Character.isDigit(tecla);
        boolean esSeparadorDecimal = tecla == '.';
        if (!esNumero && !esSeparadorDecimal) {
            evt.consume(); // Consumir el evento para bloquear caracteres no deseados
        }

        if (tecla == '.') {
            // Verificar si ya existe un separador decimal en el texto actual
            String texto = depositar.getText();
            if (texto.contains(",") || texto.contains(".")) {
                evt.consume(); // Consumir el evento si ya hay un separador decimal
            }
        }

        // Limitar la longitud total, incluyendo el separador decimal
        if (depositar.getText().trim().length() >= 6) {
            evt.consume();
        }
    }//GEN-LAST:event_depositarKeyTyped

    private void retirarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_retirarKeyTyped
        char tecla = evt.getKeyChar();
        boolean esNumero = Character.isDigit(tecla);
        boolean esSeparadorDecimal = tecla == '.';
        if (!esNumero && !esSeparadorDecimal) {
            evt.consume(); // Consumir el evento para bloquear caracteres no deseados
        }

        if (tecla == '.') {
            // Verificar si ya existe un separador decimal en el texto actual
            String texto = retirar.getText();
            if (texto.contains(",") || texto.contains(".")) {
                evt.consume(); // Consumir el evento si ya hay un separador decimal
            }
        }

        // Limitar la longitud total, incluyendo el separador decimal
        if (retirar.getText().trim().length() >= 6) {
            evt.consume();
        }
    }//GEN-LAST:event_retirarKeyTyped

    private void DepositarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositarBActionPerformed
        try{
        if (Double.parseDouble(depositar.getText()) > 0) {
            Usuarios.get(usuarioActivo).Cuentas.get(primeraKey).transacciones.put(Double.valueOf(depositar.getText()), Double.valueOf(depositar.getText()));
            Usuarios.get(usuarioActivo).Cuentas.get(primeraKey).setSaldo(Double.parseDouble(depositar.getText())+Usuarios.get(usuarioActivo).Cuentas.get(primeraKey).getSaldo());
            saldo.setText(String.valueOf(Usuarios.get(usuarioActivo).Cuentas.get(primeraKey).getSaldo()));
            JOptionPane.showMessageDialog(this, "Deposito realizado con exito.","Confirmacion",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "La cantidad minima es de 1$","Error",JOptionPane.ERROR_MESSAGE);
            
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "No has ingresado ninguna cantidad","Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_DepositarBActionPerformed

    private void RetirarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetirarBActionPerformed
        //try{
        if (Double.parseDouble(retirar.getText())<Usuarios.get(usuarioActivo).Cuentas.get(obtenerPrimeraKey(Usuarios.get(usuarioActivo).Cuentas)).getSaldo() && Double.parseDouble(retirar.getText()) > 0) {
            Usuarios.get(usuarioActivo).Cuentas.get(primeraKey).retiros.put(Double.valueOf(retirar.getText()), Double.valueOf(retirar.getText()));
            Usuarios.get(usuarioActivo).Cuentas.get(primeraKey).setSaldo(Usuarios.get(usuarioActivo).Cuentas.get(primeraKey).getSaldo() - Double.parseDouble(retirar.getText()));
            saldo.setText(String.valueOf(Usuarios.get(usuarioActivo).Cuentas.get(primeraKey).getSaldo()));
            JOptionPane.showMessageDialog(this, "Se ha retirado con exito.","Confirmacion",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "No tienes suficiente dinero para retirar","Error",JOptionPane.ERROR_MESSAGE);
        }
        //}catch(Exception e){
            //JOptionPane.showMessageDialog(this, "No has ingresado ninguna cantidad","Error",JOptionPane.ERROR_MESSAGE);
        //}
    }//GEN-LAST:event_RetirarBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DepositarB;
    private javax.swing.JButton RetirarB;
    private javax.swing.JTextField depositar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField retirar;
    private javax.swing.JLabel saldo;
    // End of variables declaration//GEN-END:variables
}
