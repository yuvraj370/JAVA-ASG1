/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test2;

import java.util.Scanner;

/**
 *
 * @author Yuvraj
 */
public class Test2 {

    
    public static void main(String[] args) {
        String s1="this is a demo of java string rtrn";  
        String w=" ";
 
int i,l,v=0,j,r;
char ch,ch1;
s1=s1+" ";   //this is use so last word can be print
  l=s1.length();
    for(i=0;i<l;i++)
    {
       ch=s1.charAt(i);
       if(ch!=' ')  //creat waord is benn created
       {
            w=w+ch;
       }
       else
       {
           j=w.length();

           for(r=0;r<j;r++)
           {
           ch1=w.charAt(r);
         if(ch1=='a' || ch1=='e' || ch1=='i'|| ch1=='o' || ch1=='u') //compare
           v++;
           }
           System.out.println(w+">"+v);   
           w=" "; //after word is been print it goes back to null 
           v=0;   //
       }
    } 
}
    }


