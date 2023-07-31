/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sueldos;

import Entidades.Vendedor;
import Servicios.VendedorServicio;

/**
 *
 * @author derek
 */
public class Sueldos {

    public static void main(String[] args) {
        VendedorServicio vs = new VendedorServicio();
        Vendedor v1 = vs.altaVendedor();
        vs.sueldoMensual(v1);
        vs.vacaciones(v1);
    }
}
