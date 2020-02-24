package house_construction;

public class Construction_cost {
	double area_of_the_house;
    String material_to_be_used;
    boolean fully_automated;
    public double cost_estimation(double area,String material,boolean automated)
    {
    	double cost=0;
    	if(material=="standard")
    	{
    		cost=(1200*(area));
    	}
    	else if(material=="above standard")
    	{
    		cost=(1500*(area));
    	}
    	else if(material=="high standard")
    	{
    		if(automated)
    			cost=(2500*(area));
    		else
    			cost=(1800*(area));
    	}
    	return cost;
    }

}
