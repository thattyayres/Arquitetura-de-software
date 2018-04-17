package cartorio.service;

import java.io.IOException;
import java.util.ArrayList;

import cartorio.dao.FilaDAO;
import cartorio.entity.Fila;

public class FilaService {
	private FilaDAO dao;
	
	public FilaService() {
		dao = new FilaDAO();
	}
	public ArrayList<Fila> listarFilas() throws IOException{
		return dao.listarFilas();
	}
	public Fila carregar(int id) throws IOException{
		return dao.carregar(id);
	}
}
