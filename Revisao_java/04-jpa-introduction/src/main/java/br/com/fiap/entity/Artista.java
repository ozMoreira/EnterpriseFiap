package br.com.fiap.entity;

import java.time.LocalDate;

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
import javax.persistence.Transient;

@Entity
@Table(name = "TB_ARTISTA")
@SequenceGenerator(
		name = "Artista",
		sequenceName = "SQ_TB_ARTISTA",
		allocationSize = 1)
public class Artista {

	@Id
	@Column(name="cd_artista")
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "Artista")
	private int codigo;
	
	@Column(name="nm_artista", nullable = false, unique = true, length = 100)
	private String nome;
	
	@Column(name = "dt_nascimento", nullable = true)
	private LocalDate dtNascimento;
	
	@Lob
	@Column(name = "fl_artista", nullable = true)
	private byte[] foto;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "ds_genero_musical", nullable = false)
	private GeneroMusica generoMusical;
	
	@Column(name = "st_cantor", nullable = false)
	private Boolean isCantor;
	
	@Column(name = "st_musico", nullable = false)
	private Boolean isMusico;
	
	@Transient
	@Column(name = "nr_musicas")
	private Integer nrMusicas;
	
}
