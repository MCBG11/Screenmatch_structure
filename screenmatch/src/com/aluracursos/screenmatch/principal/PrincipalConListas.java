package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalConListas {
    public static void main(String[] args) {

        var miPelicula = new Pelicula("Encanto",2021);
        miPelicula.evalua(9);
        var peliculaDeAlex = new Pelicula("Matrix",1999);
        peliculaDeAlex.evalua(6);
        var peliculaDeCamila = new Pelicula("El Señor de los anillos",2018);
        peliculaDeCamila.evalua(10);
        Serie miSerie = new Serie("gameOfThrones",2023);
        miSerie.evalua(20);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(peliculaDeCamila);
        lista.add(peliculaDeAlex);
        lista.add(miSerie);

        for (Titulo item: lista){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2){
                System.out.println(pelicula.getClasificacion());
            }
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Daren Rodriguez");
        listaDeArtistas.add("Jeson Valencia");
        listaDeArtistas.add("Camilo Mejia");

        Collections.sort(listaDeArtistas);
        System.out.println("lista de artistas ordenada: "+ listaDeArtistas);

        Collections.sort(lista);
        System.out.println("lista de artistas ordenada: " + lista);

        //si quisiera comparar otros elementos de "lista" que no sea el nombre sin afectar los parametros dados en titulo de get.nombre por get.fechadelanzamient
        //lo que debemos hacer es

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("lista ordenada por fecha de lanzamiento: " + lista);
    }
}
