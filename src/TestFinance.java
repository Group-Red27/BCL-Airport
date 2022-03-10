import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFinance {
	
	@Test
	void testDeclarePriceRating() {
		Finance testFinance = new Finance(null);
		Flightclass flightclass = new Flightclass();
		double output = testFinance.declarePriceRating("7A", flightclass );
		assertEquals(1.0,output);
	}
	
	
	
//	@Test
//	void testCalTicketCostReturn() {
//		Finance testFinance = new Finance(null);
//		double output = testFinance.calTicketCostReturn("1A", "ST4138", "HND", "SYD");
//		assertEquals(17531.775, output);
//	}
	
	
//	@Test
//	void testCalTicketCostDeparture() {
//		
//		Finance testFinance = new Finance(null);
//		double output = testFinance.calTicketCostDeparture("11A","TS4977","HND","SYD");
//		assertEquals(3510.52,output);
//	}
	
	
//	@Test
//	void testCalCompensation() {
//		
//		Finance testFinance = new Finance(null);
//		double output = testFinance.calCompensation(300);
//		
//		assertEquals(300.00, output);		
//		
//	}
	

//	@Test
//	void testCalBagCost() {
//		
//		Finance TestFinance = new Finance(null);
//		double output = TestFinance.calBagCost(-5);
//		
//		assertEquals(00000000, output);
//	}

	
}
