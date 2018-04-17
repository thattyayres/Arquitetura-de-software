package cartorio.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import cartorio.dao.ChamadoDAO;
import cartorio.entity.Chamado;
import cartorio.entity.Fila;

public class SubServicosService {
	ChamadoDAO dao;
	
	public SubServicosService(){
		dao = new ChamadoDAO();
	}
	
	public int novoChamado(Chamado chamado) throws IOException{
		chamado.setDataAbertura(new Date());
		chamado.setDataFechamento(null);
		chamado.setStatus(Chamado.ABERTO);
		return -1;
		//return dao.inserirChamado(chamado);
	}
	
	public ArrayList<Chamado> listarChamados(Fila fila) throws IOException{
		return dao.listarChamados(fila);
	}

}
