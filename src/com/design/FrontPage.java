package com.design;

public class FrontPage extends java.awt.Frame 
{   
    public FrontPage() 
    {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        play_button = new java.awt.Button();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(null);

        play_button.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        play_button.setLabel("Play");
        play_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_buttonActionPerformed(evt);
            }
        });
        add(play_button);
        play_button.setBounds(160, 140, 100, 40);

        setBounds(0, 0, 482, 394);
    }// </editor-fold>//GEN-END:initComponents

    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void play_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_buttonActionPerformed
        // TODO add your handling code here:
        PlayerInfo playerinfo=new PlayerInfo(FrontPage.this, true);
        playerinfo.setFrontPage(this);
        playerinfo.setVisible(true);
    }//GEN-LAST:event_play_buttonActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run()
            {
                new FrontPage().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button play_button;
    // End of variables declaration//GEN-END:variables
}
