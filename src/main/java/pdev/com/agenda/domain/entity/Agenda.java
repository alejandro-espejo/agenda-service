package pdev.com.agenda.domain.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "agenda")
public class Agenda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "descricao")
	private String descricao;

	@Column(name = "data_hora")
	private LocalDateTime horario;

	@Column(name = "data_criacao")
	private LocalDateTime dataCriacao;

	@JoinColumn(name = "paciente_id", referencedColumnName = "id")
	@ManyToOne(fetch = FetchType.LAZY)
	private Paciente paciente;
}
