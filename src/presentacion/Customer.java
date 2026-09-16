package presentacion;

public class Customer {
	
	private int id;
	private String name;
	private double balance; 
	
	public Customer (int id, String name, double balance ) {
		
		this.id=id;
		this.name=name;
		this.balance=balance;
				
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
	
	public void AñadirSaldo (double balance) {
		
		this.balance = this.balance + balance;
			
	}
	
	public void RetirarSaldo (double balance) {
		
		this.balance= this.balance - balance;
		
		if (balance<=0) {
			
			System.out.println("Error, el saldo no puede ser negativo. ");
		}
		
	}
	
	public boolean consulta (double balance, Game Game) {
		
		if (this.balance>= Game.getPrecio() && Game.getStock()>0) {
			
			return true;
			
		} else {
			return false;
		}

	}
	
	
	
	
	
	

}
