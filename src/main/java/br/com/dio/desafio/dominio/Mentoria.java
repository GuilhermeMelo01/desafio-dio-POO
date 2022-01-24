package br.com.dio.desafio.dominio;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Mentoria extends Conteudo {
    private LocalDate data;

    @Override
    public double calcularXP() {
        return XP_PADRAO * 20d;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", Data=" + data +
                '}';
    }
}
