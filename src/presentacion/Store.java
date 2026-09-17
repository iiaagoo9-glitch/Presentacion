package presentacion;


	import java.util.ArrayList;

	public class Store {

	    private ArrayList<Game> games;
	    private ArrayList<Customer> customers;
	    private ArrayList<Purchase> purchases;

	    public Store() {
	        games = new ArrayList<Game>();
	        customers = new ArrayList<Customer>();
	        purchases = new ArrayList<Purchase>();
	    }

	   
	    public void addGame(Game Game) {

	        boolean existe = false;

	        for (Game g : games) {
	            if (g.getId() == Game.getId()) {
	                existe = true;
	            }
	        }

	        if (!existe) {
	            games.add(Game);
	        }
	    }

	   
	    public Game findGame(int id) {

	        for (Game Game : games) {
	            if (Game.getId() == id) {
	                return Game;
	            }
	        }

	        return null;
	    }

	   
	    public ArrayList<Game> getGames() {
	        return games;
	    }

	   
	    public void addCustomer(Customer customer) {
	        customers.add(customer);
	    }

	  
	    public ArrayList<Customer> getCustomers() {
	        return customers;
	    }

	 
	    public void addPurchase(Purchase purchase) {
	        purchases.add(purchase);
	    }

	  
	    public ArrayList<Purchase> getPurchases() {
	        return purchases;
	    }
	}
