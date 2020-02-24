package com.epam1.logging;
import interest.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import house_construction.*;

public class App 
{ 
	private static final Logger LOGGER =LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
       Compound_Interest obj1=new Compound_Interest(5000, 0.10, 1, 3);
       LOGGER.info("THE COMPOUND INTEREST IS:"+obj1.compound_interest_calculation());
       Simple_Interest obj2=new Simple_Interest(4000, 4.5, 3);
       LOGGER.debug("THE SIMPLE INTEREST IS:"+obj2.Simple_Interest_Calculation());
       Construction_cost obj3=new Construction_cost();
       LOGGER.warn("THE COST OF HOUSE CONSTRUCTION IS:"+obj3.cost_estimation(56, "high standard", true));
       LOGGER.error("THE HOUSE ASKED FOR IS AUTOMATED");
    }
}
