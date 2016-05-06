package entity;

public class Cliente {

	private Integer idCliente;
	private String nomeCliente;
	private String emailCliente;
	
	private Endereco endereco;
	

	public Cliente(Integer idCliente, String nomeCliente, String emailCliente, Endereco endereco) {
		super();
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
		this.endereco = endereco;
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(Integer idCliente, String nomeCliente, String emailCliente) {
		super();
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
	}
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nomeCliente=" + nomeCliente + ", emailCliente=" + emailCliente
				+ ", endereco=" + endereco + "]";
	}


	
}
