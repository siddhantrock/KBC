package com.design;

import com.player.PlayerDetails;

public class SolutionDialog extends java.awt.Dialog
{
 
    int score;
    
    public SolutionDialog(java.awt.Frame parent, boolean modal,int...score) 
    {
        super(parent, modal);
        initComponents();
        this.score=score[0];
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name_label = new java.awt.Label();
        age_label = new java.awt.Label();
        degree_label = new java.awt.Label();
        qualifiication_label = new java.awt.Label();
        score_label = new java.awt.Label();
        solution_button = new java.awt.Button();
        skip_button = new java.awt.Button();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        setLayout(null);

        name_label.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        name_label.setText("Name");
        add(name_label);
        name_label.setBounds(30, 30, 490, 30);

        age_label.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        age_label.setText("Age");
        add(age_label);
        age_label.setBounds(30, 80, 530, 30);

        degree_label.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        degree_label.setText("Degree");
        add(degree_label);
        degree_label.setBounds(30, 130, 540, 30);

        qualifiication_label.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        qualifiication_label.setText("Qualification");
        add(qualifiication_label);
        qualifiication_label.setBounds(30, 180, 530, 30);

        score_label.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        score_label.setText("Score");
        add(score_label);
        score_label.setBounds(30, 240, 540, 30);

        solution_button.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        solution_button.setLabel("Solution");
        solution_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solution_buttonActionPerformed(evt);
            }
        });
        add(solution_button);
        solution_button.setBounds(160, 340, 90, 30);

        skip_button.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        skip_button.setLabel("Skip");
        skip_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skip_buttonActionPerformed(evt);
            }
        });
        add(skip_button);
        skip_button.setBounds(270, 340, 70, 30);

        setBounds(0, 0, 599, 462);
    }// </editor-fold>//GEN-END:initComponents

    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        PlayerDetails playerdetails=PlayerDetails.getPlayerDetails();
        name_label.setText(name_label.getText() + " : " + playerdetails.getName());
        age_label.setText(age_label.getText() + " : " + playerdetails.getAge());
        degree_label.setText(degree_label.getText() + " : " + playerdetails.getDegree());
        qualifiication_label.setText(qualifiication_label.getText() + " : " + playerdetails.getQualification());
        score_label.setText(score_label.getText() + " : " + score);
    }//GEN-LAST:event_formWindowActivated

    private void skip_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skip_buttonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_skip_buttonActionPerformed

    private void solution_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solution_buttonActionPerformed
        // TODO add your handling code here:
        Design design = new Design();
    }//GEN-LAST:event_solution_buttonActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() {
                SolutionDialog dialog = new SolutionDialog(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() 
                {
                    public void windowClosing(java.awt.event.WindowEvent e) 
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label age_label;
    private java.awt.Label degree_label;
    private java.awt.Label name_label;
    private java.awt.Label qualifiication_label;
    private java.awt.Label score_label;
    private java.awt.Button skip_button;
    private java.awt.Button solution_button;
    // End of variables declaration//GEN-END:variables
}
