package com.constraints;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Label;
import java.awt.TextField;
import java.util.ArrayList;

public class Constraint
{
   Component [] component;
   Container frame;
   ArrayList check=new ArrayList();
   int count;

   public Constraint(Container frame) 
   {
       this.frame = frame;
   }
   
   public void display()
   {
       for(Component c : component)
       {
           System.out.print(c.getName() + "   ");
           System.out.println(c instanceof Label );
       }
   }
   
   public boolean setConstraint()
   {
       component=frame.getComponents();
       
       for(Component c : component)
       {
         if(c instanceof TextField)
         {
             String str= ((TextField) c).getText();
             str=str.trim();
             if (str.equals("*"))
              {
                 c.setBackground(Color.red);
                 check.add(count, false);
                 count++;
              }
              else
              {
                  str=str.toUpperCase();
                  ((TextField) c).setText(str);
                  c.setBackground(Color.WHITE);
                  c.setForeground(Color.BLACK);
                  check.add(count, true);
                  count++;
              }
         }
         else if(c instanceof Choice)
         {
             if(((Choice) c).getSelectedIndex()== -1)
             {
                 c.setBackground(Color.red);
                 check.add(count, false);
                 count++;
             }
             else
             {
                 c.setBackground(Color.WHITE);
                 c.setForeground(Color.BLACK);
                 check.add(count, true);
                 count++;
             }
         }
       }
       
       for(int i=0;i<check.size();i++)
       {
           if((boolean)check.get(i) == false)
           {
               return false;
           }
       }
       
       return true;
   }
   
}
