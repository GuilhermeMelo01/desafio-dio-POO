package br.com.dio.desafio.dominio;

import lombok.Data;

@Data
public class Curso extends Conteudo {
    private int cargaHoraria;

    @Override
    public double calcularXP() {
        return XP_PADRAO + cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
