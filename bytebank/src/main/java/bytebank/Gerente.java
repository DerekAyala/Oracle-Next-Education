package bytebank;

public class Gerente extends Funcionario {

    private String clave;

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public double getBonificacion() {
        System.out.println("Llamando metodo del Gerente");
        return this.getSalario() + (this.getSalario() * 0.05);
    }

    public boolean iniciarSesion(String clave) {
        return this.clave == null ? clave == null : this.clave.equals(clave);
    }
}
