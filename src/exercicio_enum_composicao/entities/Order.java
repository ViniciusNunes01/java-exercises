package exercicio_enum_composicao.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import exercicio_enum_composicao.entities.enums.OrderStatus;

public class Order {

	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm");

	private LocalDateTime moment;
	private OrderStatus status;

	private Client cliente;
	private List<OrderItem> items = new ArrayList<OrderItem>();

	public Order() {

	}

	public Order(LocalDateTime moment, OrderStatus status, Client cliente) {
		this.moment = moment;
		this.status = status;
		this.cliente = cliente;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getCliente() {
		return cliente;
	}

	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}

	public void addItem(OrderItem item) {
		this.items.add(item);
	}

	public void removeItem(OrderItem item) {
		this.items.remove(item);
	}

	public Double total() {
		double sumTotal = 0.0;
		for (OrderItem item : items) {
			sumTotal += item.subTotal();
		}
		return sumTotal;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(formatter.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(cliente + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}
