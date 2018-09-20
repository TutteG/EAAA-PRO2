package opgave3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Models a Customer with Orders.
 */
public class Customer {
	private String name;
	private LocalDate birthday;
	private Discount discount;
	private List<Order> orders = new ArrayList<Order>();

	/**
	 * Create a new Customer.
	 *
	 * @param name
	 *            the name.
	 * @param birthday
	 *            birthday of the customer.
	 */
	public Customer(String name, LocalDate birthday) {
		this.name = name;
		this.birthday = birthday;
	}

	public double getDiscountedPrice(Order order) {
		return discount.getDiscountedPrice(order.getOrderPrice());
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return this.birthday;
	}

	public List<Order> getOrders() {
		return new ArrayList<Order>(orders);
	}

	public void addOrder(Order order) {
		orders.add(order);
	}

	public void removeOrder(Order order) {
		orders.remove(order);
	}

}
