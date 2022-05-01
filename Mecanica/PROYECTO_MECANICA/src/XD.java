import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;

public class XD extends javax.swing.JPanel {

    /**
     * Creates new form XD
     */
    public XD(double rango,double alt) {
        System.out.println(alt);
        initComponents();
        this.setVisible(true);
        this.setBackground(Color.white);
        jLabel3.setText(Double.toString((int)rango/9));
        jLabel4.setText(Double.toString(((int)rango/9)*2));
        jLabel5.setText(Double.toString(((int)rango/9)*3));
        jLabel6.setText(Double.toString(((int)rango/9)*4));
        jLabel7.setText(Double.toString(((int)rango/9)*5));
        jLabel8.setText(Double.toString(((int)rango/9)*6));
        jLabel9.setText(Double.toString(((int)rango/9)*7));
        jLabel10.setText(Double.toString(((int)rango/9)*8));
        jLabel11.setText(Double.toString(rango));
        jLabel12.setText(Double.toString((int)alt/5));
        jLabel13.setText(Double.toString(((int)alt/5)*2));
        jLabel14.setText(Double.toString(((int)alt/5)*3));
        jLabel15.setText(Double.toString(((int)alt/5)*4));
        jLabel16.setText(Double.toString(alt));

    }
    public static int x=-100,y=750,ballx=20,bally=20;
 @Override  public void paint(Graphics g) {   
     super.paint(g);   
     Graphics2D g2d = (Graphics2D) g; 
     g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,   
             RenderingHints.VALUE_ANTIALIAS_ON);  
         g.fillOval(146, 542, ballx, bally); 
         g.fillOval(267, 424, ballx, bally); 
         g.fillOval(388, 335, ballx, bally); 
         g.fillOval(509, 276, ballx, bally); 
         g.fillOval(630, 246, ballx, bally); 
         g.fillOval(751, 276, ballx, bally); 
         g.fillOval(872, 335, ballx, bally); 
         g.fillOval(993, 424, ballx, bally); 
         g.fillOval(1114, 542, ballx, bally); 
         g.fillOval(1175, 630, ballx, bally); 
         g.fillOval(90, 630, ballx, bally); 
 }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Conachuza");   XD juego = new XD(0,0);  
     frame.add(juego);   frame.setSize(1366, 768);   frame.setVisible(true); 
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("0");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 660, 50, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("0");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 660, 50, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("0");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 660, 50, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("0");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 660, 50, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("0");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 660, 50, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("0");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 660, 50, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("0");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(796, 660, 50, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("0");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 660, 50, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("0");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1038, 660, 50, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("0");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 660, 50, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("0");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 542, 50, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("0");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 424, 50, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("0");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 335, 50, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("0");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 276, 50, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("0");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 246, 50, -1));

        jButton1.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jButton1.setText("Regresar al Menu Anterior");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 20, 260, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Salvador Segura\\Desktop\\insertar.png")); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 720));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        INICIO4 ini = new INICIO4();
        ini.setVisible(true);
        this.setVisible(false);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
