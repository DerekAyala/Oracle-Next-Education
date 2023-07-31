/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author derek
 */
public class Gerente extends Funcionario {

    private String clave;

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public boolean iniciarSesion(String clave) {
        return this.clave.equals(clave);
    }

    @Override
    public double getBonificacion() {
        return super.getSalario() + super.getBonificacion();
    }

    @Override
    public String toString() {
        return super.toString() + ", {clave=" + clave+"}";
    }

}
