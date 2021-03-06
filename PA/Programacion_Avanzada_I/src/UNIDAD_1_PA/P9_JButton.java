/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UNIDAD_1_PA;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author GuillermoToledano
 */
public class P9_JButton extends javax.swing.JFrame {

    private float PRICE;
    private String OS, PROC, MEM, VID;

    public P9_JButton() {
        this.PRICE = 1099.99f;
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        ToggleButton01.setSelected(true);
        ToggleButton03.setSelected(true);
        ToggleButton05.setSelected(true);
        ToggleButton07.setSelected(true);
        ToggleButton09.setSelected(true);
        ToggleButton12.setSelected(true);
        Label10.setText("$" + this.PRICE);
        this.OS = ToggleButton01.getText();
        this.PROC = ToggleButton03.getText();
        this.MEM = ToggleButton05.getText();
        this.VID = ToggleButton07.getText();
    }

    /**
     * Creates new form P09_JButton
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label01 = new javax.swing.JLabel();
        ToggleButton01 = new javax.swing.JToggleButton();
        ToggleButton02 = new javax.swing.JToggleButton();
        Label02 = new javax.swing.JLabel();
        ToggleButton03 = new javax.swing.JToggleButton();
        ToggleButton04 = new javax.swing.JToggleButton();
        Label03 = new javax.swing.JLabel();
        ToggleButton05 = new javax.swing.JToggleButton();
        ToggleButton06 = new javax.swing.JToggleButton();
        Label04 = new javax.swing.JLabel();
        ToggleButton07 = new javax.swing.JToggleButton();
        ToggleButton08 = new javax.swing.JToggleButton();
        Label05 = new javax.swing.JLabel();
        ToggleButton09 = new javax.swing.JToggleButton();
        ToggleButton10 = new javax.swing.JToggleButton();
        ToggleButton11 = new javax.swing.JToggleButton();
        Label06 = new javax.swing.JLabel();
        ToggleButton12 = new javax.swing.JToggleButton();
        ToggleButton13 = new javax.swing.JToggleButton();
        Label07 = new javax.swing.JLabel();
        ToggleButton14 = new javax.swing.JToggleButton();
        ToggleButton15 = new javax.swing.JToggleButton();
        Label08 = new javax.swing.JLabel();
        ToggleButton16 = new javax.swing.JToggleButton();
        ToggleButton17 = new javax.swing.JToggleButton();
        Label09 = new javax.swing.JLabel();
        Label10 = new javax.swing.JLabel();
        Button01 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customization");
        setMinimumSize(new java.awt.Dimension(460, 530));
        setResizable(false);

        Label01.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Label01.setText("Operating System");

        ToggleButton01.setText("Windows 10 Home");
        ToggleButton01.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ToggleButton01.setFocusPainted(false);
        ToggleButton01.setFocusable(false);
        ToggleButton01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButton01ActionPerformed(evt);
            }
        });

        ToggleButton02.setText("Windows 10 Pro");
        ToggleButton02.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ToggleButton02.setFocusPainted(false);
        ToggleButton02.setFocusable(false);
        ToggleButton02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButton02ActionPerformed(evt);
            }
        });

        Label02.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Label02.setText("Processor");

        ToggleButton03.setText("Intel Core i7-8750H");
        ToggleButton03.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ToggleButton03.setFocusPainted(false);
        ToggleButton03.setFocusable(false);
        ToggleButton03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButton03ActionPerformed(evt);
            }
        });

        ToggleButton04.setText("Intel Core i7-9750H");
        ToggleButton04.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ToggleButton04.setFocusPainted(false);
        ToggleButton04.setFocusable(false);
        ToggleButton04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButton04ActionPerformed(evt);
            }
        });

        Label03.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Label03.setText("Memory");

        ToggleButton05.setText("8GB DDR4 @2666 MHz");
        ToggleButton05.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ToggleButton05.setFocusPainted(false);
        ToggleButton05.setFocusable(false);
        ToggleButton05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButton05ActionPerformed(evt);
            }
        });

        ToggleButton06.setText("16GB DDR4 @2666 MHz");
        ToggleButton06.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ToggleButton06.setFocusPainted(false);
        ToggleButton06.setFocusable(false);
        ToggleButton06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButton06ActionPerformed(evt);
            }
        });

        Label04.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Label04.setText("Video Card");

        ToggleButton07.setText("NVIDIA GeForce GTX 1060 6GB GDDR5");
        ToggleButton07.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ToggleButton07.setFocusPainted(false);
        ToggleButton07.setFocusable(false);
        ToggleButton07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButton07ActionPerformed(evt);
            }
        });

        ToggleButton08.setText("NVIDIA GeForce GTX 1660 Ti 6GB GDDR6");
        ToggleButton08.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ToggleButton08.setFocusPainted(false);
        ToggleButton08.setFocusable(false);
        ToggleButton08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButton08ActionPerformed(evt);
            }
        });

        Label05.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Label05.setText("Hard Drive");

        ToggleButton09.setText("1TB (+8GB SSHD) Hybrid Drive");
        ToggleButton09.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ToggleButton09.setFocusPainted(false);
        ToggleButton09.setFocusable(false);
        ToggleButton09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButton09ActionPerformed(evt);
            }
        });

        ToggleButton10.setText("512GB PCIe M.2 SSD");
        ToggleButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ToggleButton10.setFocusPainted(false);
        ToggleButton10.setFocusable(false);
        ToggleButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButton10ActionPerformed(evt);
            }
        });

        ToggleButton11.setText("256GB PCIe M.2 SSD + 1TB (+8GB SSHD) Hybrid Drive");
        ToggleButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ToggleButton11.setFocusPainted(false);
        ToggleButton11.setFocusable(false);
        ToggleButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButton11ActionPerformed(evt);
            }
        });

        Label06.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Label06.setText("Display");

        ToggleButton12.setText("15.6\" FHD (1920 x 1080) 60Hz Anti-Glare IPS");
        ToggleButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ToggleButton12.setFocusPainted(false);
        ToggleButton12.setFocusable(false);
        ToggleButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButton12ActionPerformed(evt);
            }
        });

        ToggleButton13.setText("15.6\" FHD (1920 x 1080) 144Hz Anti-Glare IPS");
        ToggleButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ToggleButton13.setFocusPainted(false);
        ToggleButton13.setFocusable(false);
        ToggleButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButton13ActionPerformed(evt);
            }
        });

        Label07.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Label07.setText("Security Software");

        ToggleButton14.setText("Anti-virus 1 Year");
        ToggleButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ToggleButton14.setFocusPainted(false);
        ToggleButton14.setFocusable(false);
        ToggleButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButton14ActionPerformed(evt);
            }
        });

        ToggleButton15.setText("Anti-virus 2 Years");
        ToggleButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ToggleButton15.setFocusPainted(false);
        ToggleButton15.setFocusable(false);
        ToggleButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButton15ActionPerformed(evt);
            }
        });

        Label08.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Label08.setText("Support");

        ToggleButton16.setText("1 Year Service");
        ToggleButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ToggleButton16.setFocusPainted(false);
        ToggleButton16.setFocusable(false);
        ToggleButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButton16ActionPerformed(evt);
            }
        });

        ToggleButton17.setText("2 Year Service");
        ToggleButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ToggleButton17.setFocusPainted(false);
        ToggleButton17.setFocusable(false);
        ToggleButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButton17ActionPerformed(evt);
            }
        });

        Label09.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Label09.setText("Total Price");

        Label10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Label10.setText("$0.0");

        Button01.setText("Generate Order");
        Button01.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button01ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ToggleButton12)
                    .addComponent(Label04)
                    .addComponent(ToggleButton07)
                    .addComponent(Label05)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ToggleButton09)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ToggleButton10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label01)
                            .addComponent(ToggleButton01)
                            .addComponent(ToggleButton02))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label02)
                            .addComponent(ToggleButton03)
                            .addComponent(ToggleButton04))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label03)
                            .addComponent(ToggleButton05)
                            .addComponent(ToggleButton06)))
                    .addComponent(ToggleButton08)
                    .addComponent(ToggleButton11)
                    .addComponent(Label06)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label08)
                                    .addComponent(ToggleButton16)
                                    .addComponent(ToggleButton17))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ToggleButton14)
                                    .addComponent(Label07)
                                    .addComponent(ToggleButton15))
                                .addGap(19, 19, 19))
                            .addComponent(ToggleButton13))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(Label09, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label10)
                            .addComponent(Button01))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Label01, ToggleButton01, ToggleButton02});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Label02, ToggleButton03, ToggleButton04});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Label03, ToggleButton05, ToggleButton06});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Label04, ToggleButton07, ToggleButton08});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Label05, ToggleButton09, ToggleButton10});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Label06, ToggleButton12, ToggleButton13});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Label07, ToggleButton14, ToggleButton15});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Label08, ToggleButton16, ToggleButton17});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Button01, Label09, Label10});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label01)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ToggleButton01)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ToggleButton02))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label02)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ToggleButton03)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ToggleButton04))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label03)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ToggleButton05)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ToggleButton06)))
                .addGap(18, 18, 18)
                .addComponent(Label04)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ToggleButton07)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ToggleButton08)
                .addGap(18, 18, 18)
                .addComponent(Label05)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ToggleButton09)
                    .addComponent(ToggleButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ToggleButton11)
                .addGap(18, 18, 18)
                .addComponent(Label06)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ToggleButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ToggleButton13)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label08)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ToggleButton16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ToggleButton17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label09)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Label10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label07)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ToggleButton14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ToggleButton15)
                            .addComponent(Button01))))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Label01, ToggleButton01, ToggleButton02});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Label02, ToggleButton03, ToggleButton04});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Label03, ToggleButton05, ToggleButton06});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Label04, ToggleButton07, ToggleButton08});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Label05, ToggleButton09, ToggleButton10, ToggleButton11});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Button01, Label07, Label08, Label09, Label10, ToggleButton14, ToggleButton15, ToggleButton16, ToggleButton17});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Label06, ToggleButton12, ToggleButton13});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ToggleButton01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButton01ActionPerformed
        ToggleButton01.setSelected(true);
        this.OS = ToggleButton01.getText();
        if (ToggleButton02.isSelected()) {
            ToggleButton02.setSelected(false);
            this.PRICE -= 60.0f;
            Label10.setText("$" + this.PRICE);
        }
    }//GEN-LAST:event_ToggleButton01ActionPerformed

    private void ToggleButton02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButton02ActionPerformed
        ToggleButton02.setSelected(true);
        this.OS = ToggleButton02.getText();
        if (ToggleButton01.isSelected()) {
            ToggleButton01.setSelected(false);
            this.PRICE += 60.0f;
            Label10.setText("$" + this.PRICE);
        }
    }//GEN-LAST:event_ToggleButton02ActionPerformed

    private void ToggleButton03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButton03ActionPerformed
        ToggleButton03.setSelected(true);
        this.PROC = ToggleButton03.getText();
        if (ToggleButton04.isSelected()) {
            ToggleButton04.setSelected(false);
            this.PRICE -= 60.0f;
            Label10.setText("$" + this.PRICE);
        }
    }//GEN-LAST:event_ToggleButton03ActionPerformed

    private void ToggleButton04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButton04ActionPerformed
        ToggleButton04.setSelected(true);
        this.PROC = ToggleButton04.getText();
        if (ToggleButton03.isSelected()) {
            ToggleButton03.setSelected(false);
            this.PRICE += 60.0f;
            Label10.setText("$" + this.PRICE);
        }
    }//GEN-LAST:event_ToggleButton04ActionPerformed

    private void ToggleButton05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButton05ActionPerformed
        ToggleButton05.setSelected(true);
        this.MEM = ToggleButton05.getText();
        if (ToggleButton06.isSelected()) {
            ToggleButton06.setSelected(false);
            this.PRICE -= 60.0f;
            Label10.setText("$" + this.PRICE);
        }
    }//GEN-LAST:event_ToggleButton05ActionPerformed

    private void ToggleButton06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButton06ActionPerformed
        ToggleButton06.setSelected(true);
        this.MEM = ToggleButton06.getText();
        if (ToggleButton05.isSelected()) {
            ToggleButton05.setSelected(false);
            this.PRICE += 60.0f;
            Label10.setText("$" + this.PRICE);
        }
    }//GEN-LAST:event_ToggleButton06ActionPerformed

    private void ToggleButton07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButton07ActionPerformed
        ToggleButton07.setSelected(true);
        VID = ToggleButton07.getText();
        if (ToggleButton08.isSelected()) {
            ToggleButton08.setSelected(false);
            this.PRICE -= 200.0f;
            Label10.setText("$" + this.PRICE);
        }
    }//GEN-LAST:event_ToggleButton07ActionPerformed

    private void ToggleButton08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButton08ActionPerformed
        ToggleButton08.setSelected(true);
        VID = ToggleButton08.getText();
        if (ToggleButton07.isSelected()) {
            ToggleButton07.setSelected(false);
            this.PRICE += 200.0f;
            Label10.setText("$" + this.PRICE);
        }
    }//GEN-LAST:event_ToggleButton08ActionPerformed

    private void ToggleButton09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButton09ActionPerformed
        ToggleButton09.setSelected(true);
        if (ToggleButton10.isSelected()) {
            this.PRICE -= 60.0f;
            Label10.setText("$" + this.PRICE);
        } else if (ToggleButton11.isSelected()) {
            this.PRICE -= 70.0f;
            Label10.setText("$" + this.PRICE);
        }
        ToggleButton10.setSelected(false);
        ToggleButton11.setSelected(false);
    }//GEN-LAST:event_ToggleButton09ActionPerformed

    private void ToggleButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButton11ActionPerformed
        ToggleButton11.setSelected(true);
        if (ToggleButton09.isSelected()) {
            this.PRICE += 70.0f;
            Label10.setText("$" + this.PRICE);
        } else if (ToggleButton10.isSelected()) {
            this.PRICE += 10.0f;
            Label10.setText("$" + this.PRICE);
        }
        ToggleButton09.setSelected(false);
        ToggleButton10.setSelected(false);
    }//GEN-LAST:event_ToggleButton11ActionPerformed

    private void ToggleButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButton10ActionPerformed
        ToggleButton10.setSelected(true);
        if (ToggleButton09.isSelected()) {
            this.PRICE += 60.0f;
            Label10.setText("$" + this.PRICE);
        } else if (ToggleButton11.isSelected()) {
            this.PRICE -= 10.0f;
            Label10.setText("$" + this.PRICE);
        }
        ToggleButton09.setSelected(false);
        ToggleButton11.setSelected(false);
    }//GEN-LAST:event_ToggleButton10ActionPerformed

    private void ToggleButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButton12ActionPerformed
        ToggleButton12.setSelected(true);
        if (ToggleButton13.isSelected()) {
            ToggleButton13.setSelected(false);
            this.PRICE -= 150.0f;
            Label10.setText("$" + this.PRICE);
        }
    }//GEN-LAST:event_ToggleButton12ActionPerformed

    private void ToggleButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButton13ActionPerformed
        ToggleButton13.setSelected(true);
        if (ToggleButton12.isSelected()) {
            ToggleButton12.setSelected(false);
            this.PRICE += 150.0f;
            Label10.setText("$" + this.PRICE);
        }
    }//GEN-LAST:event_ToggleButton13ActionPerformed

    private void ToggleButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButton14ActionPerformed
        if (ToggleButton14.isSelected()) {
            if (ToggleButton15.isSelected()) {
                ToggleButton15.setSelected(false);
                this.PRICE -= 20.0f;
                Label10.setText("$" + this.PRICE);
            } else {
                this.PRICE += 30.0f;
                Label10.setText("$" + this.PRICE);
            }
        } else {
            this.PRICE -= 30.0f;
            Label10.setText("$" + this.PRICE);
        }
    }//GEN-LAST:event_ToggleButton14ActionPerformed

    private void ToggleButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButton15ActionPerformed
        if (ToggleButton15.isSelected()) {
            if (ToggleButton14.isSelected()) {
                ToggleButton14.setSelected(false);
                this.PRICE += 20.0f;
                Label10.setText("$" + this.PRICE);
            } else {
                this.PRICE += 50.0f;
                Label10.setText("$" + this.PRICE);
            }
        } else {
            this.PRICE -= 50.0f;
            Label10.setText("$" + this.PRICE);
        }
    }//GEN-LAST:event_ToggleButton15ActionPerformed

    private void ToggleButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButton16ActionPerformed
        if (ToggleButton16.isSelected()) {
            if (ToggleButton17.isSelected()) {
                ToggleButton17.setSelected(false);
                this.PRICE += 10.0f;
                Label10.setText("$" + this.PRICE);
            } else {
                this.PRICE += 60.0f;
                Label10.setText("$" + this.PRICE);
            }
        } else {
            this.PRICE -= 60.0f;
            Label10.setText("$" + this.PRICE);
        }
    }//GEN-LAST:event_ToggleButton16ActionPerformed

    private void ToggleButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButton17ActionPerformed
        if (ToggleButton17.isSelected()) {
            if (ToggleButton16.isSelected()) {
                ToggleButton16.setSelected(false);
                this.PRICE -= 10.0f;
                Label10.setText("$" + this.PRICE);
            } else {
                this.PRICE += 50.0f;
                Label10.setText("$" + this.PRICE);
            }
        } else {
            this.PRICE -= 50.0f;
            Label10.setText("$" + this.PRICE);
        }
    }//GEN-LAST:event_ToggleButton17ActionPerformed

    private void Button01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button01ActionPerformed
        int answer;
        String message = "OS: " + this.OS + "\n" +
                "Processor: " + this.PROC + "\n" +
                "Memory: " + this.MEM + "\n" +
                "Video Card: " + this.VID + "\n";
        String title = " Confirm Selection";
        answer = JOptionPane.showConfirmDialog(this, message, title, 
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
    }//GEN-LAST:event_Button01ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(P9_JButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P9_JButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P9_JButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P9_JButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new P9_JButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button01;
    private javax.swing.JLabel Label01;
    private javax.swing.JLabel Label02;
    private javax.swing.JLabel Label03;
    private javax.swing.JLabel Label04;
    private javax.swing.JLabel Label05;
    private javax.swing.JLabel Label06;
    private javax.swing.JLabel Label07;
    private javax.swing.JLabel Label08;
    private javax.swing.JLabel Label09;
    private javax.swing.JLabel Label10;
    private javax.swing.JToggleButton ToggleButton01;
    private javax.swing.JToggleButton ToggleButton02;
    private javax.swing.JToggleButton ToggleButton03;
    private javax.swing.JToggleButton ToggleButton04;
    private javax.swing.JToggleButton ToggleButton05;
    private javax.swing.JToggleButton ToggleButton06;
    private javax.swing.JToggleButton ToggleButton07;
    private javax.swing.JToggleButton ToggleButton08;
    private javax.swing.JToggleButton ToggleButton09;
    private javax.swing.JToggleButton ToggleButton10;
    private javax.swing.JToggleButton ToggleButton11;
    private javax.swing.JToggleButton ToggleButton12;
    private javax.swing.JToggleButton ToggleButton13;
    private javax.swing.JToggleButton ToggleButton14;
    private javax.swing.JToggleButton ToggleButton15;
    private javax.swing.JToggleButton ToggleButton16;
    private javax.swing.JToggleButton ToggleButton17;
    // End of variables declaration//GEN-END:variables
}
