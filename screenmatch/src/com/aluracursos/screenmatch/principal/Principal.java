package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        var miPelicula = new Pelicula("Encanto",2021);
        miPelicula.setIncluidoEnElPlan(true);
        miPelicula.setDuracionEnMinutos(120);

        var peliculaDeAlex = new Pelicula("Matrix",1999);
        peliculaDeAlex.setDuracionEnMinutos(145);

        var peliculaDeCamila = new Pelicula("El Señor de los anillos",2018);
        peliculaDeCamila.setDuracionEnMinutos(180);

        Serie miSerie = new Serie("gameOfThrones",2023);
        miSerie.setMinutosPorEpisodio(60);
        miSerie.setTemporadas(12);
        miSerie.setEpisodiosPorTemporada(8);


        miPelicula.evalua(3);
        miPelicula.evalua(4);

        //miPelicula.muestraFichaTecnica();
        //miSerie.muestraFichaTecnica();
        //System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        // System.out.println(miPelicula.getSumaDeLasEvaluaciones());

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(miSerie);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(peliculaDeCamila);
        listaDePeliculas.add(peliculaDeAlex);

        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
        System.out.println("La primera pelicula es: " + listaDePeliculas.get(0).getNombre());
        System.out.println(listaDePeliculas.toString());
        System.out.println("toString de la pelicula: " + listaDePeliculas.get(0).toString());


    }
}
