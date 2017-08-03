package coffeeShop;

public class MilkTea extends Tea{

	private final String DESCRIPTION = "Tea with milk";

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

		return 18.5;
	}

}
