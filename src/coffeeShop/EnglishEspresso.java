package coffeeShop;

public class EnglishEspresso extends Espresso {
	private final String DESCRIPTION = "English Espresso";

	public EnglishEspresso() {
		// TODO Auto-generated constructor stub
	}

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
		return 19.99;
	}

}
