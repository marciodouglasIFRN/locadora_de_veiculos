package dominio;

import java.sql.Date;

public class Cliente {
	private String nome;
	private String cpf;
	private Date nascimento;
	private String sexo;
	private String numeroCnh;
	private String tipoCnh;
	private Date vencimentoCnh;
	private String telefone;
	private String email;
	private String endereco;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNumeroCnh() {
		return numeroCnh;
	}
	public void setNumeroCnh(String numeroCnh) {
		this.numeroCnh = numeroCnh;
	}
	public String getTipoCnh() {
		return tipoCnh;
	}
	public void setTipoCnh(String tipoCnh) {
		this.tipoCnh = tipoCnh;
	}
	public Date getVencimentoCnh() {
		return vencimentoCnh;
	}
	public void setVencimentoCnh(Date vencimentoCnh) {
		this.vencimentoCnh = vencimentoCnh;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
