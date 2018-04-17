package cartorio.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cartorio.entity.*;

public class ServicosDAO {
	
	public ArrayList<Servicos> listarServicos() throws IOException {
		String query = "select id_servicos, servicos from servicos";
		ArrayList<Servicos> lista = new ArrayList<>();
		try(Connection conn = ConnectionFactory.getConnection();
			PreparedStatement pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();){
			
			while(rs.next()) {
				Servicos servicos = new Servicos();
				servicos.setIdServicos(rs.getInt("id_servicos"));
				servicos.setServicos(rs.getString("servicos"));
				lista.add(servicos);
			}
			
		} catch (SQLException e) {
			throw new IOException(e);
		}
		return lista;
	}
	
}
