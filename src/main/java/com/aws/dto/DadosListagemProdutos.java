package com.aws.dto;

import com.aws.model.Categoria;
import com.aws.model.Produto;

import java.math.BigDecimal;

public record DadosListagemProdutos(String nome, BigDecimal preco, Categoria categoria) {

    public DadosListagemProdutos(Produto produto){
        this(produto.getNome(), produto.getPreco(), produto.getCategoria());
    }
}
