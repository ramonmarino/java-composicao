package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrdemStatus;

public class Order {

	private LocalDateTime moment;
	private OrdemStatus status;
	private Client client; // relacão cliente e produto 
	private List<OrdemItem> sumario = new ArrayList<>();

	public Order(LocalDateTime moment, OrdemStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	

	public  LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment( LocalDateTime moment) {
		this.moment = moment;
	}

	public OrdemStatus getStatus() {
		return status;
	}

	public void setStatus(OrdemStatus status) {
		this.status = status;
	}
	
	public Client getClient() {
		return client;
	}

	// operacao

	public void addItem(OrdemItem item) {
		sumario.add(item);
	
	}
	
	public void removeItem(OrdemItem item) {
		sumario.remove(item);
	}
	
	public double total() {
		double totalOrder = 0.0;
		for(OrdemItem item: sumario ) {
			totalOrder += item.subTotal();
		}
		return totalOrder;
	} 
		
}
