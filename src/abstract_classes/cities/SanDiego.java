package abstract_classes.cities;

public class SanDiego extends City{

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}
		
	@Override
	double getAnnualTaxes() {
	
		// TODO Auto-generated method stub
		return (growthRate*population) + 1000000;
	}

}
