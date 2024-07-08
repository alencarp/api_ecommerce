package com.aws.model;


import com.aws.dto.DadosCadastroProduto;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Table(name = "produtos")
@Entity(name = "Produto")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
@ToString
public class Produto {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private BigDecimal preco;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    public Produto(DadosCadastroProduto dadosCadastroProduto) {
        this.nome = dadosCadastroProduto.nome();
        this.preco = dadosCadastroProduto.preco();
        this.categoria = dadosCadastroProduto.categoria();
    }
}
