package dominio;

import java.sql.Date;

public class Locacao {
	private Cliente cliente;
	private Altomovel altomovel;
	private Funcionario funcionario;
	private int id;
	private Date dtIniLocacao;
	private Date dtFimLocacao;
	private int kmInicial;
	private int kmFinal;
	private double valorDaDiaria;
	private int diasDeAtraso;
	private double multaPorDia;
	private String formaDePagamento;
	private int parcela;
	private double valorDaParcela;
	private Date dataPagamento;
	private boolean flPago;
	private double valorTotal;
	public Locacao(){
		
	}
	
	public Locacao(Cliente cliente, Altomovel altomovel,
			Funcionario funcionario, int id, Date dtIniLocacao,
			Date dtFimLocacao, int kmInicial, int kmFinal,
			double valorDaDiaria, int diasDeAtraso, double multaPorDia,
			String formaDePagamento, int parcela, double valorDaParcela,
			Date dataPagamento, boolean flPago,double valorTotal) {
		this.cliente = cliente;
		this.altomovel = altomovel;
		this.funcionario = funcionario;
		this.id = id;
		this.dtIniLocacao = dtIniLocacao;
		this.dtFimLocacao = dtFimLocacao;
		this.kmInicial = kmInicial;
		this.kmFinal = kmFinal;
		this.valorDaDiaria = valorDaDiaria;
		this.diasDeAtraso = diasDeAtraso;
		this.multaPorDia = multaPorDia;
		this.formaDePagamento = formaDePagamento;
		this.parcela = parcela;
		this.valorDaParcela = valorDaParcela;
		this.dataPagamento = dataPagamento;
		this.flPago = flPago;
		this.valorTotal = valorTotal;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Altomovel getAltomovel() {
		return altomovel;
	}
	public void setAltomovel(Altomovel altomovel) {
		this.altomovel = altomovel;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDtIniLocacao() {
		return dtIniLocacao;
	}
	public void setDtIniLocacao(Date dtIniLocacao) {
		this.dtIniLocacao = dtIniLocacao;
	}
	public Date getDtFimLocacao() {
		return dtFimLocacao;
	}
	public void setDtFimLocacao(Date dtFimLocacao) {
		this.dtFimLocacao = dtFimLocacao;
	}
	public int getKmInicial() {
		return kmInicial;
	}
	public void setKmInicial(int klInicial) {
		this.kmInicial = klInicial;
	}
	public int getKmFinal() {
		return kmFinal;
	}
	public void setKmFinal(int klFinal) {
		this.kmFinal = klFinal;
	}
	public double getValorDaDiaria() {
		return valorDaDiaria;
	}
	public void setValorDaDiaria(double valorDaDiaria) {
		this.valorDaDiaria = valorDaDiaria;
	}
	public int getDiasDeAtraso() {
		return diasDeAtraso;
	}
	public void setDiasDeAtraso(int diasDeAtraso) {
		this.diasDeAtraso = diasDeAtraso;
	}
	public double getMultaPorDia() {
		return multaPorDia;
	}
	public void setMultaPorDia(double multaPorDia) {
		this.multaPorDia = multaPorDia;
	}
	public String getFormaDePagamento() {
		return formaDePagamento;
	}
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	public int getParcela() {
		return parcela;
	}
	public void setParcela(int parcela) {
		this.parcela = parcela;
	}
	public double getValorDaParcela() {
		return valorDaParcela;
	}
	public void setValorDaParcela(double valorDaParcela) {
		this.valorDaParcela = valorDaParcela;
	}
	public Date getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	public boolean isFlPago() {
		return flPago;
	}
	public void setFlPago(boolean flPago) {
		this.flPago = flPago;
	}	 
	
	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public void informarCliente(Cliente cliente){
		this.cliente = cliente;
	}
	public void informarAlromovel(Altomovel altomovel){
		this.altomovel = altomovel;
	}
	public void informarFuncionario(Funcionario funcionario){
		this.funcionario = funcionario;
	}
	public void pagar(double valorTotal, int diasDeAtraso, String formaDePagamento,int parcela,double valorDaParcela, Date dtPagamento){
		this.valorTotal = valorTotal;
		this.diasDeAtraso = diasDeAtraso;
		this.formaDePagamento = formaDePagamento;
		this.parcela = parcela;
		this.valorDaParcela = valorDaParcela;
		this.dataPagamento = dtPagamento;
		this.flPago = true;
	}

}
