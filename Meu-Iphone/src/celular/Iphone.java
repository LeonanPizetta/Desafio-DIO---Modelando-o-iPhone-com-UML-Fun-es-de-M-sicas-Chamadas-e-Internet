package celular;


import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	
	public void tocar() {
		System.out.println("Tocando a musica escolhida");
	}

	public void pausar() {
		System.out.println("Musica Pausada");
		
	}

	public void selecionarMusica(String musica) {
		System.out.println("Você selecionou a musica:" + musica);	
	}
	
	
	public void ligar(String numero) {
		System.out.println("Você está ligando para o numero: " + numero);
	}
	
	public void atender() {
		System.out.println("Atendendo telefone");
		
	}
	
	public void iniciarCorrerioVoz() {
		System.out.println("Iniciando um correio de voz");
		
	}
	
	public void exibirPagina(String url) {
		System.out.println("Você acessou a pagina " + url);
	}
	
	public void adicionarNovaAba() {
		System.out.println("Adicionando uma nova aba");
	}
	
	public void atualizarPagina() {
		System.out.println("Atualizando a pagina");
	}
	
	
}
