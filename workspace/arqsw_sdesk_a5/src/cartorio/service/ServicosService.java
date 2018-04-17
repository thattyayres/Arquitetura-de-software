package cartorio.service;

import java.io.IOException;
import java.util.ArrayList;

import cartorio.dao.*;
import cartorio.entity.*;

public class ServicosService {
	private ServicosDAO dao;
	
	public ServicosService() {
		dao = new ServicosDAO();
	}
	public ArrayList<Servicos> listarServicos() throws IOException{
		return dao.listarServicos();
	}
	/*public Fila carregar(int id) throws IOException{
		return dao.carregar(id);
	}*/
}
