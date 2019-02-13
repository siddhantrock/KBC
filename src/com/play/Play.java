package com.play;

public class Play 
{
  public int score;
  String [] question=new String[10];
  int answer[]=new int[10];
  String [][] option=new String[10][4];
  public static int count;

  public Play()
  {
    question[0]="Q1). which one is data type";
    option[0][0]="static";
    option[0][1]="new";
    option[0][2]="class";
    option[0][3]="int";
    answer[0]=4;

    question[1]="Q2). which one is correct";
    option[1][0]="079";
    option[1][1]="0x10.0";
    option[1][2]="079.0";
    option[1][3]="_1_2_3_";
    answer[1]=3;

    question[2]="Q3). which one language is pure oop";
    option[2][0]="c";
    option[2][1]="java";
    option[2][2]="python";
    option[2][3]="vb";
    answer[2]=2;

    question[3]="Q4). which one modifier not applicable to main method";
    option[3][0]="abstract";
    option[3][1]="static";
    option[3][2]="strictfp";
    option[3][3]="final";
    answer[3]=1;

    question[4]="Q5). which one is not applicable modifier for top level class";
    option[4][0]="private";
    option[4][1]="public";
    option[4][2]="strictfp";
    option[4][3]="final";
    answer[4]=1;

    question[5]="Q6). which thing is needed to run java application";
    option[5][0]="jvm";
    option[5][1]="jdk";
    option[5][2]="jsl";
    option[5][3]="jre";
    answer[5]=4;

    question[6]="Q7). an interface , how many interface can extends";
    option[6][0]="0";
    option[6][1]="1";
    option[6][2]="2";
    option[6][3]="any number";
    answer[6]=4;

    question[7]="Q8). which one modifier is applicable for local variable";
    option[7][0]="final";
    option[7][1]="abstract";
    option[7][2]="volatile";
    option[7][3]="transient";
    answer[7]=1;

    question[8]="Q9). which one is valid";
    option[8][0]="int x=079";
    option[8][1]="int new";
    option[8][2]="float f=79.0";
    option[8][3]="int String";
    answer[8]=4;

    question[9]="Q10). what is the answer : 10<<32";
    option[9][0]="100";
    option[9][1]="32";
    option[9][2]="10";
    option[9][3]="error";
    answer[9]=3;

  }

  public String getQuestion()
  {
    return(question[count]);
  }

  public String[] getOption()
  {
    String str[]=new String[4];
    for(int i=0;i<4;i++)
    {
      str[i]=option[count][i];
    }
    return(str);
  }

  public void checkAnswer(int ans)
  {
    if(ans==answer[count])
       score+=4;
  }

  public static void update()
  {
    count++;
  }
}
