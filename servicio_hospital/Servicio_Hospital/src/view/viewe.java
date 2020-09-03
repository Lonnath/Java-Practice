/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import  com.placeholder.PlaceHolder;
import javax.swing.JOptionPane;
import Control.Urgencias;
import Entity.Secure;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
public class viewe extends javax.swing.JFrame {
        PlaceHolder holder1;
        PlaceHolder holder;
        Urgencias urge = new Urgencias();
    public viewe() {
        initComponents();
       this.assingButton.setEnabled(false);
       this.charge.setEnabled(false);
       this.gradoDolencia.setEnabled(false);
       this.secure.setEnabled(false);
        this.valido.setEnabled(false);
       this.habitual.setEnabled(false);
       holder1 = new PlaceHolder(this.medicos, "Ingrese los Nombres \nde los Medicos disponibles\nseparados por un\nsalto de linea");
       holder = new PlaceHolder(this.asegurados, "Ingrese los Numeros\nde los Asegurados\nseparados por un\nsalto de linea");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        medicos = new javax.swing.JTextArea();
        assingButton = new javax.swing.JButton();
        secure = new javax.swing.JTextField();
        gradoDolencia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        chargeButton = new javax.swing.JButton();
        assing = new javax.swing.JButton();
        charge = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        asegurados = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        valido = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        turno = new javax.swing.JButton();
        atender = new javax.swing.JButton();
        liberar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        habitual = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setAutoscrolls(true);

        medicos.setColumns(20);
        medicos.setRows(5);
        medicos.setToolTipText("");
        jScrollPane1.setViewportView(medicos);

        assingButton.setText("ASIGNAR");
        assingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assingButtonActionPerformed(evt);
            }
        });

        secure.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secureActionPerformed(evt);
            }
        });

        gradoDolencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setText("ASEGURADO");

        jLabel2.setText("GRADO DOLENCIA");

        chargeButton.setText("CARGAR");
        chargeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chargeButtonActionPerformed(evt);
            }
        });

        assing.setText("ACTIVAR ASIGNAR");
        assing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assingActionPerformed(evt);
            }
        });

        charge.setText("ACTIVAR CARGAR");
        charge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chargeActionPerformed(evt);
            }
        });

        asegurados.setColumns(20);
        asegurados.setRows(5);
        jScrollPane2.setViewportView(asegurados);

        jLabel3.setText("Medicos");

        jLabel4.setText("Asegurados");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("HOSPITAL");

        valido.setColumns(20);
        valido.setRows(5);
        valido.setAutoscrolls(false);
        valido.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jTextField1.setText("jTextField1");

        turno.setText("MED. DISPONIBLES");
        turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnoActionPerformed(evt);
            }
        });

        atender.setText("ATENDER");
        atender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atenderActionPerformed(evt);
            }
        });

        liberar.setText("LIBERAR MEDICO");
        liberar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liberarActionPerformed(evt);
            }
        });

        jLabel6.setText("MEDICO HABITUAL");

        habitual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        habitual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                habitualActionPerformed(evt);
            }
        });

        jLabel7.setText("Asegurese de limpiar los campos antes de cargar la información, evite información repetida.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(atender, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(liberar)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(charge)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(chargeButton)
                                        .addGap(34, 34, 34)
                                        .addComponent(turno)
                                        .addGap(128, 128, 128)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(assing, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(secure, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(gradoDolencia, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(jLabel6)
                                    .addComponent(habitual)))
                            .addComponent(assingButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(valido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(atender)
                        .addComponent(liberar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(turno)
                            .addComponent(chargeButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(secure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(gradoDolencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(habitual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(assingButton)
                        .addGap(18, 18, 18)
                        .addComponent(valido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(charge)
                    .addComponent(assing))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void secureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secureActionPerformed

    }//GEN-LAST:event_secureActionPerformed

    private void assingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assingButtonActionPerformed
        if (this.secure.getText().length() < 1 || this.gradoDolencia.getText().length() < 1|| this.habitual.getText().length() < 1) {
            String output ="";
            if(this.secure.getText().length()<1 &&this.gradoDolencia.getText().length()<1 && this.habitual.getText().length()<1){
                output+="ASEGURADO, GRADO DOLENCIA Y MEDICO HABITUAL";
            }else{
                String tmp = "";
                int count = 0;
            if(this.secure.getText().length()<1){
                output+="ASEGURADO";
                count++;
            }
            if(this.gradoDolencia.getText().length()<1){
                if(count==1){
                    tmp = " Y ";
                }else count =1;
                output+=tmp+"GRADO DE DOLENCIA";
            }
            if(this.habitual.getText().length()<1){
                if(count==1){
                    tmp = " Y ";
                }
                output+=tmp+"MEDICO HABITUAL";
            }
            }
            JOptionPane.showMessageDialog(null, "CAMPOS VACIOS ( " + output + " ), IMPOSIBLE ASINGAR EL TURNO.");
        } else {
            int sec = 0;
            int dol = 0;
            for (int i = 0; i < this.secure.getText().length(); i++) {
                if (this.secure.getText().charAt(i) < 48 || this.secure.getText().charAt(i) > 57) {
                    this.secure.setText("");
                    sec = 1;
                }
            }
            for (int i = 0; i < this.gradoDolencia.getText().length(); i++) {
                if (this.gradoDolencia.getText().charAt(i) < 48 || this.gradoDolencia.getText().charAt(i) > 57) {
                    this.gradoDolencia.setText("");
                    dol = 1;
                }
            }
            String output = "";
            if (sec == 1) {
                output += "ASEGURADO";
            }
            if(sec==1 && dol==1){
                output+=" Y ";
            }
            if (dol == 1) {
                output += "GRADO DE DOLENCIA";
            }
            if(sec ==0 && dol ==0){
                this.valido.setText(this.urge.insertaPaciente(this.secure.getText(), this.gradoDolencia.getText(), this.habitual.getText()));
            }else JOptionPane.showMessageDialog(null, "Solo Valores Númericos ( " + output + " )");
        }
            this.medicos.setText("");
       holder1 = new PlaceHolder(this.medicos, "Ingrese los Nombres \nde los Medicos disponibles\nseparados por un\nsalto de linea");
       
        
    }//GEN-LAST:event_assingButtonActionPerformed

    private void assingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assingActionPerformed
        this.valido.setText("");
        this.assingButton.setEnabled(true);
        this.charge.setEnabled(true);
       this.chargeButton.setEnabled(false);
       this.assing.setEnabled(false);
       this.gradoDolencia.setEnabled(true);
       this.secure.setEnabled(true);
       this.asegurados.setEnabled(false);
       this.medicos.setEnabled(false);
       this.habitual.setEnabled(true);
       this.valido.setText("");
       this.secure.setText("");
       this.medicos.setText("");
       this.asegurados.setText("");
       this.gradoDolencia.setText("");
       this.habitual.setText("");
       holder1 = new PlaceHolder(this.medicos, "Ingrese los Nombres \nde los Medicos disponibles\nseparados por un\nsalto de linea");
       holder = new PlaceHolder(this.asegurados, "Ingrese los Numeros\nde los Asegurados\nseparados por un\nsalto de linea");
    
    }//GEN-LAST:event_assingActionPerformed

    private void chargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chargeActionPerformed
         this.valido.setText("");
        this.assingButton.setEnabled(false);
        this.charge.setEnabled(false);
        this.assing.setEnabled(true);
        this.chargeButton.setEnabled(true);
       this.gradoDolencia.setEnabled(false);
       this.secure.setEnabled(false);
       this.valido.setText("");
       this.secure.setText("");
       this.medicos.setText("");
       this.asegurados.setText("");
       this.gradoDolencia.setText("");
       this.habitual.setText("");
       this.asegurados.setEnabled(true);
       this.medicos.setEnabled(true);
       this.habitual.setEnabled(false); 
       holder1 = new PlaceHolder(this.medicos, "Ingrese los Nombres \nde los Medicos disponibles\nseparados por un\nsalto de linea");
       holder = new PlaceHolder(this.asegurados, "Ingrese los Numeros\nde los Asegurados\nseparados por un\nsalto de linea");
    
    }//GEN-LAST:event_chargeActionPerformed

    private void chargeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chargeButtonActionPerformed
       
        if(!this.medicos.getText().equals("")&&!this.asegurados.getText().equals("")&&!this.medicos.getText().equals("Ingrese los Nombres \nde los Medicos disponibles\nseparados por un\nsalto de linea")&&!this.asegurados.getText().equals("Ingrese los Numeros\nde los Asegurados\nseparados por un\nsalto de linea")){
           this.urge.crearTurno(this.medicos.getText(), this.asegurados.getText());
           this.valido.setText("MEDICOS DE TURNO CARGADOS...\nASEGURADOS CARGADOS...");
           
        }else{
            String var = "";
            int count =0;
            if(this.medicos.getText().equals("")||this.medicos.getText().equals("Ingrese los Nombres \nde los Medicos disponibles\nseparados por un\nsalto de linea")){
                var += "MEDICOS\n";
                count = 1;
            }
            
            if (this.asegurados.getText().equals("")||this.asegurados.getText().equals("Ingrese los Numeros\nde los Asegurados\nseparados por un\nsalto de linea")) {
                if(count==1){
                    var+= "NI ";
                }
                var += "ASEGURADOS";
            }
            
            this.valido.setText("NO INGRESO "+var);
            this.medicos.setText("");
            holder1 = new PlaceHolder(this.medicos, "Ingrese los Nombres \nde los Medicos disponibles\nseparados por un\nsalto de linea");
       
        }
          
    }//GEN-LAST:event_chargeButtonActionPerformed

    private void turnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnoActionPerformed
        this.medicos.setText("");
        holder1 = new PlaceHolder(this.medicos, urge.listarTurno());
        
    }//GEN-LAST:event_turnoActionPerformed

    private void atenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atenderActionPerformed
        this.valido.setText(this.urge.atenderPaciente());
        this.medicos.setText("");
       holder1 = new PlaceHolder(this.medicos, "Ingrese los Nombres \nde los Medicos disponibles\nseparados por un\nsalto de linea");
       
    }//GEN-LAST:event_atenderActionPerformed

    private void liberarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liberarActionPerformed
        this.valido.setText(this.urge.liberarMedico());
        this.medicos.setText("");
       holder1 = new PlaceHolder(this.medicos, "Ingrese los Nombres \nde los Medicos disponibles\nseparados por un\nsalto de linea");
       
    }//GEN-LAST:event_liberarActionPerformed

    private void habitualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habitualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_habitualActionPerformed

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
            java.util.logging.Logger.getLogger(viewe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea asegurados;
    private javax.swing.JButton assing;
    private javax.swing.JButton assingButton;
    private javax.swing.JButton atender;
    private javax.swing.JButton charge;
    private javax.swing.JButton chargeButton;
    private javax.swing.JTextField gradoDolencia;
    private javax.swing.JTextField habitual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton liberar;
    private javax.swing.JTextArea medicos;
    private javax.swing.JTextField secure;
    private javax.swing.JButton turno;
    private javax.swing.JTextArea valido;
    // End of variables declaration//GEN-END:variables
}
