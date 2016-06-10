package br.com.engenhariaDeSoftware.padroes2.estados;

import br.com.engenhariaDeSoftware.padroes2.Trem;

public class Liga implements EstadoDoTrem
{
	public Liga(Trem trem, int estado)
	{
		ligaTrem(trem, estado);
	}
	
	@Override
	public void ligaTrem(Trem trem, int estado) 
	{
		trem.setEstado(estado);
		
		if((trem.getEstado() % 2) != 0){
			trem.acendeFarol();
			
			switch (trem.getEstado()) {
				case 2:
					trem.andaParaFrente();
					break;
				case 4:
					trem.para();
					break;
				case 6:
					trem.andaParaTras();
					break;
				case 8:
					trem.para();
					break;
		
				default:
					throw new RuntimeException("Estado errado do trem");
			}
		}
		else
			throw new RuntimeException("Estado errado do trem");
	}

	@Override
	public void desligaTrem(Trem trem, int estado)
	{
		if((((estado-1) %2) != 0) && (estado > 0) && (estado < 9))
		throw new RuntimeException("Trem já está desligado");
	}
}
