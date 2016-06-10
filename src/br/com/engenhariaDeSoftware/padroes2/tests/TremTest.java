package br.com.engenhariaDeSoftware.padroes2.tests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import br.com.engenhariaDeSoftware.padroes2.Trem;

public class TremTest {
	private Trem trem;
	
	@Before
	public void before()
	{
		trem = new Trem();
	}

	@Test
	public void iniciaTrem() {
		assertEquals(1, trem.getEstado());
	}
	
	@Test
	public void iniciaTremComEstado()
	{
		Trem trem2 = new Trem(3);
		assertEquals(3, trem2.getEstado());
	}
	
	@Test(expected=RuntimeException.class)
	public void ligaDuasVezes()
	{
		trem.liga();
		trem.liga();
	}
	
	@Test(expected=RuntimeException.class)
	public void desligaDuasVezes()
	{
		trem.desliga();
		trem.desliga();
	}

}
