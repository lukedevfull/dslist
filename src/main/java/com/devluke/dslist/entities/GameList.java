package com.devluke.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

/**
 * Entidade que representa uma lista de jogos no sistema.
 * Esta classe mapeia a tabela tb_game_list no banco de dados e representa
 * coleções temáticas de jogos (ex: "Jogos de RPG", "Melhores de 2023").
 */
@Entity
@Table(name = "tb_game_list")
public class GameList {
    
    /**
     * Identificador único da lista de jogos.
     * Gerado automaticamente pelo banco de dados.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    /**
     * Nome da lista de jogos.
     */
    private String name;

    /**
     * Construtor padrão.
     */
    public GameList(){
    }

    /**
     * Construtor com parâmetros.
     * 
     * @param id Identificador único da lista
     * @param name Nome da lista de jogos
     */
    public GameList(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Retorna o identificador único da lista.
     * 
     * @return O ID da lista
     */
    public Long getId() {
        return id;
    }

    /**
     * Define o identificador único da lista.
     * 
     * @param id O ID a ser definido
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retorna o nome da lista de jogos.
     * 
     * @return O nome da lista
     */
    public String getName() {
        return name;
    }

    /**
     * Define o nome da lista de jogos.
     * 
     * @param name O nome a ser definido
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Compara este objeto com outro para verificar igualdade.
     * Duas listas são consideradas iguais se tiverem o mesmo id.
     * 
     * @param o O objeto a ser comparado
     * @return true se os objetos forem iguais, false caso contrário
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GameList gameList = (GameList) o;
        return Objects.equals(id, gameList.id);
    }

    /**
     * Gera um código hash para este objeto baseado no id.
     * 
     * @return O código hash gerado
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
