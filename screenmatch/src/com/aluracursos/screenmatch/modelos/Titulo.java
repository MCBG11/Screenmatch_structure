package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Titulo implements Comparable<Titulo> {
        private String nombre;
        private int fechaDeLanzamiento;
        private int duracionEnMinutos;
        private boolean incluidoEnElPlan;
        private double sumaDeLasEvaluaciones;
        private int totalDeLasEvaluaciones;

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public String getNombre() {
            return nombre;
        }

    public int getFechaDeLanzamiento() {
            return fechaDeLanzamiento;
        }

    public boolean isIncluidoEnElPlan() {return incluidoEnElPlan;}

    public int getDuracionEnMinutos() {
            return duracionEnMinutos;
        }

    public void setNombre(String nombre) {
            this.nombre = nombre;
        }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
            this.fechaDeLanzamiento = fechaDeLanzamiento;
        }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
            this.duracionEnMinutos = duracionEnMinutos;
        }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
            this.incluidoEnElPlan = incluidoEnElPlan;
        }

    public void muestraFichaTecnica(){
            System.out.println("Nombre de la película : " + nombre);
            System.out.println("Fecha de lanzamiento : "+ fechaDeLanzamiento);
            System.out.println("Duración en minutos :" + getDuracionEnMinutos());
        }

    public void evalua(double nota){
            sumaDeLasEvaluaciones += nota;
            totalDeLasEvaluaciones ++;
        }

    double calculaMedia(){return sumaDeLasEvaluaciones/totalDeLasEvaluaciones;}

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }
}
