
public class Caracteres {
	public static void main(String[] args) {

		double valorCompra = 250.0;
		System.out.println("Valor de la compra: " + valorCompra);
		if (valorCompra >= 100 && valorCompra <= 199.99) {
			System.out.println("Descuento: 10%");
			valorCompra = 250.0 * 0.90;
		} else if (valorCompra >= 200.0 && valorCompra <= 299.99) {
			System.out.println("Descuento: 15%");
			valorCompra = 250.0 * 0.85;
		} else {
			System.out.println("Descuento: 20%");
			valorCompra = 250.0 * 0.80;
		}
		System.out.println("Valor final: " + valorCompra);
	}
}
