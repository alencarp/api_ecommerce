package com.aws.controller;

import com.aws.dto.DadosCadastroProduto;
import com.aws.dto.DadosListagemProdutos;
import com.aws.model.Produto;
import com.aws.service.ProdutoService;
import jakarta.validation.Valid;

import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    @Transactional
    public ResponseEntity<Produto> cadastrar(@RequestBody @Valid DadosCadastroProduto dadosCadastroProduto) {
        produtoService.save(dadosCadastroProduto);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    private List<DadosListagemProdutos> buscarTodos() {
        System.out.println("Entrei no método buscarTodos()!!!!!!!!!!!!!!");
        List<DadosListagemProdutos> listagemProdutos = produtoService.findAll();
         return listagemProdutos;
    }
}
