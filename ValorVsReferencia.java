package Classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a;
			
		a++;
		b--;
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1, 6, 2021);
		Data d2 = d1;
		
		d1.dia = 31;
		d2.mes = 12;
		d1.ano = 2022;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d2.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
}
