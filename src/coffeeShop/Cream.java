package coffeeShop;

public final class Cream extends Beverage {

	private Drink drink;

	public Cream(Drink drink) {
		this.drink = drink;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.drink.getPrice() + 9.25;
	}

}
