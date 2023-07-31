/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author derek
 */
public class VendedorServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Vendedor altaVendedor() {
        //Instanciar un objeto de tipo vendedor
        Vendedor v = new Vendedor();
        //Llenado de los atributos
        System.out.println("Ingresa el nombre del vendedor");
        v.setNombre(leer.next());
        System.out.println("Ingresa el DNI del vendedor");
        v.setDni(leer.nextInt());
        System.out.println("Ingresa el Sueldo basico del vendedor");
        v.setSueldoBasico(leer.nextDouble());
        System.out.println("Ingrese el dia que comenzo a trabajar");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes que comenzo a trabajar");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año que comenzo a trabajar");
        int ano = leer.nextInt();
        Date fecha = new Date(ano - 1900, mes - 1, dia);
        v.setFechaInicio(fecha);
        System.out.println(v);
        return v;
    }

    public void sueldoMensual(Vendedor v) {
        System.out.println("Ingrese Cuales fueron las ventas totales del vendedor");
        double ventas = leer.nextDouble();
        v.setComisiones(ventas * 0.15);
        v.setSueldoMensual(v.getSueldoBasico() + v.getComisiones());
        System.out.println("El sueldo mensual del vendedor: " + v.getNombre()+ " es de $" + v.getSueldoMensual());
    }
    
    public void vacaciones(Vendedor v){
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - v.getFechaInicio().getYear();
        
        if (antiguedad < 5) {
            System.out.println("Le corresponden 14 dias de vacaciones");
        } else if(antiguedad < 10){
            System.out.println("Le corresponden 21 dias de vacaciones");
        } else if(antiguedad < 20){
            System.out.println("Le corresponden 28 dias de vacaciones");
        } else if(antiguedad > 20){
            System.out.println("Le corresponden 35 dias de vacaciones");
        } else {
            System.out.println("El empleado tiene vacaciones proporcionales");
        }
    }
}
