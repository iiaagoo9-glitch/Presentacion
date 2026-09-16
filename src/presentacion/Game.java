package presentacion;

import java.util.*;

public class Game {
	
	private int id;
	private String title;
	private Genre Genre;
	private double precio;
	private int stock;
	
	public void Juego (int id, String title, Genre Genre, double precio, int stock) {
		
		this.id=id++;
		this.title=title;
		this.Genre=Genre;
		this.precio=precio;
		this.stock=stock;
			
	}

	public int getId() {
		
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Genre getGenre() {
		return Genre;
	}

	public double getPrecio() {
		return precio;
	}

	public int getStock() {
		return stock;
	}
	
	public void setStock (int stock) {
		
		this.stock = stock;	
		
		if (this.stock<0) {
			System.out.println("El stock no puede ser negativo.");
			
		}
	}
	
	public void AumentarStock (int stock) {
		
		this.stock = this.stock + stock;
	
	}
	
	public void ReducirStock (int stock) {
		
		this.stock = this.stock - stock;
		
		if (this.stock<0) {
			
			System.out.println("El stock no puede ser negativo.");
		}
	}
	
	public void haystock (int stock) {
		
		if(stock>0) {
			 System.out.println("Si que hay un stock de "+ stock + " para ese juego");
		} else {
		System.out.println("No hay stock para este juego");
		}

	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", title=" + title + ", Genre=" + Genre + ", precio=" + precio + ", stock=" + stock
				+ "]";
	}
	
	
	
	
	
	
	
	

}
