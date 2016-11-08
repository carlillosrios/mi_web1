/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoregresionlineal;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mdominguez
 */
public class Parametros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        List <Double> arregloX = new ArrayList<>();
        List <Double> arregloY = new ArrayList<>();
        List <Double> arregloX2 = new ArrayList<>();
        List <Double> arregloY2 = new ArrayList<>();
        List <Double> Multiplicarxy = new ArrayList<>();
        double x2=0,y2=0;
        double Multixy=0;
        double Sumx=0,Promx=0,Sumcuadradox=0;
        double Sumy=0,Promy=0,Sumcuadradoy=0;
        double Summultixy=0,Dividendo=0,Divisor=0,B1=0,B0=0,Rxy=0,R2=0,Yk=0;
        DecimalFormat formateador = new DecimalFormat("######.####");
          
          for (int i=0;i<=9;i++)
          {    
           System.out.println("Valor para columna X: ");
           double x = Double.parseDouble(in.nextLine());
           arregloX.add(x);
           Sumx=Sumx+x;          
           x2 = x*x;
           arregloX2.add(x2);
          }
           
            System.out.println("Columna X: "+arregloX);
           
          Promx=Sumx/10;         
          
          for (int i=0;i<=9;i++)
          {
           System.out.println("Valor para columna Y: ");
           double y = Double.parseDouble(in.nextLine());          
           arregloY.add(y);
           Sumy=Sumy+y;
           y2 = y*y;
           arregloY2.add(y2);
           }
          System.out.println("Columna Y: "+arregloY);
          
          Promy=Sumy/10;
         
          for (int i=0;i<=9;i++)
          {
              Multixy=arregloX.get(i)*arregloY.get(i);
              Multiplicarxy.add(Multixy);
              Sumcuadradox=Sumcuadradox+arregloX2.get(i);
              Sumcuadradoy=Sumcuadradoy+arregloY2.get(i);
              Summultixy=Summultixy+Multiplicarxy.get(i);
          }
          
          B1=(Summultixy-(10*Promx*Promy))/(Sumcuadradox-(10*Math.pow(Promx, 2)));
          Dividendo=((10*Summultixy)-(Sumx*Sumy));
          Divisor= Math.sqrt(((10*Sumcuadradox)-(Math.pow(Sumx,2)))*((10*Sumcuadradoy)-(Math.pow(Sumy, 2))));
          Rxy=Dividendo/Divisor;
          R2=Math.pow(Rxy,2);
          B0=(Promy-(B1*Promx));
          Yk=B0+B1*386;
          String ResultYk = formateador.format(Yk);
          String ResultB0 = formateador.format(B0);
          String ResultB1 = formateador.format(B1);
          String ResultRxy = formateador.format(Rxy);
          String ResultR2 = formateador.format(R2);
          System.out.println("El valor de la Multiplicacion de X por Y: "+ResultRxy);
          System.out.println("El valor de la Multiplicacion de R al cuadrado: "+ResultR2);
          System.out.println("El Valor de B1 es: "+ResultB1);
          System.out.println("El valor de B0 es: "+ResultB0);
          System.out.println("El valor de Ryk como resultado FINAL es: "+ResultYk);
                  
        //Agustin sanchez macias
        //Luis Manuel Nájera García
        //Miguel Angel Quiroz Jiménez
        //Juan Carlos Rios Vargas
        
    }
    
}
