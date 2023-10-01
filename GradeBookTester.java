import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	GradeBook g1;
	GradeBook g2;

	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g1.addScore(60.0);
		g1.addScore(90.0);
		g1.addScore(70.0);
		g1.addScore(30.0);
		g1.addScore(45.0);
		g2 = new GradeBook(5);
		g2.addScore(70.0);
		g2.addScore(50.0);
		g2.addScore(75.0);
		g2.addScore(80.0);
		g2.addScore(95.0);
	}
	
	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;	
	}
	
	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals("60.0 90.0 70.0 30.0 45.0 "));
		assertTrue(g2.toString().equals("70.0 50.0 75.0 80.0 95.0 "));
	}
	
	@Test
	void testSum() {
		assertEquals(295.0, g1.sum(), .0001);
		assertEquals(370.0, g2.sum(), .0001);

	}
	
	@Test
	void testMinimum() {
		assertEquals(30.0, g1.minimum(), .001); 
		assertEquals(50.0, g2.minimum(), .001); 
	}

	@Test
	void testFinalScore() {
		assertEquals(265.0 , g1.finalScore());
		assertEquals(320.0 , g2.finalScore());
	}
}
