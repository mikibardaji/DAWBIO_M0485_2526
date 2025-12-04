/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

import java.util.Random;

/**
 *
 * @author mabardaji
 */
public class Rectangle 
{
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    public static int MIN=0;
    public static int MAX=100;

    public Rectangle(int x1, int y1, int x2, int y2)
    {
        if (x2>x1 && y2 > y1 &&
            x1>MIN && y1>MIN &&
            x2<=MAX && y2<=MAX)
        {
            this.x1=x1;
            this.y1=y1;
            this.x2=x2;
            this.y2=y2;
        }
        else
        {
            System.err.println("El vertice superior no puede ser menor que el inferior "
             +x1+","+ y1+ "- " +  x2+","+ y2);
        }
        
    }

    public int getx1()
    {
        return x1;
    }

    public int gety1()
    {
        return y1;
    } 

    public int getx2()
    {
        return x2;
    }

    public int gety2()
    {
        return y2;
    }

    public void setx1(int x1)
    {
        //x2>x1
        if (x1<this.x2
              &&  x1>MIN)
        {
            this.x1=x1;
        }
        else
        {
            System.err.println("X1 nueva no puede superar " + this.x2);
        }
        
    }

    public void setX1Y1(int x1, int y1)
    {
        if (x1<this.x2 && y1 < this.y2)
        {
            this.x1 = x1;
            this.y1 = y1;
        }
        else
        {
            System.err.println("X1 nueva no puede superar " + this.x2 + " " + this.y2);
        }
    }
    
    public void setX2Y2(int x2, int y2)
    {
        if (x2<this.x1 && y2 < this.y1)
        {
            this.x2 = x2;
            this.y2 = y2;
        }
        else
        {
            System.err.println("X1 nueva no puede superar " + this.x1 + " " + this.y1);
        }
    } 
   
    public void sety1(int y1)
    {
        if (y1<this.y2)
        {
            this.y1=y1;
        }
        else
        {
            System.err.println("y1 nueva no puede superar " + this.y2);
        }
    }

    public void setx2(int x2)
    {
        //falta validaci´n
        this.x2=x2;
    }

    public void sety2(int y2)
    {
        //falta validaci´n
        this.y2=y2;
    }

    public int getBase()
    {
        return (x2-x1);
    }
    
    public int getAltura()
    {
        return (y2-y1);
    }
    
    
    public int getPerimetro()
    {
        int suma= 2*(this.getBase()+this.getAltura()); //2*base + 2 altura
        return suma;
    }
    
    public int getArea()
    {
        //base por alutra
        int area = this.getBase() * this.getAltura();
        
        return area; 
        
    }
    /*En el main de la clase principal instancia 2 objetos Rectangulo en (0,0)(5,5) y (7,9)(2,3). 
    Muestra por pantalla sus coordenadas, perímetros (suma de lados) y áreas (ancho x alto). 
    Modifica todas las coordenadas como consideres y vuelve a imprimir coordenadas, 
    perímetros y áreas. */
    public void imprimir()
    {
        System.out.println("Coordenadas: (" + x1 + "," + y1 + ") (" + x2 + "," + y2 + ")");
        //System.out.println("Perímetro: " + suma);
    }
    
    
    public static Rectangle rectanguloAleatorio()
    {
        Random rd = new Random();
        int x1 = rd.nextInt(MIN, MAX+1);
        int y1 = rd.nextInt(MIN, MAX+1);
        int x2, y2;
        do
        {
            x2 = rd.nextInt(MIN, MAX+1);
            y2 = rd.nextInt(MIN, MAX+1);
        }while (x2<x1 || y2 <y1);
        
        
        Rectangle rect = new Rectangle(x1,y1,x2,y2);
        return rect;
    }
}
