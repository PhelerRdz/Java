/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_025_g;


import java.util.Scanner;

/**
 *
 * @author MCJAVIER
 */
public class Prog_025_G {
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int a,b,c,d;
Scanner ps=new Scanner (System.in);

        System.out.println("Ingresa 4 numeros");
        System.out.println("Primer numero");
        a=ps.nextInt();
        System.out.println("Segundo numero");
        b=ps.nextInt();
        System.out.println("Tercer numero");
        c=ps.nextInt();
        System.out.println("Cuarto numero");
        d=ps.nextInt();
        
        
        
        
        
            if (a>b){
            if(b>c){
                if (c>d){System.out.println(a+","+b+","+c+","+d);
                }else {
                    if (d>a){
                        System.out.println(d+","+a+","+b+","+c);
                    }else {
                        if (b>d){
                            System.out.println(a+","+b+","+d+","+c);
                        }else {
                            System.out.println(a+","+d+","+b+","+c);}
                    }
                }
              }else {
                
                if (c>a){
                    if (d>c){
                        System.out.println(d+","+c+","+a+","+b);
                    }else {
                        if (d>a){
                            System.out.println(c+","+d+","+a+","+b);
                        } else {
                            if (d>b){
                                System.out.println(c+","+a+","+d+","+b);    
                            }else {
                                System.out.println(c+","+a+","+b+","+d);
                            }
                        }
                    }
                    
                }else {
                    if (b>d){
                        System.out.println(a+","+c+","+b+","+d);
                    }else {if (d>a){
                        System.out.println(d+","+a+","+c+","+b);
                    } else { if (c>d){
                        System.out.println(a+","+c+","+d+","+b);
                      }else {
                        
                        System.out.println(a+","+d+","+c+","+b);
                      }
                    }
                            }
                  }
                
                
              }
                
            }else {
                if (c>b){
                if(d>b){
                    if (d>c){
                        System.out.println(d+","+c+","+b+","+a);
                      }else {
                        System.out.println(c+","+d+","+b+","+a);
                    }
                    
                  }else {
                    if (a>d){
                        System.out.println(c+","+b+","+a+","+d);
                    }else {
                        System.out.println(c+","+b+","+d+","+a);
                    }
                  }
                
                }else {
                   if (d>b){
                      if (c>a){
                          System.out.println(d+","+b+","+c+","+a);
                     }else{
                          System.out.println(d+","+b+","+a+","+c);
                      }
                     
                  } else {
                       if (d>c){
                           if (c>a){
                               System.out.println(b+","+d+","+c+","+a);
                           }else {
                               System.out.println(b+","+d+","+a+","+c);
                          }
                       }else {
                           if (d>a){
                               System.out.println(b+","+c+","+d+","+a);
                           }else { 
                               System.out.println(b+","+c+","+a+""+d);
                           }
                       }
                   }
                    
                }
              
            }
        

    }
    
}
