
import java.awt.Color;
import javax.swing.JFrame;

public class INICIO5 extends javax.swing.JFrame {

    public String A;
    public String B;
    public String C;
    public String unidades;
    public String aux;
    public double velocidad;
    public String unids;
    public int ind;
    public double tiempo;
    public int ind2;
    public String segs;
    public String salida;
    public double gravedad;
    public double grados;
    public int indgrados;
    public double rangox;
    public double altmax;
    public INICIO5(String A,String B,String C) {
        this.A=A;
        this.B=B;
        this.C=C;
        ind=this.A.indexOf(" ");
        indgrados=this.C.indexOf("°");
        grados=Double.parseDouble(this.C.substring(0, indgrados));
            double Result; 
            double AnguloRadianes = Math.toRadians(grados);        
        this.unidades=this.A.substring(ind+1);
        unids=this.A.substring(0, ind);
        velocidad=Double.parseDouble(unids);
        ind2=this.B.indexOf(" ");
        tiempo=Double.parseDouble(this.B.substring(0, ind2));
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        this.setTitle("PROYECTO FINAL");
        this.setLocationRelativeTo(null);
        if(unidades.equals("m/s"))
        {
            salida="m";
            gravedad=-9.8;
        }
        else
            if(unidades.equals("ft/s"))
            {
                salida="ft";
                gravedad=-32;
            }
        double voy=velocidad;
        velocidad=velocidad*Math.cos(AnguloRadianes);
        voy=voy*Math.sin(AnguloRadianes);
        double x=tiempo*velocidad;
        double y=(tiempo*tiempo*gravedad/2)+(voy*tiempo);
        double desp=Math.sqrt((x*x)+(y*y));
        double RCS = x/Math.pow(10,Math.floor(Math.log10(Math.abs(x)))-(3-1)); 
        RCS = Math.round(RCS); 
        Result = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(x)))-(3-1)); 
        jTextField2.setText((Double.toString(Result)+" "+salida));
        RCS = y/Math.pow(10,Math.floor(Math.log10(Math.abs(y)))-(3-1)); 
        RCS = Math.round(RCS); 
        Result = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(y)))-(3-1)); 
        jTextField3.setText((Double.toString(Result)+" "+salida));
        RCS = desp/Math.pow(10,Math.floor(Math.log10(Math.abs(desp)))-(3-1)); 
        RCS = Math.round(RCS); 
        Result = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(desp)))-(3-1)); 
        jTextField4.setText((Double.toString(Result)+" "+salida));
                
        double Phi = Math.atan2(Math.abs(y), Math.abs(x));
        double Theta = Math.toDegrees(Phi); 
        RCS = Theta/Math.pow(10,Math.floor(Math.log10(Math.abs(Theta)))-(3-1)); 
        RCS = Math.round(RCS); 
        Theta = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(Theta)))-(3-1)); 
        if(x<0 && y>0)
            Theta=180.0-Theta;
        else
            if(x<0 && y<0)
                Theta+=180.0;
            else
                if(x>0 && y<0)
                    Theta=360.0-Theta;
        jTextField5.setText(Double.toString(Theta)+"°");
                RCS = velocidad/Math.pow(10,Math.floor(Math.log10(Math.abs(velocidad)))-(3-1)); 
        RCS = Math.round(RCS); 
        velocidad = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(velocidad)))-(3-1));
        jTextField6.setText(velocidad+" "+unidades);
        double vy=(gravedad*tiempo)+voy;
        RCS = vy/Math.pow(10,Math.floor(Math.log10(Math.abs(vy)))-(3-1)); 
        RCS = Math.round(RCS); 
        vy = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(vy)))-(3-1)); 
        jTextField7.setText(Double.toString(vy)+" "+unidades);
        x=velocidad;
        double velocidadf=Math.sqrt((x*x)+(vy*vy));
        RCS = velocidadf/Math.pow(10,Math.floor(Math.log10(Math.abs(velocidadf)))-(3-1)); 
        RCS = Math.round(RCS); 
        Result = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(velocidadf)))-(3-1)); 
        jTextField8.setText((Double.toString(Result)+" "+unidades));
                
        Phi = Math.atan2(Math.abs(vy), Math.abs(x));
        Theta = Math.toDegrees(Phi); 
        RCS = Theta/Math.pow(10,Math.floor(Math.log10(Math.abs(Theta)))-(3-1)); 
        RCS = Math.round(RCS); 
        Theta = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(Theta)))-(3-1)); 
        if(x<0 && y>0)
            Theta=180.0-Theta;
        else
            if(x<0 && vy<0)
                Theta+=180.0;
            else
                if(x>0 && y<0)
                    Theta=360.0-Theta;
        jTextField1.setText(Double.toString(Theta)+"°");
        
        tiempo=(-voy)/(gravedad);
        RCS = tiempo/Math.pow(10,Math.floor(Math.log10(Math.abs(tiempo)))-(3-1)); 
        RCS = Math.round(RCS); 
        tiempo = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(tiempo)))-(3-1)); 
        jTextField11.setText(Double.toString(tiempo*2));
        rangox=velocidad*tiempo*2;
        y=(tiempo*tiempo*(gravedad/2));
                y+=(voy*tiempo);
        RCS = rangox/Math.pow(10,Math.floor(Math.log10(Math.abs(rangox)))-(3-1)); 
        RCS = Math.round(RCS); 
        rangox = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(rangox)))-(3-1)); 
        jTextField9.setText(Double.toString(rangox)+" "+salida);
         altmax=y;
        RCS = altmax/Math.pow(10,Math.floor(Math.log10(Math.abs(altmax)))-(3-1)); 
        RCS = Math.round(RCS); 
        altmax = RCS * Math.pow(10,Math.floor(Math.log10(Math.abs(altmax)))-(3-1)); 
        jTextField10.setText(Double.toString(altmax)+" "+salida);

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(420, 750));
        setPreferredSize(new java.awt.Dimension(420, 730));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jButton1.setText("Regresar al Menu Anterior");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 670, 260, -1));

        jLabel4.setBackground(new java.awt.Color(51, 102, 255));
        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Mecánica Básica y Óptica");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 420, 45));

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 0, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Tiro Parabólico");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 420, 45));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ang. Desp:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 290, 85, -1));

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Desp. X:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 170, 85, -1));

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Desp. Y:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 210, 85, -1));

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Vx:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 330, 85, -1));

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Vy:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 370, 85, -1));

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Velocidad:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 410, 85, -1));

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Desp.");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 250, 85, -1));

        jLabel10.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Ang. Vel:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 450, 85, -1));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 16)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 450, 240, -1));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Bradley Hand ITC", 1, 16)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 170, 240, -1));

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Bradley Hand ITC", 1, 16)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 210, 240, -1));

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Bradley Hand ITC", 1, 16)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 250, 240, -1));

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Bradley Hand ITC", 1, 16)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 290, 240, -1));

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Bradley Hand ITC", 1, 16)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 330, 240, -1));

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Bradley Hand ITC", 1, 16)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 370, 240, -1));

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Bradley Hand ITC", 1, 16)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 410, 240, -1));

        jLabel11.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Rango:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 490, 85, -1));

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Bradley Hand ITC", 1, 16)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 490, 240, -1));

        jLabel12.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Alt. max.:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 530, 85, -1));

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Bradley Hand ITC", 1, 16)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 530, 240, -1));

        jLabel13.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("T. Caída");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 570, 85, -1));

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Bradley Hand ITC", 1, 16)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 570, 240, -1));

        jButton2.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jButton2.setText("Ver Gráfica");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 620, 260, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        INICIO4 ini = new INICIO4();
        ini.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
JFrame frame = new JFrame("Gráfica");   XD juego = new XD(rangox,altmax);  
     frame.add(juego);   frame.setSize(1366, 768);   frame.setVisible(true); 
     frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(INICIO3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(INICIO3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(INICIO3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(INICIO3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
