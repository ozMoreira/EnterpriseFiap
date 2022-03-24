
public enum Menu {
	SALVAR(1), 
	IMPRIMIR(2), 
	ABRIR(3), 
	VISUALIZAR(4), 
	FECHAR(5);

	private final int valor;

	
	private Menu(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}
	
	public static void escolheOpcaoMenu(int valorMenu) {
		if (valorMenu == Menu.SALVAR.getValor()) System.out.println("SALVANDO REGISTRO");
		else if (valorMenu == Menu.IMPRIMIR.getValor())  System.out.println("Imprimindo dados");
		else if (valorMenu == Menu.ABRIR.getValor())  System.out.println("Abrindo Arquivo");
		else if (valorMenu == Menu.VISUALIZAR.getValor())  System.out.println("VISUALIZANDO REGISTROS");
		else if (valorMenu == Menu.FECHAR.getValor())  System.out.println("FECHANDO ARQUIVO");
		else System.out.println("Opção Invalida!");
	}
}
