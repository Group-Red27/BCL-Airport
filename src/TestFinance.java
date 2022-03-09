import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFinance {
	
	@Test
	void testCalCompensation() {
		
		Finance testFinance = new Finance(null);
		double output = testFinance.calCompensation(300);
		
		assertEquals(300.00, output);		
		
	}
	

//	@Test
//	void testCalBagCost() {
//		
//		Finance TestFinance = new Finance(null);
//		double output = TestFinance.calBagCost(-5);
//		
//		assertEquals(00000000, output);
//	}

}
