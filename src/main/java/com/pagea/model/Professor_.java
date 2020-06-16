package com.pagea.model;

import com.pangea.enums.Sexo;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2020-06-16T17:47:31.777-0300")
@StaticMetamodel(Professor.class)
public class Professor_ {
	public static volatile SingularAttribute<Professor, Long> id;
	public static volatile SingularAttribute<Professor, String> nome;
	public static volatile SingularAttribute<Professor, LocalDate> dataNascimento;
	public static volatile SingularAttribute<Professor, String> rg;
	public static volatile SingularAttribute<Professor, String> cpf;
	public static volatile SingularAttribute<Professor, String> telefone;
	public static volatile SingularAttribute<Professor, Endereco> endereco;
	public static volatile SingularAttribute<Professor, Boolean> isAtivo;
	public static volatile SingularAttribute<Professor, Sexo> sexo;
}
