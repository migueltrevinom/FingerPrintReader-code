/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.

test

* cosas por poner:  
    - Identificador de msg para poder usar varios thread sin ningun problema
    -Verificar paquete si es para el mouse o el texto
    - long press button para back y hacer delete mas seguidos.
     - hacer el hilo de la conexion por wifi para que no este recibiendo datos siempre
 */
package javaapplication15;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.geom.RoundRectangle2D;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.microedition.io.StreamConnection;
import javax.microedition.io.StreamConnectionNotifier;
import javax.swing.JFrame;
/**
 *
 * @author Itic
 */
public class MainHome extends JFrame{

    static String administrador="";
     DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                    Date date = new Date();
        
    public MainHome() {
         
            initComponents();
            // this.setBackground(new Color(0,0,0,0));
            // cordenadas iconos  --*   primer icono (70,200), luego se incrementara 100 al x  -> (170,200)  , (270, 200)
           this.setAlwaysOnTop(true);
           jTextField1.setFocusable(true);
            /*jLabel6.setLocation(70, 200);
            jLabel7.setLocation(170, 200);*/
            
             Shape forma = new RoundRectangle2D.Double(40,0, this.getBounds().width-80, this.getBounds().height,104,104); 
                AWTUtilities.setWindowShape(this, forma); 
            
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem4.setText("jMenuItem4");

        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setFocusTraversalPolicyProvider(true);
        setMinimumSize(new java.awt.Dimension(438, 630));
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication15/logolector.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        jPanel2.add(jLabel2);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(-20, 0, 480, 520);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 520, 440, 110);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
       
        
        
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseReleased

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
   
    }//GEN-LAST:event_formWindowGainedFocus

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formMouseEntered

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
          // TODO add your handling code here:
       
    }//GEN-LAST:event_formWindowLostFocus

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        // TODO add your handling code here:
        /* mouseX = MouseInfo.getPointerInfo().getLocation().x;
        mouseY= MouseInfo.getPointerInfo().getLocation().y;
        this.setLocation(mouseX,mouseY);*/
    }//GEN-LAST:event_jLabel2MouseReleased

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MousePressed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        String usuario = "";  // variable para guardar la matricula del usuario para posteriormente comparar
        String tipo="";  // determinamos si es alumno o administrador
        Statement s = null;   // se al macena la conexion 
         if(evt.getKeyCode() == KeyEvent.VK_ENTER)  // si se presiona enter
    {
    try {
        Connection conn = null; //se establece la conexion del sql
        try {
            conn = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Miguel/Documents/NetBeansProjects/Finger/src/javaapplication15/lector.mdb"); // aqui se tiene que cambiar la ruta de la base de datos
                  } catch (SQLException ex) {
                          Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    s = conn.createStatement(); // se hace la conexion  para pposteriormente hacer un statement , el statement sirve para poder hacer querys
                      ResultSet rs = s.executeQuery("SELECT * from Alumnos Where Matricula='"+jTextField1.getText()+"'"); // aqui se hace un select a la tabla papra ver si el alumno existe
        
                    if (rs.next()) { // se jala los datos si es que hubo una coincidencia con la base de datos y la matricula ingresada
                          usuario=rs.getString("Matricula");
                          tipo= rs.getString("tipo");
                          
                    }
    } catch (SQLException ex) {
        Logger.getLogger(MainHome.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    // aqui se decide si se deja entrar a la persona o no ;)
    if(jTextField1.getText().equals(usuario)){
             System.out.println(tipo);
                  
                  
                  if(tipo.equals("Administrador")){
                      this.dispose();
                      Registro reg= new Registro();
                      reg.setVisible(true);
                      reg.setLocation(200, 10);
                  }else{
                 try {
                     s.executeUpdate("INSERT INTO RegistrodeActividad (Matricula,Registro) VALUES('"+jTextField1.getText()+"', '"+dateFormat.format(date)+"')");
                 } catch (SQLException ex) {
                     Logger.getLogger(MainHome.class.getName()).log(Level.SEVERE, null, ex);
                 }
                  }
     
              }       jTextField1.setText("");
        }// tecla enter fin
        
                 
    }//GEN-LAST:event_jTextField1KeyPressed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(MainHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                MainHome main= new MainHome();
                main.setVisible(true);
             //  main.setLocationRelativeTo(null);
             main.setLocation(200, 10);
   
      }
        });
    }
          
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
        }
               