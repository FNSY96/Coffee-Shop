package coffeeShop;

public final class Milk extends Beverage {

	private Drink drink;

	public Milk(Drink drink) {
		this.drink = drink;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.drink.getPrice() + 5.5;
	}

}
