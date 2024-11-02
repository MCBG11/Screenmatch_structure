package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Serie extends Titulo {
    private int temporadas;
    private boolean activa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public Serie(String nombre, int fechaDeLanzamiento) {super(nombre, fechaDeLanzamiento);}

    public int getTemporadas() {return temporadas;}

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getDuracionEnMinutos(){return temporadas * episodiosPorTemporada * minutosPorEpisodio;}

    public String toString(){
        return "Serie: " + this.getNombre() + "(" + this.getFechaDeLanzamiento();
    }

}
