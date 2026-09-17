package presentacion;

public class Main {


	    public static void main(String[] args) {
	        Store store = new Store();

	        Game game1 = new Game(1, "The Legend of Zelda", 59.99, Genre.ACTION);
	        Game game2 = new Game(2, "Super Mario Odyssey", 49.99, Genre.PLATFORM);
	        Game game3 = new Game(3, "Elden Ring", 69.99, Genre.RPG);

	        store.addGame(game1);
	        store.addGame(game2);
	        store.addGame(game3);

	        Customer customer1 = new Customer(1, "Juan Pérez", "juan@email.com");
	        Customer customer2 = new Customer(2, "María Gómez", "maria@email.com");

	        store.addCustomer(customer1);
	        store.addCustomer(customer2);

	        Game selectedGame = store.findGame(1);
	        if (selectedGame != null) {
	            int quantity = 2;
	            double totalPrice = selectedGame.getPrice() * quantity;
	            Purchase purchase1 = new Purchase(customer1.getName(), selectedGame, quantity, totalPrice);
	            store.addPurchase(purchase1);
	        }

	        System.out.println("=== JUEGOS EN LA TIENDA ===");
	        for (Game g : store.getGames()) {
	            System.out.println(g);
	        }

	        System.out.println("\n=== CLIENTES EN LA TIENDA ===");
	        for (Customer c : store.getCustomers()) {
	            System.out.println(c);
	        }

	        System.out.println("\n=== COMPRAS REALIZADAS ===");
	        for (Purchase p : store.getPurchases()) {
	            System.out.println(p);
	        }
	    }
	}
