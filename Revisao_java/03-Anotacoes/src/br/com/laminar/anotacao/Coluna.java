package br.com.laminar.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//define ate quando a anotação sera mantida
@Retention(RetentionPolicy.RUNTIME)
//define onde a anotação pode ser utilizada
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Coluna {
	String nome();
	boolean chave() default false;
	int tamanho() default 0;
}
