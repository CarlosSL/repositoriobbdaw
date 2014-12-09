package modelo1;

public class Principal {

	public static void main(String[] args) {
		Cuenta cuentaFernando=new Cuenta("Fernando Ortiz",1,2000F);
		Cuenta cuentaJesus=new Cuenta("Jesus",2,200F);
		cuentaFernando.reintegro(100F);
		System.out.println("Su saldo Sr. Ortiz: "+cuentaFernando.getSaldo());
		cuentaFernando.transferencia(cuentaJesus, 200F);
		System.out.println("Su saldo Sr. Ortiz: "+cuentaFernando.getSaldo());
		System.out.println("Su saldo Sr. Jesus: "+cuentaJesus.getSaldo());


	}

}
