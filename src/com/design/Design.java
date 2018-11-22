package com.design;

import com.constraints.Constraint;
import com.play.Play;
import com.player.PlayerDetails;
import java.awt.CheckboxGroup;

public class Design extends java.awt.Frame 
{
    CheckboxGroup cg=new CheckboxGroup();
    int ans;
    Play p=new Play();
    int min;
    int sec;
    
    public Design()
    {
        initComponents();
    }

    private void timerOperation()
    {
        min=Integer.parseInt(min_text.getText());
        sec=Integer.parseInt(sec_text.getText());
        
        new Thread(new Runnable()
        {
           public void run()
           {
             while(min!=0)
             {
               try
               {
                   sec-=1;
                   sec_text.setText(sec+"");
                   Thread.sleep(1000);
               }
               catch(InterruptedException e)
               {
                 
               }    
               if(sec==0)
               {
                   min-=1;
                   min_text.setText(min+"");
                   sec=59;
               }
            }
        }
        }).start();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        question_label = new java.awt.Label();
        ans1_checkbox = new java.awt.Checkbox();
        ans2_checkbox = new java.awt.Checkbox();
        ans3_checkbox = new java.awt.Checkbox();
        ans4_checkbox = new java.awt.Checkbox();
        next_button = new java.awt.Button();
        name_text = new java.awt.Label();
        degree_text = new java.awt.Label();
        qualification_text = new java.awt.Label();
        age_text = new java.awt.Label();
        min_text = new java.awt.Label();
        label2 = new java.awt.Label();
        sec_text = new java.awt.Label();

        setTitle("Quize game");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(null);

        question_label.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        add(question_label);
        question_label.setBounds(10, 160, 670, 60);

        ans1_checkbox.setCheckboxGroup(cg);
        ans1_checkbox.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ans1_checkbox.setName("sid"); // NOI18N
        ans1_checkbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ans1_checkboxItemStateChanged(evt);
            }
        });
        add(ans1_checkbox);
        ans1_checkbox.setBounds(30, 250, 630, 36);

        ans2_checkbox.setCheckboxGroup(cg);
        ans2_checkbox.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ans2_checkbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ans2_checkboxItemStateChanged(evt);
            }
        });
        add(ans2_checkbox);
        ans2_checkbox.setBounds(30, 290, 630, 36);

        ans3_checkbox.setCheckboxGroup(cg);
        ans3_checkbox.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ans3_checkbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ans3_checkboxItemStateChanged(evt);
            }
        });
        add(ans3_checkbox);
        ans3_checkbox.setBounds(30, 330, 630, 36);

        ans4_checkbox.setCheckboxGroup(cg);
        ans4_checkbox.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ans4_checkbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ans4_checkboxItemStateChanged(evt);
            }
        });
        add(ans4_checkbox);
        ans4_checkbox.setBounds(30, 370, 630, 36);

        next_button.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        next_button.setLabel("Next");
        next_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_buttonActionPerformed(evt);
            }
        });
        add(next_button);
        next_button.setBounds(250, 450, 110, 27);

        name_text.setFont(new java.awt.Font("DFKai-SB", 2, 18)); // NOI18N
        name_text.setText("Name ");
        add(name_text);
        name_text.setBounds(20, 30, 360, 30);

        degree_text.setFont(new java.awt.Font("DFKai-SB", 2, 18)); // NOI18N
        degree_text.setText("Degree");
        add(degree_text);
        degree_text.setBounds(240, 70, 150, 30);

        qualification_text.setFont(new java.awt.Font("DFKai-SB", 2, 18)); // NOI18N
        qualification_text.setText("Qualification");
        add(qualification_text);
        qualification_text.setBounds(20, 120, 190, 30);

        age_text.setFont(new java.awt.Font("David", 2, 18)); // NOI18N
        age_text.setText("Age");
        add(age_text);
        age_text.setBounds(20, 80, 140, 23);

        min_text.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        min_text.setText("10");
        add(min_text);
        min_text.setBounds(520, 20, 30, 36);

        label2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label2.setText(":");
        add(label2);
        label2.setBounds(550, 20, 11, 36);

        sec_text.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        sec_text.setText("59");
        add(sec_text);
        sec_text.setBounds(560, 20, 30, 36);

        setBounds(0, 0, 722, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void ans1_checkboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ans1_checkboxItemStateChanged
        // TODO add your handling code here:
        ans=1;
    }//GEN-LAST:event_ans1_checkboxItemStateChanged

    private void ans2_checkboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ans2_checkboxItemStateChanged
        // TODO add your handling code here:
        ans=2;
    }//GEN-LAST:event_ans2_checkboxItemStateChanged

    private void ans3_checkboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ans3_checkboxItemStateChanged
        // TODO add your handling code here:
        ans=3;
    }//GEN-LAST:event_ans3_checkboxItemStateChanged

    private void ans4_checkboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ans4_checkboxItemStateChanged
        // TODO add your handling code here:
        ans=4;
    }//GEN-LAST:event_ans4_checkboxItemStateChanged

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        displayQuestion();
        displayOption();
        PlayerDetails playerDetails=PlayerDetails.getPlayerDetails();
        name_text.setText(name_text.getText()+" : " + playerDetails.getName());
        age_text.setText(age_text.getText()+" : " + playerDetails.getAge());
        degree_text.setText(degree_text.getText()+" : " + playerDetails.getDegree());
        qualification_text.setText(qualification_text.getText()+" : " + playerDetails.getQualification());
        timerOperation();
        
    }//GEN-LAST:event_formWindowActivated

    private void next_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_buttonActionPerformed
        // TODO add your handling code here:
        ans1_checkbox.setState(false);
        ans2_checkbox.setState(false);
        ans3_checkbox.setState(false);
        ans4_checkbox.setState(false);
        
        if(Play.count<=9)
       {
         p.checkAnswer(ans);
         Play.update();
       }
       if(Play.count<=9)
       {
         displayQuestion();
         displayOption();
       }
       else if(Play.count==10)
       {
         dispose();
         SolutionDialog solutionDialog = new SolutionDialog(Design.this, true,p.score);
         solutionDialog.setVisible(true);
       }
    }//GEN-LAST:event_next_buttonActionPerformed

    public void displayQuestion()
    {
       question_label.setText(p.getQuestion());
    }
    
    public void displayOption()
    {
       String str[]=new String[4];
       str=p.getOption();
       ans1_checkbox.setLabel(str[0]);
       ans2_checkbox.setLabel(str[1]);
       ans3_checkbox.setLabel(str[2]);
       ans4_checkbox.setLabel(str[3]);
    }
    
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run()
            {
                new Design().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label age_text;
    private java.awt.Checkbox ans1_checkbox;
    private java.awt.Checkbox ans2_checkbox;
    private java.awt.Checkbox ans3_checkbox;
    private java.awt.Checkbox ans4_checkbox;
    private java.awt.Label degree_text;
    private java.awt.Label label2;
    private java.awt.Label min_text;
    private java.awt.Label name_text;
    private java.awt.Button next_button;
    private java.awt.Label qualification_text;
    private java.awt.Label question_label;
    private java.awt.Label sec_text;
    // End of variables declaration//GEN-END:variables
}
