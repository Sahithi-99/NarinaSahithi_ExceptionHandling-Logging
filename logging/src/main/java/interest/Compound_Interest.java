package interest;

public class Compound_Interest {
	int principle_amount;
    double rate_of_interest;
    int no_of_times_interest_applied;
    int time_periods_elapsed;
    public Compound_Interest(int principle_amount,double rate_of_interest,int no_of_interest_applied,int time_periods_elapsed)
    {
   	 this.principle_amount=principle_amount;
   	 this.rate_of_interest=rate_of_interest;
   	 this.no_of_times_interest_applied=no_of_interest_applied;
   	 this.time_periods_elapsed=time_periods_elapsed;
    }
    public double compound_interest_calculation()
    {
   	 double x=rate_of_interest/no_of_times_interest_applied;
   	 x=x+1;
   	 double y=no_of_times_interest_applied*time_periods_elapsed;
   	 double z=(principle_amount)*(Math.pow(x, y));
   	 return z;
   	 
    }
}
