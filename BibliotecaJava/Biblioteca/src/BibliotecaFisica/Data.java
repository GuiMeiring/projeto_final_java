package BibliotecaFisica;

public class Data {
	int dia;
	int mes;
	int ano;
	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	@Override
	public String toString() {
		return  dia + "/" + mes + "/" + ano;
	}
	
	
}
