package com.aws.service;

import com.aws.dto.ProdutoResponseDTO;
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

    public ProdutoResponseDTO cadastrar(Produto produto){
        produtoRepository.save(produto);
        return new ProdutoResponseDTO(produto);
    }

    public List<ProdutoResponseDTO> listar() {

        List<ProdutoResponseDTO> produtosResponseDTO = new ArrayList<>();
        List<Produto> produtos = produtoRepository.findAll();

        for (Produto p : produtos) {
            produtosResponseDTO.add(new ProdutoResponseDTO(p));
        }
        return produtosResponseDTO;
    }

    public ProdutoResponseDTO buscarPorId(Long id) {
        Produto produto = produtoRepository.findById(id).get();
        return new ProdutoResponseDTO(produto);
    }
}
