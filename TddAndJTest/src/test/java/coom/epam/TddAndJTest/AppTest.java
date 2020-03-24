package coom.epam.TddAndJTest;

import static org.junit.jupiter.api.Assertions. *;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

class DeleteAat2PosTest {

	/*  TODO list for my feature
	 *  1. A at 1st position  : ABCD => BCD
	 *  2. A at first 2 positions :  AACD => CD 
	 *  3. A at 2nd position : BACD => BCD
	 *  4. string contains only A's : AAAA => AA
	 *  5. A is not at 1st 2 positions: BBAA => BBAA
	 *  6. empty string : "" => ""
	 */
	DeleteAat1st2Pos delAat1stPos;
	@BeforeEach
	void beforeinvoke()
	{
		delAat1stPos = new DeleteAat1st2Pos();
	}
	
	@Test
	void testAat1Pos() {
		assertEquals("BCD",delAat1stPos.delete("ABCD"));
	}
	@Test
	void testAat1_2Pos() {
		assertEquals("CD",delAat1stPos.delete("AACD"));
	}
	@Test
	void testAat2Pos() {
		assertEquals("BCD",delAat1stPos.delete("BACD"));
	}
	@Test
	void testallA() {
		assertEquals("AA",delAat1stPos.delete("AAAA"));
	}
	@Test
	void testnoAat1_2() {
		assertEquals("BBAA",delAat1stPos.delete("BBAA"));
	}
	@Test
	void testAOfLen1() {
		assertEquals("",delAat1stPos.delete("A"));
	}
	@Test
	void testempty() {
		assertEquals("",delAat1stPos.delete(""));
	}
	
}