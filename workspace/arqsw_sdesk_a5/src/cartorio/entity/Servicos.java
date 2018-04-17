package cartorio.entity;


import javax.persistence.Entity;
import javax.validation.constraints.*;


@Entity
public class Servicos {
	
	@NotNull
	private int idServicos;
	@NotNull
	private String servicos;
	

	public int getIdServicos() {
		return idServicos;
	}
	public void setIdServicos(int idServicos) {
		this.idServicos = idServicos;
	}
	public String getServicos() {
		return servicos;
	}
	public void setServicos(String servicos) {
		this.servicos = servicos;
	}
	
	@Override
	public String toString() {
		return "Servicos [idServicos=" + idServicos + ", servicos=" + servicos + "]";
	}


}
