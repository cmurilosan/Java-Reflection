package br.com.alura.alurator.reflexao;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.stream.Stream;

public class ManipuladorObjeto {

	private Object instancia;

	public ManipuladorObjeto(Object instancia) {
		this.instancia = instancia;
		
	}

	public ManipuladorMetodo getMetodo(String nomeMetodo, Map<String, Object> params) {
		// 1) Pegar todos os métodos da classe.
		// 2) Filtrar todos os métodos de modo que:
		// 2.1) Tenham o mesmo nome informado pelo usuário;
		// 2.2) Tenham a mesma quantidade de parâmetros passados na URL;
		// 2.3) E que cada um dos parâmetros tenham os mesmos nomes e tipos iguais
		// aos passados na URL.
		// 3) Lançar uma RuntimeException caso nenhum método seja encontrado.
		
		Stream<Method> metodos = Stream.of(instancia.getClass().getDeclaredMethods());
		Method metodoSelecionado = metodos.filter(metodo -> true)
		.findFirst()
		.orElseThrow(() -> new RuntimeException("Metodo não encontrado!"));
		try {
			Method metodo = instancia.getClass().getDeclaredMethod(nomeMetodo);
			return new ManipuladorMetodo(instancia, metodo);
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
