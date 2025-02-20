package com.desafiounibanco.desafio_itau_backend.service;

import com.desafiounibanco.desafio_itau_backend.domain.Transacao;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

public class TransacaoServices {

    private static List<Transacao> transacoes;

    static{
        transacoes = new ArrayList<>(List.of(new Transacao(100, OffsetDateTime.now())));
    }

}
