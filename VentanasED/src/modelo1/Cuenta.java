package modelo1;

public class Cuenta {
	private String titular;
	private long ncta;
	private float saldo;
	public Cuenta(String titular,long ncta){
		this.titular=titular;
		this.ncta=ncta;
		this.saldo=0.0F;
	}
	public Cuenta(String titular,long ncta,float saldo){
		this.titular=titular;
		this.ncta=ncta;
		this.saldo=saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public long getNcta() {
		return ncta;
	}
	public void setNcta(long ncta) {
		this.ncta = ncta;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public void ingreso(float cantidad){
		saldo+= cantidad;
	}
	public void reintegro(float cantidad){
		if (saldo>=cantidad)
		saldo-= cantidad;
		else 
			System.out.println("No hat saldo suficiente");
	}
	public void transferencia(Cuenta acreedora,float cantidad){
		if (saldo>=cantidad){
			saldo-= cantidad;
			acreedora.ingreso(cantidad);
	
	}else 
				System.out.println("No hat saldo suficiente");
	}
}
