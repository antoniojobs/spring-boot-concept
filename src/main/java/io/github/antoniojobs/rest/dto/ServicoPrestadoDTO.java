package io.github.antoniojobs.rest.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ServicoPrestadoDTO {

    private String descricao;
    private String valor;//era preco
    private String data;
    private Integer idCliente;
}
