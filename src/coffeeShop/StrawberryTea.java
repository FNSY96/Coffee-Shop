package coffeeShop;

public class StrawberryTea extends Tea {

	private final String DESCRIPTION = "Tea with strawberry flavour";

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

		return 12;
	}

}
