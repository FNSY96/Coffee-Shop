package coffeeShop;

public class OrdinaryTea extends Tea {

	private final String DESCRIPTION = "Pure Tea";

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

		return 6;
	}

}
