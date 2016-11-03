/*
 * Copyright (C) 2016 Favna
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package pkg_seedchecker;

import java.util.Timer;
import javax.swing.JOptionPane;

/**
 *
 * @author Favna
 */
public class SEEDChecker extends javax.swing.JFrame {
    
    Timer timer;

    /**
     * Creates new form SEEDCheckerGUI
     */
    public SEEDChecker() {
        initComponents();
    }

    private void iniateTimer() {
        this.timer = new Timer();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Check = new javax.swing.JButton();
        txt_titleID = new javax.swing.JTextField();
        txt_Country = new javax.swing.JTextField();
        lbl_Country = new javax.swing.JLabel();
        lbl_titleID = new javax.swing.JLabel();
        cbx_Interval = new javax.swing.JComboBox<>();
        lbl_Interval = new javax.swing.JLabel();
        scp_Log = new javax.swing.JScrollPane();
        lst_Log = new javax.swing.JList<>();
        btn_Cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Check.setText("Start SEED Checking");
        btn_Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CheckActionPerformed(evt);
            }
        });

        txt_titleID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_titleIDFocusGained(evt);
            }
        });

        txt_Country.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_CountryFocusGained(evt);
            }
        });

        lbl_Country.setText("Country code");

        lbl_titleID.setText("Title ID");

        cbx_Interval.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2 Seconds", "5 Seconds", "10 Seconds", "30 Seconds", "1 Minute", "2 Minutes", "3 Minutes", "5 Minutes", "8 Minutes", "10 Minutes", "15 Minutes", "30 Minutes", "60 Minutes" }));
        cbx_Interval.setSelectedIndex(4);

        lbl_Interval.setText("Set your repeat interval");

        lst_Log.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "No seed available for 0004000000164800 in AU" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lst_Log.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lst_Log.setFocusable(false);
        lst_Log.setRequestFocusEnabled(false);
        scp_Log.setViewportView(lst_Log);

        btn_Cancel.setText("Cancel SEED Checking");
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_titleID)
                            .addComponent(cbx_Interval, 0, 130, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_titleID, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(txt_Country, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_Country))
                            .addComponent(lbl_Interval)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Check, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(scp_Log, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_titleID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_titleID)
                            .addComponent(txt_Country, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Country))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbx_Interval, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Interval))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Check, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(scp_Log))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_titleIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_titleIDFocusGained

    }//GEN-LAST:event_txt_titleIDFocusGained

    private void txt_CountryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_CountryFocusGained

    }//GEN-LAST:event_txt_CountryFocusGained

    private void btn_CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CheckActionPerformed
        int selectedInterval = cbx_Interval.getSelectedIndex();
        int[] selectedTime = {2, 5, 10, 30, 60, 120, 180, 300, 480, 600, 900, 1800, 3600};
        int time = selectedTime[selectedInterval] * 1000;

        String titleID = txt_titleID.getText();
        String country = txt_Country.getText();

        if (titleID.equals("") || country.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill out the TitleID and Country");
        } else {
            iniateTimer();
            timer.schedule(new FileDownloader(titleID, country), 0, time);
        }
    }//GEN-LAST:event_btn_CheckActionPerformed

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        timer.cancel();
        timer.purge();
        iniateTimer();
        System.out.println("Timer canceled!");
    }//GEN-LAST:event_btn_CancelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_Check;
    private javax.swing.JComboBox<String> cbx_Interval;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_Country;
    private javax.swing.JLabel lbl_Interval;
    private javax.swing.JLabel lbl_titleID;
    private javax.swing.JList<String> lst_Log;
    private javax.swing.JScrollPane scp_Log;
    private javax.swing.JTextField txt_Country;
    private javax.swing.JTextField txt_titleID;
    // End of variables declaration//GEN-END:variables
}
