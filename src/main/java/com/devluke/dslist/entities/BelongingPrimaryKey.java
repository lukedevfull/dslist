package com.devluke.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

/**
 * Classe que representa a chave primária composta da entidade Belonging.
 * Esta classe é embarcável e contém as referências para Game e GameList,
 * formando uma chave primária composta para o relacionamento muitos-para-muitos.
 */
@Embeddable
public class BelongingPrimaryKey {
    
    /**
     * Referência para o jogo que faz parte da relação.
     * Mapeado para a coluna 'game_id' na tabela tb_belonging.
     */
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    /**
     * Referência para a lista de jogos que faz parte da relação.
     * Mapeado para a coluna 'list_id' na tabela tb_belonging.
     */
    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList list;

    /**
     * Construtor padrão.
     */
    public BelongingPrimaryKey() {
    }

    /**
     * Construtor com parâmetros.
     * 
     * @param game O jogo da relação
     * @param list A lista de jogos da relação
     */
    public BelongingPrimaryKey(Game game, GameList list) {
        this.game = game;
        this.list = list;
    }

    /**
     * Retorna o jogo da relação.
     * 
     * @return O jogo associado
     */
    public Game getGame() {
        return game;
    }

    /**
     * Define o jogo da relação.
     * 
     * @param game O jogo a ser definido
     */
    public void setGame(Game game) {
        this.game = game;
    }

    /**
     * Retorna a lista de jogos da relação.
     * 
     * @return A lista de jogos associada
     */
    public GameList getList() {
        return list;
    }

    /**
     * Define a lista de jogos da relação.
     * 
     * @param list A lista de jogos a ser definida
     */
    public void setList(GameList list) {
        this.list = list;
    }

    /**
     * Compara este objeto com outro para verificar igualdade.
     * Duas chaves primárias são consideradas iguais se tiverem o mesmo game e list.
     * 
     * @param o O objeto a ser comparado
     * @return true se os objetos forem iguais, false caso contrário
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPrimaryKey that = (BelongingPrimaryKey) o;
        return Objects.equals(game, that.game) && Objects.equals(list, that.list);
    }

    /**
     * Gera um código hash para este objeto baseado no game e list.
     * 
     * @return O código hash gerado
     */
    @Override
    public int hashCode() {
        return Objects.hash(game, list);
    }
}
