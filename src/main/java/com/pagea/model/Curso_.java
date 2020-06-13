package com.pagea.model;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2020-06-12T22:48:17.253-0300")
@StaticMetamodel(Curso.class)
public class Curso_ {
	public static volatile SingularAttribute<Curso, Long> id;
	public static volatile SingularAttribute<Curso, String> nome;
	public static volatile SingularAttribute<Curso, String> login;
	public static volatile SingularAttribute<Curso, String> senha;
	public static volatile SingularAttribute<Curso, LocalDateTime> dataCadastro;
}
