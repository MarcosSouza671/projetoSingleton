package exemplo;

//criação da classe
public final class Janela { 
	
	//Atributos privados
	private static final Janela INSTANCE = new Janela();  
	private static final String Teste = "Exemplo Singleton Privado";
	
	//Atributo público
	public static final String Singleton = "Exemplo Singleton Público";
	
	//Construtor privado 
	private Janela() {
		
	}
	
	//Método publico estático realizando o primeiro e único acesso necessário nesse tipo de aplicação 
	public static Janela getInstance() {
		return INSTANCE;
	}
	
	//Execução desse método de qualquer parte do projeto
	public static void Abrir() {
		System.out.println("Abrir janela!");
	}
	
	//Execução desse método de qualquer parte do projeto
	public static void Fechar() {
		System.out.println("Fechar janela!");
	}
}
