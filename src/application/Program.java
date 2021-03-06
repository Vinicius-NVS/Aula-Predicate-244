package application;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import entities.Product;

public class Program {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("HD case", 80.90));

        double min = 100.0;
        
        list.removeIf(p -> p.getPrice() >= min);

        for(Product p : list) {
		System.out.println(p);
        }
	}
}