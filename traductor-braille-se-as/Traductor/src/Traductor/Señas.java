package Traductor;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Señas extends javax.swing.JFrame {

    public static String text;

    public Señas() {
        initComponents();
        this.setLocationRelativeTo(Señas.this);
        this.setResizable(false);
        Image i = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/icono.png"));
        this.setIconImage(i);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon fondo1 = new ImageIcon("src/Imagenes/fondo.jpg");
        Icon fondiu = new ImageIcon(fondo1.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
        fondo.setIcon(fondiu);
        ImageIcon fondo2 = new ImageIcon("src/Imagenes/flecha.png");
        Icon fondiu1 = new ImageIcon(fondo2.getImage().getScaledInstance(traducir.getWidth() - 20, traducir.getHeight() - 20, Image.SCALE_DEFAULT));
        traducir.setIcon(fondiu1);
        this.repaint();
    }

    public Señas(String s) {
        this();
         String ruta = new File("src/Imagenes/Senias").getAbsolutePath().replace("\\", "/");
        this.text = s.toLowerCase();
        boolean validar = false;
        panel.setContentType("text/html");
         char letra ='0';
        String sentencia = "";
      
        String error = "<p>Los siguientes caracteres<strong>(";
        for (int j = 0; j < this.text.length(); j++) {
            int a = this.text.charAt(j);
            if ((a >= 93 && a <= 122) || (a>47 && a<58)|| (a>159 && a<164) || a== 130 || (a==233 || a==225 || a==237 || a==243 || a==250)|| a == 32 || a==10 || a==9) {
                if (this.text.charAt(j) == ' ' || a==10 || a==9) {
                    sentencia += "<br>";
                } else {
                    if(a==130 || a==233){
                        letra = 'e';
                    }else if(a==160 || a==225){
                        
                        letra='a';
                    }else if(a==161 || a==237){
                        letra = 'i';
                    }else if(a==162 || a==243){
                        letra = 'o';
                    }else if(a==163 || a==250){
                        letra = 'u';
                    }else {
                        letra = this.text.charAt(j);
                    }
                     sentencia += "<img src=\"file:///"+ruta+"/"+letra+ ".png\"></img>";

                }
               
            } else {
                error += " " + this.text.charAt(j);
                
                validar = true;
            }
            
        }
        error += " )</strong> no se encuentran entre los caracteres que se pueden traducir. Se recomienda emplear letras del alfabeto para no tener ningun inconveniente con el Software.</p>";
        if (validar) {
            sentencia += error;
        }
        panel.setText(sentencia);
        texto.append(s);
        validar = false;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        scrollPanel = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        scroll = new javax.swing.JScrollPane();
        panel = new javax.swing.JTextPane();
        traducir = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        braille = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Traductor de Señas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 350, 40));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 880, 30));

        jLabel2.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jLabel2.setText("NOTA: Si la traducción no se despliega completamente, se recomienda seleccionar o clickear el campo de traducción.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 820, 30));

        texto.setColumns(20);
        texto.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        texto.setLineWrap(true);
        texto.setRows(5);
        texto.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        scrollPanel.setViewportView(texto);

        getContentPane().add(scrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 300, 350));

        panel.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        scroll.setViewportView(panel);

        getContentPane().add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 300, 350));

        traducir.setBackground(new java.awt.Color(0, 0, 0));
        traducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traducirActionPerformed(evt);
            }
        });
        getContentPane().add(traducir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 50, 50));

        regresar.setBackground(new java.awt.Color(0, 0, 0));
        regresar.setForeground(new java.awt.Color(255, 255, 255));
        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 110, 40));

        braille.setBackground(new java.awt.Color(0, 0, 0));
        braille.setForeground(new java.awt.Color(255, 255, 255));
        braille.setText("Braille");
        braille.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brailleActionPerformed(evt);
            }
        });
        getContentPane().add(braille, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, 110, 40));

        salir.setBackground(new java.awt.Color(0, 0, 0));
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 110, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Escriba el texto en el cuadro que ve en pantalla, luego presione la \"Flecha\", a continuación se mostraran los simbolos braille");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 780, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("que representan la palabra establecida. En caso de querer saber la  representación lenguaje de señas, rellene el area ");
        jLabel6.setToolTipText("");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 720, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("de texto y presione el boton \"Señas\".");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 800, 20));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        Traductor t = new Traductor();
        t.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_regresarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void traducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traducirActionPerformed
        this.text = this.texto.getText().toLowerCase();
       String ruta = new File("src/Imagenes/Senias").getAbsolutePath().replace("\\", "/");
        boolean validar = false;
        panel.setContentType("text/html");
        char letra ='0';
        String sentencia = "";
        String error = "<p>Los siguientes caracteres<strong>(";
        for (int j = 0; j < this.text.length(); j++) {
            int a = this.text.charAt(j);
            if ((a >= 93 && a <= 122) || (a>47 && a<58)|| (a>159 && a<164) || a== 130 || (a==233 || a==225 || a==237 || a==243 || a==250)|| a == 32 || a==10 || a==9) {
                if (this.text.charAt(j) == ' ' || a==10 || a==9) {
                    sentencia += "<br>";
                } else {
                    if(a==130 || a==233){
                        letra = 'e';
                    }else if(a==160 || a==225){
                        
                        letra='a';
                    }else if(a==161 || a==237){
                        letra = 'i';
                    }else if(a==162 || a==243){
                        letra = 'o';
                    }else if(a==163 || a==250){
                        letra = 'u';
                    }else {
                        letra = this.text.charAt(j);
                    }
                     sentencia += "<img src=\"file:///"+ruta+"/"+letra+ ".png\"></img>";
                }
               
            } else {
                error += " " + this.text.charAt(j);
                
                validar = true;
            }
            
        }
        error += " )</strong> no se encuentran entre los caracteres que se pueden traducir. Se recomienda emplear letras del alfabeto para no tener ningun inconveniente con el Software.</p>";
        if (validar) {
            sentencia += error;
        }
        panel.setText(sentencia);
        validar = false;

    }//GEN-LAST:event_traducirActionPerformed

    private void brailleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brailleActionPerformed
        Braille b = new Braille(this.text);
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_brailleActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Señas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Señas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Señas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Señas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Señas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton braille;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextPane panel;
    private javax.swing.JButton regresar;
    private javax.swing.JButton salir;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JTextArea texto;
    private javax.swing.JButton traducir;
    // End of variables declaration//GEN-END:variables
}
