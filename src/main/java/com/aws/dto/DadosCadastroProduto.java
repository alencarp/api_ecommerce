package com.aws.dto;

import com.aws.model.Categoria;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record DadosCadastroProduto (
        @NotBlank
        String nome,
        @NotNull
        BigDecimal preco,
        @NotNull
        Categoria categoria) {
}
