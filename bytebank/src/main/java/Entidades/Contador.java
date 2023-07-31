/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author derek
 */
public class Contador extends Funcionario{
    @Override
	public double getBonificacion() {
		System.out.println("Llamando metodo del Contador");
		return super.getBonificacion();
	}
}
