package br.com.fiap.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="TB_MUSICA")
@SequenceGenerator(
		name = "Musica", //nome java
		sequenceName = "SQ_TB_MUSICA", //nome no banco
		allocationSize = 1) //intervalo de incremento...

public class Musica {

	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE, 
			generator = "Musica" )
	@Column(name="cd_musica")
	private Integer codigo;
	
	@Column(name="nm_musica", length = 50, nullable = false, unique = true)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_lancamento", nullable = false)
	private Calendar dataLancamento;
	
	@Column(name="nr_duracao")
	private Float duracao;
	
	@Column(name="ds_album", nullable = false, length = 40)
	private String album;
	
	@Column(name="tp_instrumental")
	private Boolean instrumental;
	
	@Column(name="dt_cadastro", updatable = false)
	private LocalDate dataCadastro;
	
	@Column(name="vl_faturamento", precision = 11, scale = 2)
	private BigDecimal faturamento;
	
	@Transient //nao grava no banco essa info
	private Integer idade;
	
	@Lob // define blob para arquivos
	@Column(name="fl_capa_album")
	private byte[] capaAlbum;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_genero", length = 20)
	private GeneroMusica genero;
		
}
