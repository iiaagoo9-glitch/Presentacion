package presentacion;

public class Purchase {

  	private Game Game;
	private int quantity;
	private double totalprice;
	
	
	public Purchase (String customer, Game Game, int quantity, double totalprice) {
		
		this.customer=customer;
		this.Game=Game;
		this.quantity=quantity;
		this.totalprice = totalprice;
				
		
	}



		
		
		
	
	@Override
	public String toString() {
		return "Purchase [customer=" + customer + ", Game=" + Game + ", quantity=" + quantity + ", totalprice="
				+ totalprice + "]";
	}

}
