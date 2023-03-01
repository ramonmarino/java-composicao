package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.OrdemItem;
import entities.Order;
import entities.Product;
import entities.enums.OrdemStatus;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm");

		System.out.println("Enter Cliente Data:  ");
		System.out.print("Name: ");
		String name = input.nextLine();
		System.out.print("Email: ");
		String email = input.nextLine();
		System.out.print("Bith date (DD/MM/YYYY): ");
		LocalDate data = LocalDate.parse(input.next(), fmt);

		System.out.println("Enter order data: ");
		System.out.println("Status: ");
		OrdemStatus status = OrdemStatus.valueOf(input.next().toUpperCase());
		Order order = new Order(LocalDateTime.now(), status, new Client(name, email, data));

		System.out.print("How many items is this order? ");
		int qtd = input.nextInt();
		for (int i = 1; i <= qtd; i++) {
			System.out.print("Enter" + i + " item data: ");
			System.out.print("Product Name: ");
			String nomeProduto = input.nextLine();
			System.out.print("Product Price:  ");
			double price = input.nextDouble();
			System.out.println("Quantity: ");
			int quantity = input.nextInt();
			order.addItem(new OrdemItem(quantity, new Product(name, price)));

		}
		
		System.out.println("Order Summary: ");
		System.out.println("Order Moment: " + fmt2.format(order.getMoment()));
		System.out.println("Order status" + order.getStatus());
		System.out.println("Client: " + order.getClient().getName() + order.getClient().getBithdate() + order.getClient().getEmail());
		System.out.println("Order item: ");
		
		
		
		input.close();

	}

}
