package celular;

public class MeuIphone {
	
	public static void main(String[] args) {
		
		Iphone iphone15 = new Iphone();
		
		
		iphone15.selecionarMusica("Mulher de fases");
		iphone15.tocar();
		iphone15.pausar();
		
		iphone15.ligar("999999999");
		iphone15.atender();
		iphone15.iniciarCorrerioVoz();
		
		iphone15.exibirPagina("www.instagram.com.br");
		iphone15.adicionarNovaAba();
		iphone15.atualizarPagina();
	}

}
