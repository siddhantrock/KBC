package com.design;

import com.constraints.Constraint;
import com.player.AgeException;
import com.player.PlayerDetails;
import java.awt.CheckboxGroup;

public class PlayerInfo extends java.awt.Dialog
{
    CheckboxGroup cg=new CheckboxGroup();
    String name,address,degree,qualification;
    int age;
    FrontPage frontpage;
    
    public void setFrontPage(FrontPage frontpage)
    {
        this.frontpage=frontpage;
    }
    
    
    public PlayerInfo(java.awt.Frame parent, boolean modal) 
    {
        super(parent, modal);
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        name_text = new java.awt.TextField();
        age_text = new java.awt.TextField();
        ug_checkbox = new java.awt.Checkbox();
        pg_checkbox = new java.awt.Checkbox();
        qualification_choice = new java.awt.Choice();
        address_textarea = new java.awt.TextArea();
        submit_button = new java.awt.Button();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        setLayout(null);

        label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label1.setText("Please enter name");
        add(label1);
        label1.setBounds(20, 50, 270, 30);

        label2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label2.setText("Please enter age");
        add(label2);
        label2.setBounds(20, 100, 270, 30);

        label3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label3.setText("Please select your degree");
        add(label3);
        label3.setBounds(20, 150, 280, 30);

        label4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label4.setText("Please choose your qualification");
        add(label4);
        label4.setBounds(20, 200, 290, 30);

        label5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label5.setText("Please enter your address");
        add(label5);
        label5.setBounds(20, 270, 280, 30);

        name_text.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        name_text.setForeground(new java.awt.Color(255, 0, 0));
        name_text.setText("*");
        name_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_textActionPerformed(evt);
            }
        });
        add(name_text);
        name_text.setBounds(310, 50, 260, 28);

        age_text.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        age_text.setForeground(new java.awt.Color(255, 0, 0));
        age_text.setName(""); // NOI18N
        age_text.setText("*");
        add(age_text);
        age_text.setBounds(310, 100, 260, 28);

        ug_checkbox.setCheckboxGroup(cg);
        ug_checkbox.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ug_checkbox.setLabel("UG");
        ug_checkbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ug_checkboxItemStateChanged(evt);
            }
        });
        add(ug_checkbox);
        ug_checkbox.setBounds(310, 150, 53, 28);

        pg_checkbox.setCheckboxGroup(cg);
        pg_checkbox.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pg_checkbox.setLabel("PG");
        pg_checkbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pg_checkboxItemStateChanged(evt);
            }
        });
        add(pg_checkbox);
        pg_checkbox.setBounds(460, 150, 52, 28);

        qualification_choice.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        qualification_choice.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                qualification_choiceItemStateChanged(evt);
            }
        });
        add(qualification_choice);
        qualification_choice.setBounds(320, 200, 200, 28);

        address_textarea.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        address_textarea.setForeground(new java.awt.Color(255, 0, 0));
        address_textarea.setText("*");
        add(address_textarea);
        address_textarea.setBounds(310, 250, 260, 80);

        submit_button.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        submit_button.setLabel("Submit");
        submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_buttonActionPerformed(evt);
            }
        });
        add(submit_button);
        submit_button.setBounds(200, 350, 80, 32);

        setBounds(0, 0, 605, 447);
    }// </editor-fold>//GEN-END:initComponents

    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_buttonActionPerformed
        // TODO add your handling code here:
        Constraint constraint=new Constraint(PlayerInfo.this);
        if(constraint.setConstraint())
        {
        name=name_text.getText();
        age=Integer.parseInt(age_text.getText());
        address=address_textarea.getText();
        try
        {
          PlayerDetails playerDetails = new PlayerDetails(name, age, degree, qualification, address);
        }
        catch(AgeException e)
        {
            age_text.setText(e.getMessage());
        }
        dispose();
        frontpage.dispose();
        Design design = new Design();
        design.setVisible(true);
        }
        else
        {
            System.out.println("please enter all textfield");
        }
        
    }//GEN-LAST:event_submit_buttonActionPerformed

    private void ug_checkboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ug_checkboxItemStateChanged
        // TODO add your handling code here:
        qualification_choice.removeAll();
        if(ug_checkbox.getState())
        {
            qualification_choice.add("B.sc IT ");
            qualification_choice.add("BCA");
            qualification_choice.add("B.tech");
            degree="UG";
        }
        else
        {
            qualification_choice.removeAll();
            degree="";
        }
    }//GEN-LAST:event_ug_checkboxItemStateChanged

    private void pg_checkboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pg_checkboxItemStateChanged
        // TODO add your handling code here:
        qualification_choice.removeAll();
        if(pg_checkbox.getState())
        {
            qualification_choice.add("M.sc IT ");
            qualification_choice.add("MCA");
            qualification_choice.add("M.tech");
            degree="PG";
        }
        else
        {
            qualification_choice.removeAll();
            degree="";
        }
    }//GEN-LAST:event_pg_checkboxItemStateChanged

    private void qualification_choiceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_qualification_choiceItemStateChanged
        // TODO add your handling code here:
        qualification=qualification_choice.getSelectedItem();
    }//GEN-LAST:event_qualification_choiceItemStateChanged

    private void name_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_textActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_name_textActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run()
            {
                PlayerInfo dialog = new PlayerInfo(new java.awt.Frame(), true);
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
    private java.awt.TextArea address_textarea;
    private java.awt.TextField age_text;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.TextField name_text;
    private java.awt.Checkbox pg_checkbox;
    private java.awt.Choice qualification_choice;
    private java.awt.Button submit_button;
    private java.awt.Checkbox ug_checkbox;
    // End of variables declaration//GEN-END:variables
}
