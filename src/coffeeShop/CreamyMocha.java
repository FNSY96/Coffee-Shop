package coffeeShop;

public class CreamyMocha extends Mocha{
	private final String DESCRIPTION = "Mocha with Cream";

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

		return 23.90;
	}
}
