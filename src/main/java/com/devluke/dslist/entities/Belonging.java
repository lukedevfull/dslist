package com.devluke.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

/**
 * Entidade que representa o relacionamento entre um jogo e uma lista de jogos.
 * Esta classe implementa uma relação muitos-para-muitos com atributos adicionais (posição do jogo na lista).
 */
@Entity
@Table(name = "tb_belonging")
public class Belonging {

    /**
     * Chave primária composta que contém as referências para Game e GameList.
     */
    @EmbeddedId
    private BelongingPrimaryKey id = new BelongingPrimaryKey();
    
    /**
     * Posição do jogo dentro da lista.
     */
    private Integer position;

    /**
     * Construtor padrão.
     */
    public Belonging(){
    }

    /**
     * Construtor com parâmetros.
     * 
     * @param game O jogo que pertence à lista
     * @param list A lista à qual o jogo pertence
     * @param position A posição do jogo na lista
     */
    public Belonging(Game game, GameList list, Integer position){
        id.setGame(game);
        id.setList(list);
        this.position = position;
    }

    /**
     * Retorna a chave primária composta.
     * 
     * @return A chave primária que contém as referências para Game e GameList
     */
    public BelongingPrimaryKey getId() {
        return id;
    }

    /**
     * Define a chave primária composta.
     * 
     * @param id A chave primária a ser definida
     */
    public void setId(BelongingPrimaryKey id) {
        this.id = id;
    }

    /**
     * Retorna a posição do jogo na lista.
     * 
     * @return A posição do jogo
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * Define a posição do jogo na lista.
     * 
     * @param position A posição a ser definida
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * Compara este objeto com outro para verificar igualdade.
     * Dois objetos Belonging são considerados iguais se tiverem o mesmo id.
     * 
     * @param o O objeto a ser comparado
     * @return true se os objetos forem iguais, false caso contrário
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id);
    }

    /**
     * Gera um código hash para este objeto.
     * 
     * @return O código hash gerado
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
