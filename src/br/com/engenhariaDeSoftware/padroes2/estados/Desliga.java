package br.com.engenhariaDeSoftware.padroes2.estados;

import br.com.engenhariaDeSoftware.padroes2.Trem;

public class Desliga implements EstadoDoTrem
{
	public Desliga(Trem trem, int estado)
	{
		desligaTrem(trem, estado);
	}
	
	@Override
	public void desligaTrem(Trem trem, int estado)
	{
		trem.setEstado(estado);
		
		if(((trem.getEstado() %2) != 0) && (trem.getEstado() > 0) && (trem.getEstado() < 9)) {
			trem.apagaFarol();
			trem.para();
		}
		else
			throw new RuntimeException("Estado errado do trem");
	}

	@Override
	public void ligaTrem(Trem trem, int estado)
	{
		if((((estado-1) %2) == 0) && (estado > 0) && (estado < 9))
			throw new RuntimeException("Trem já está ligado");
	}
}
