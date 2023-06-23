package br.com.alurapedido.pedidos.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pedidos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private LocalDateTime dataHora;

	@NotNull @Enumerated(EnumType.STRING)
	private Status status;
	
	@OneToMany(cascade = CascadeType.PERSIST, mappedBy = "pedido")
	private List<ItemDoPedido> itens = new ArrayList<>();
}
