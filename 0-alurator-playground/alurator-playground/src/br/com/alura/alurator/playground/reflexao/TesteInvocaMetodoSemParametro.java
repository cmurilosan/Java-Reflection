package br.com.alura.alurator.playground.reflexao;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TesteInvocaMetodoSemParametro {

	public static void main(String[] args) throws Exception {
		Class<?> subControleClasse = Class.forName("br.com.alura.alurator.playground.controle.SubControle");
		
		Constructor<?> constructorPadrao = subControleClasse.getDeclaredConstructor();
		constructorPadrao.setAccessible(true);
		
		Object subControle = constructorPadrao.newInstance();
		
		for(Method m : subControleClasse.getMethods()) {
			System.out.println(m);
		}
		
		System.out.println("---------------------------------");
		
		for(Method m : subControleClasse.getDeclaredMethods()) {
			System.out.println(m);
		}
		
		System.out.println("---------------------------------");
		
		Method m = subControleClasse.getDeclaredMethod("metodoSubControle2");
		m.setAccessible(true);		
		Object retorno = m.invoke(subControle);
		System.out.println(retorno);
		/* metodo setAccessible(true) permite o acesso ao método privado
		 * e como possui um retorno, retorna algo
		 */
		
		System.out.println("---------------------------------");
		
		Method m2 = subControleClasse.getDeclaredMethod("metodoSubControle1");
		Object retorno2 = m2.invoke(subControle);
		System.out.println(retorno2);
		/* Neste caso, como o método é público não é necessário o Accessible
		 * O retorno será null porque se trata de um void
		 */
	}

}
