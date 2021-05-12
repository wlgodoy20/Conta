package br.com.desafio.contacorrente.domain.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tb_Conta")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroConta;

    private BigDecimal saldo;
}
