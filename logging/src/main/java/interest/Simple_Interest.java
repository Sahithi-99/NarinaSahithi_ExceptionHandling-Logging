package interest;

public class Simple_Interest {
	int Principle_amount;
	double Rate_of_interest;
	int elapsed_in_time;
	//ROI-Rate Of Interest
	public Simple_Interest(int Principle_amount,double Rate_of_interest,int elapsed_in_time )
	{
		this.Principle_amount=Principle_amount;
		this.Rate_of_interest=Rate_of_interest;
		this.elapsed_in_time=elapsed_in_time;
	}
	public double Simple_Interest_Calculation()
	{
		return ((Principle_amount*Rate_of_interest*elapsed_in_time)/100);
	}
}
