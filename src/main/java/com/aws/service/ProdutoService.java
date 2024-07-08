package com.aws.service;

import com.aws.dto.DadosCadastroProduto;
import com.aws.dto.DadosListagemProdutos;
import com.aws.model.Produto;
import com.aws.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public void save(DadosCadastroProduto dadosCadastroProduto){
        produtoRepository.save(new Produto(dadosCadastroProduto));
    }

    public List<DadosListagemProdutos> findAll() {
        List<DadosListagemProdutos> listaDadosListagemProdutos = new ArrayList<>();
        List<Produto> produtos = produtoRepository.findAll();

        for (Produto p : produtos) {
            System.out.println(p.toString());
            DadosListagemProdutos dados = new DadosListagemProdutos(p);
            System.out.println("dados.nome() = " + dados.nome());
            listaDadosListagemProdutos.add(dados);
        }
        if (listaDadosListagemProdutos != null) {
            System.out.println(listaDadosListagemProdutos.get(0).preco());
        } else {
            System.out.println("listaDadosListaProdutos é null");
        }
        return listaDadosListagemProdutos;
    }
}
