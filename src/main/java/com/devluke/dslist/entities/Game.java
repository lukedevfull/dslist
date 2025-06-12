package com.devluke.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

/**
 * Entidade que representa um jogo no sistema.
 * Esta classe mapeia a tabela tb_game no banco de dados e contém todas as informações
 * relacionadas a um jogo, incluindo título, ano, gênero, plataformas, pontuação e descrições.
 */
@Entity
@Table(name = "tb_game")
public class Game {

    /**
     * Identificador único do jogo.
     * Gerado automaticamente pelo banco de dados.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    /**
     * Título do jogo.
     */
    private String title;

    /**
     * Ano de lançamento do jogo.
     * Mapeado para a coluna 'game_year' no banco de dados.
     */
    @Column(name = "game_year")
    private Integer year;
    
    /**
     * Gênero do jogo (ex: RPG, FPS, Strategy).
     */
    private String genre;
    
    /**
     * Plataformas onde o jogo está disponível (ex: PC, PlayStation, Xbox).
     */
    private String platforms;
    
    /**
     * Pontuação/avaliação do jogo.
     */
    private Double score;
    
    /**
     * URL da imagem de capa do jogo.
     */
    private String imgUrl;

    /**
     * Descrição curta do jogo.
     * Armazenada como TEXT no banco de dados para permitir textos longos.
     */
    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    /**
     * Descrição detalhada do jogo.
     * Armazenada como TEXT no banco de dados para permitir textos longos.
     */
    @Column(columnDefinition = "TEXT")
    private String longDescription;

    /**
     * Construtor padrão.
     */
    public Game(){
    }

    /**
     * Construtor com todos os parâmetros.
     * 
     * @param id Identificador único do jogo
     * @param title Título do jogo
     * @param year Ano de lançamento
     * @param genre Gênero do jogo
     * @param platforms Plataformas disponíveis
     * @param score Pontuação do jogo
     * @param imgUrl URL da imagem de capa
     * @param shortDescription Descrição curta
     * @param longDescription Descrição detalhada
     */
    public Game(
            Long id, String title, Integer year, String genre, String platforms,Double score, String imgUrl, String shortDescription, String longDescription
    ) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platforms = platforms;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    /**
     * Retorna o identificador único do jogo.
     * 
     * @return O ID do jogo
     */
    public Long getId()
    {
        return id;
    }

    /**
     * Define o identificador único do jogo.
     * 
     * @param id O ID a ser definido
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retorna o título do jogo.
     * 
     * @return O título do jogo
     */
    public String getTitle() {

        return title;
    }

    /**
     * Define o título do jogo.
     * 
     * @param title O título a ser definido
     */
    public void setTitle(String title) {

        this.title = title;
    }

    /**
     * Retorna o ano de lançamento do jogo.
     * 
     * @return O ano de lançamento
     */
    public Integer getYear() {

        return year;
    }

    /**
     * Define o ano de lançamento do jogo.
     * 
     * @param year O ano a ser definido
     */
    public void setYear(Integer year) {

        this.year = year;
    }

    /**
     * Retorna o gênero do jogo.
     * 
     * @return O gênero do jogo
     */
    public String getGenre() {

        return genre;
    }

    /**
     * Define o gênero do jogo.
     * 
     * @param genre O gênero a ser definido
     */
    public void setGenre(String genre) {

        this.genre = genre;
    }

    /**
     * Retorna as plataformas onde o jogo está disponível.
     * 
     * @return As plataformas do jogo
     */
    public String getPlatforms() {

        return platforms;
    }

    /**
     * Define as plataformas onde o jogo está disponível.
     * 
     * @param platforms As plataformas a serem definidas
     */
    public void setPlatform(String platforms) {

        this.platforms = platforms;
    }

    /**
     * Retorna a pontuação do jogo.
     * 
     * @return A pontuação do jogo
     */
    public Double getScore() {

        return score;
    }

    /**
     * Define a pontuação do jogo.
     * 
     * @param score A pontuação a ser definida
     */
    public void setScore(Double score) {

        this.score = score;
    }

    /**
     * Retorna a URL da imagem de capa do jogo.
     * 
     * @return A URL da imagem
     */
    public String getImgUrl() {

        return imgUrl;
    }

    /**
     * Define a URL da imagem de capa do jogo.
     * 
     * @param imgUrl A URL da imagem a ser definida
     */
    public void setImgUrl(String imgUrl) {

        this.imgUrl = imgUrl;
    }

    /**
     * Retorna a descrição curta do jogo.
     * 
     * @return A descrição curta
     */
    public String getShortDescription() {

        return shortDescription;
    }

    /**
     * Define a descrição curta do jogo.
     * 
     * @param shortDescription A descrição curta a ser definida
     */
    public void setShortDescription(String shortDescription) {

        this.shortDescription = shortDescription;
    }

    /**
     * Retorna a descrição detalhada do jogo.
     * 
     * @return A descrição detalhada
     */
    public String getLongDescription() {

        return longDescription;
    }

    /**
     * Define a descrição detalhada do jogo.
     * 
     * @param longDescription A descrição detalhada a ser definida
     */
    public void setLongDescription(String longDescription) {

        this.longDescription = longDescription;
    }

    /**
     * Compara este objeto com outro para verificar igualdade.
     * Dois objetos Game são considerados iguais se tiverem o mesmo id.
     * 
     * @param o O objeto a ser comparado
     * @return true se os objetos forem iguais, false caso contrário
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id);
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
