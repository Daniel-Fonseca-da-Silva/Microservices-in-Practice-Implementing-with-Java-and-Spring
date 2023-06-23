package br.com.alurapedido.pedidos.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.com.alurapedido.pedidos.model.Status;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PedidoDto {
	
	private Long id;
    private LocalDateTime dataHora;
    private Status status;
    private List<ItemDoPedidoDto> itens = new ArrayList<>();
	
}
