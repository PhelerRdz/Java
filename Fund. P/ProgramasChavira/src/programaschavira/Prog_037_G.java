/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_037_g;
import java.util.Scanner;
/**
 *
 * @author MCJAVIER
 */
public class Prog_037_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner ps=new Scanner (System.in);
int mes, dia, dias=0,hecho;
        System.out.println("Ingrese mes : ");
        mes=ps.nextInt();
        System.out.println("Ingrese dia : ");
        dia=ps.nextInt();
               

		if (mes==1) {
				dias = dia;
			
		} else {
			if (mes==2) {
					dias = 31+dia;
				
			} else {
				if (mes==3) {
						dias = 59+dia;
					
				} else {
					if (mes==4) {
							dias = 90+dia;
						
					} else {
						if (mes==5) {
								dias = 120+dia;
							
						} else {
							if (mes==6) {
									dias = 151+dia;
								
							} else {
								if (mes==7) {
										dias = 181+dia;
									
								} else {
									if (mes==8) {
											dias = 212+dia;
										
									} else {
										if (mes==9) {
												dias = 243+dia;
											
										} else {
											if (mes==10) {
													dias = 273+dia;
												
											} else {
												if (mes==11) {
														dias = 304+dia;
													
												} else {
													if (mes==12) {
															dias = 334+dia;
														
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if ((dias-1)%7==0) {
			System.out.println("Lunes");
		} else {
			if ((dias-2)%7==0) {
				System.out.println("Martes");
			} else {
				if ((dias-3)%7==0) {
					System.out.println("Miercoles");
				} else {
					if ((dias-4)%7==0) {
						System.out.println("Jueves");
					} else {
						if ((dias-5)%7==0) {
							System.out.println("Viernes");
						} else {
							if ((dias-6)%7==0) {
								System.out.println("Sabado");
							} else {
								if ((dias-7)%7==0) {
									System.out.println("Domingo");
								}
							}
						}
					}
				}
			}
		}





            }
     
         
    }
    

