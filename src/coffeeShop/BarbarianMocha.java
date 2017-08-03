package coffeeShop;

public class BarbarianMocha extends Mocha {
	private final String DESCRIPTION = "Mocha with Barbarian flavor";

	@Override
	public String getDescription() {

		return DESCRIPTION;
	}

	@Override
	public String getIngredients() {

		return null;
	}

	@Override
	public double getPrice() {

		return 18.25;
	}

}
