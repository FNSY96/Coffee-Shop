package coffeeShop;

public class TurkishEspresso extends Espresso{
	
	private final String DESCRIPTION = "Turkish Espresso";
	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

	@Override
	public String getIngredients() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getPrice() {
		return 13.44;
	}

}
