package br.cesed.si.lsi.exemplo4;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "BB_CONTA")
@NoArgsConstructor
@Getter @Setter
public class Conta {

	@Id
	@GeneratedValue
	@Column(name = "NM_CONTA", nullable = false)
	private int numeroConta;

	@Column(name = "AG", nullable = false)
	private int agencia;
		
	@Column(name = "TIT", length = 100)
	private String titular;
	
	@Column(name = "SLD", scale = 2)
	private double saldo;
	
}
