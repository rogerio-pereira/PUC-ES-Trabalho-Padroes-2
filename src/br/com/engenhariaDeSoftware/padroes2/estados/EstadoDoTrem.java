package br.com.engenhariaDeSoftware.padroes2.estados;

import br.com.engenhariaDeSoftware.padroes2.Trem;

public interface EstadoDoTrem 
{
	public void ligaTrem(Trem trem, int estado);
	
	public void desligaTrem(Trem trem, int estado);
}
