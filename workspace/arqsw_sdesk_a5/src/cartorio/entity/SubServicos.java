package cartorio.entity;

import javax.validation.constraints.*;


public class SubServicos{
	
	@NotNull
	private int idSubservico;
	@NotNull
	private String subServico;
	
	public int getIdSubservico() {
		return idSubservico;
	}
	public void setIdSubservico(int idSubservico) {
		this.idSubservico = idSubservico;
	}
	public String getSubServico() {
		return subServico;
	}
	public void setSubServico(String subServico) {
		this.subServico = subServico;
	}
	
	@Override
	public String toString() {
		return "SubServicos [idSubservico=" + idSubservico + ", subServico=" + subServico + "]";
	}
	
	
	
}
