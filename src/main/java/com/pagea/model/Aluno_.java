package com.pagea.model;

import com.pangea.enums.Sexo;
import java.math.BigInteger;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2020-06-16T17:47:31.765-0300")
@StaticMetamodel(Aluno.class)
public class Aluno_ {
	public static volatile SingularAttribute<Aluno, Long> id;
	public static volatile SingularAttribute<Aluno, String> nome;
	public static volatile SingularAttribute<Aluno, LocalDate> dataNascimento;
	public static volatile SingularAttribute<Aluno, BigInteger> matricula;
	public static volatile SingularAttribute<Aluno, String> rg;
	public static volatile SingularAttribute<Aluno, String> telefone;
	public static volatile SingularAttribute<Aluno, Endereco> endereco;
	public static volatile SingularAttribute<Aluno, Boolean> isAtivo;
	public static volatile SingularAttribute<Aluno, Sexo> sexo;
}
