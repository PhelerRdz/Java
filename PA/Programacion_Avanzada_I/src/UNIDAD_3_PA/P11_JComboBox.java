package UNIDAD_3_PA;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author GuillermoToledano
 */
public class P11_JComboBox extends javax.swing.JFrame {

    private final DefaultComboBoxModel State;
    private final DefaultComboBoxModel Cities;
    private final DefaultComboBoxModel Branch;
    private final String[] Estados = {
        "Tamaulipas"
    };
    private final String[] Tamaulipas = {
        "Abasolo","Aldama","Altamira","Antiguo Morelos","Burgos","Bustamante",
        "Camargo","Casas","Cruillas","Güémez","Gómez Farías","González","Guerrero",
        "Gustavo Díaz Ordaz","Hidalgo","Jaumave","Jiménez","Llera","Madero",
        "Mainero","Mante","Matamoros","Méndez","Mier","Miguel Alemán","Miquihuana",
        "Nuevo Laredo","Nuevo Morelos","Ocampo","Padilla","Palmillas","Reynosa",
        "Río Bravo","San Carlos","San Fernando","San Nicolás","Soto la Marina",
        "Tampico","Tula","Valle Hermoso","Victoria","Villagrán","Xicoténcatl"
    };
    public P11_JComboBox() {
        setLooknFeel();
        initComponents();
        State = new DefaultComboBoxModel();
        for (String Estado : Estados) {
            State.addElement(Estado);
        }
        ComboBox01.setModel(State);
        
        Cities = new DefaultComboBoxModel();
        for (String Ciudad : Tamaulipas) {
            Cities.addElement(Ciudad);
        }
        ComboBox02.setModel(Cities);
        
        Branch = new DefaultComboBoxModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Label01 = new javax.swing.JLabel();
        ComboBox01 = new javax.swing.JComboBox<>();
        Button01 = new javax.swing.JButton();
        ComboBox02 = new javax.swing.JComboBox<>();
        Label02 = new javax.swing.JLabel();
        Button02 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        Label03 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 200));
        setMinimumSize(new java.awt.Dimension(500, 200));
        setPreferredSize(new java.awt.Dimension(500, 200));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        Label01.setText("Estado");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 68;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 20, 0, 0);
        getContentPane().add(Label01, gridBagConstraints);

        ComboBox01.setMaximumSize(new java.awt.Dimension(100, 20));
        ComboBox01.setMinimumSize(new java.awt.Dimension(100, 20));
        ComboBox01.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
        getContentPane().add(ComboBox01, gridBagConstraints);

        Button01.setText("Select");
        Button01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button01ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 60, 33, 0);
        getContentPane().add(Button01, gridBagConstraints);

        ComboBox02.setMaximumSize(new java.awt.Dimension(50, 20));
        ComboBox02.setMinimumSize(new java.awt.Dimension(50, 20));
        ComboBox02.setPreferredSize(new java.awt.Dimension(50, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 73;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 15, 0, 0);
        getContentPane().add(ComboBox02, gridBagConstraints);

        Label02.setText("Ciudad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 67;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 15, 0, 23);
        getContentPane().add(Label02, gridBagConstraints);

        Button02.setText("Select");
        Button02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button02ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 76, 33, 0);
        getContentPane().add(Button02, gridBagConstraints);

        jComboBox1.setMaximumSize(new java.awt.Dimension(50, 20));
        jComboBox1.setMinimumSize(new java.awt.Dimension(50, 20));
        jComboBox1.setPreferredSize(new java.awt.Dimension(50, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 72;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 15, 0, 21);
        getContentPane().add(jComboBox1, gridBagConstraints);

        Label03.setText("Sucursal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 15, 0, 21);
        getContentPane().add(Label03, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button01ActionPerformed

    }//GEN-LAST:event_Button01ActionPerformed

    private void Button02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button02ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new P11_JComboBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button01;
    private javax.swing.JButton Button02;
    private javax.swing.JComboBox<String> ComboBox01;
    private javax.swing.JComboBox<String> ComboBox02;
    private javax.swing.JLabel Label01;
    private javax.swing.JLabel Label02;
    private javax.swing.JLabel Label03;
    private javax.swing.JComboBox<String> jComboBox1;
    // End of variables declaration//GEN-END:variables

    private void setLooknFeel() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println(ex);
        }
    }

}
