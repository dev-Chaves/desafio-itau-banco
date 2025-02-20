package com.desafiounibanco.desafio_itau_backend.domain;

import java.time.OffsetDateTime;
import java.util.Objects;

public class Transacao {

    private double valor;
    private OffsetDateTime dataHora;

    public Transacao(double valor, OffsetDateTime dataHora) {
        this.valor = valor;
        this.dataHora = dataHora.now();
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "valor=" + valor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Transacao transacao = (Transacao) o;
        return Double.compare(valor, transacao.valor) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(valor);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(OffsetDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
