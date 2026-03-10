package org.example.DTO;

public record MaquinaDTO(
  String nome
){

    @Override
    public String toString() {
        return "MaquinaDTO{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
