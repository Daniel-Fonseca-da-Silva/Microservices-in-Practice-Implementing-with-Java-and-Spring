package br.com.alurapedido.pedidos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "item_do_pedido")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemDoPedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Positive
	private Integer quantidade;

	private String descricao;

	@ManyToOne(optional = false)
	private Pedido pedido;

}
