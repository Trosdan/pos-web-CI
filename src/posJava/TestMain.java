package posJava;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class TestMain extends TestCase {

	@Test
	void testIns() {
		Valores val = new Valores();
		int valIns = 15;
		boolean b = val.ins(valIns);
		assertEquals(b, true);
	}

	@Test
	void testInsNegativo() {
		Valores val = new Valores();
		int valIns = -15;
		boolean b = val.ins(valIns);
		assertEquals(b, false);
	}

	@Test
	void testInsFullArray() {
		Valores val = new Valores();
		int valIns = -15;
		boolean b = val.ins(valIns);
		assertEquals(b, false);
	}

	@Test
	void testDel() {
		Valores val = new Valores();
		int valIns = 10;
		val.ins(valIns);
		int valorDeletado = val.del(0);
		
		assertEquals(valorDeletado, valIns);
	}
	
	@Test
	void testDelEmptyArray() {
		Valores val = new Valores();
		int valNull = -1;
		val.ins(15);
		val.del(0);
		int valorDeletado = val.del(0);
		
		assertEquals(valorDeletado, valNull);
	}

	@Test
	void testDelNullIndice() {
		Valores val = new Valores();
		int valNull = -1;
		val.ins(15);
		int valorDeletado = val.del(50);
		
		assertEquals(valorDeletado, valNull);
	}

	@Test
	void testSize() {
		Valores val = new Valores();
		val.ins(3);
		val.ins(2);
		val.ins(6);
		val.ins(3);
		val.del(1);
		assertEquals(val.size(), 3);
	}

}
