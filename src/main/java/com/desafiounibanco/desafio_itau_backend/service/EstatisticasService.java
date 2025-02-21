package com.desafiounibanco.desafio_itau_backend.service;

import com.desafiounibanco.desafio_itau_backend.domain.Transacao;
import com.desafiounibanco.desafio_itau_backend.dto.EstatisticasDto;
import org.springframework.stereotype.Service;

import java.util.DoubleSummaryStatistics;
import java.util.List;

@Service
public class EstatisticasService {

    private final TransacaoServices transacaoServices;

    public EstatisticasService(TransacaoServices transacaoServices) {
        this.transacaoServices = transacaoServices;
    }

    public EstatisticasDto calcularEstatisticas(Integer intervalo){

        List<Transacao> listTransacoes = transacaoServices.buscarTransacoes(intervalo);

        DoubleSummaryStatistics estatisticasTransacao = listTransacoes.stream()
                .mapToDouble(Transacao::getValor).summaryStatistics();

        return new EstatisticasDto(estatisticasTransacao.getCount(),
                estatisticasTransacao.getSum(),
                estatisticasTransacao.getAverage(),
                estatisticasTransacao.getMin(),
                estatisticasTransacao.getMax());
    }
}
