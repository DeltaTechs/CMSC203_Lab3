import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	GradeBook g1, g2;
	@BeforeEach
	void setUp() throws Exception {
		g1=new GradeBook(5);
		g2=new GradeBook(5);
		
		g1.addScore(42.2);
		g1.addScore(69.1);
		
		g2.addScore(27.5);
		g2.addScore(95.5);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1=null;
		g2=null;
	}

	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals("42.2 69.1 "));
		assertTrue(g2.toString().equals("27.5 95.5 "));
	}

	@Test
	void testSum() {
		assertEquals(111.3, g1.sum(),.0001);
		assertEquals(123.0, g2.sum(),.0001);
	}

	@Test
	void testMinimum() {
		assertEquals(42.2, g1.minimum(),.001);
		assertEquals(27.5, g2.minimum(),.001);
	}

	@Test
	void testFinalScore() {
		assertEquals(69.1, g1.finalScore(),.001);
		assertEquals(95.5, g2.finalScore(),.001);
	}
}