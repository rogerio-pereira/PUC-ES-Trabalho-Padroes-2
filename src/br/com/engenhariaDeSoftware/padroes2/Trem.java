package br.com.engenhariaDeSoftware.padroes2;

import br.com.engenhariaDeSoftware.padroes2.estados.Desliga;
import br.com.engenhariaDeSoftware.padroes2.estados.EstadoDoTrem;
import br.com.engenhariaDeSoftware.padroes2.estados.Liga;

public class Trem 
{
	private int 			estado;
	private EstadoDoTrem 	estadoAtual;
	
	public Trem()
	{
		setEstado(1);
		
		estadoAtual = new Desliga(this, getEstado());
	}
	
	public Trem(int estado)
	{
		//Usando o set para validar o estado
		setEstado(estado);
		
		if((this.estado % 2) == 0) {
			estadoAtual = new Liga(this, getEstado());
		}
		else {
			estadoAtual = new Desliga(this, getEstado());
		}
	}
	
	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		if((estado > -1) && (estado < 9))
			this.estado = estado;
		else
			throw new RuntimeException("Estado inválido");
	}

	public void para()
	{
		System.out.println("Trem parado\n");
	}
	
	public void andaParaFrente()
	{
		System.out.println("Trem andando para frente\n");
	}
	
	public void andaParaTras()
	{
		System.out.println("Trem andando para trás\n");
	}
	
	public void acendeFarol()
	{
		System.out.println("Farol aceso");
	}
	
	public void apagaFarol()
	{
		System.out.println("Farol apagado");
	}

	public void liga()
	{
		if(getEstado()+1 == 9)
			setEstado(0);
		
		mudaEstado(new Liga(this, getEstado()+1));
	}
	
	public void desliga()
	{
		if(getEstado()+1 == 9)
			setEstado(0);
		
		mudaEstado(new Desliga(this, getEstado()+1));
	}
	
	private void mudaEstado(EstadoDoTrem estado)
	{
		this.estadoAtual = estado;
	}
}
