package ExercicioUm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<Product> lista = new ArrayList<>();
		lista.add(new Product("IPHONE 14", 10000.00));
		lista.add(new Product("IPHONE 13", 7500.00));
		lista.add(new Product("IPHONE 12", 4400.00));
		lista.add(new Product("IPHONE 11", 3200.00));

		Comparator<Product> mycomp = new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {

				return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
			}

		};

		lista.sort((x1, x2) -> x1.getName().toUpperCase().compareTo(x2.getName().toUpperCase()));
		lista.stream().forEach(System.out::println);
        System.out.printf("\n ####### ===== ####### ======= ####### \n\n");
		lista.add(new Product("NOTEBOOK I7", 8000.00));
		lista.add(new Product("NOTEBOOK I5", 4500.00));
		lista.add(new Product("NOTEBOOK I3", 2500.00));
		lista.sort(mycomp);

		lista.stream().forEach(System.out::println);
	}
}
