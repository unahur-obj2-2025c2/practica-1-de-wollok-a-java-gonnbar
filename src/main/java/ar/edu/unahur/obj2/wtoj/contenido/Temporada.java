package ar.edu.unahur.obj2.wtoj.contenido;

import java.util.List;
import java.util.ArrayList;

public class Temporada {
  private final Integer numero; //final -> constante
  private List<Episodio> episodios = new ArrayList<>();

  private Temporada(Integer numero,List<Episodio> episodios){
    this.numero = numero;
    this.episodios = episodios;
  }

  private Temporada(Integer numero){
    this.numero = numero;
  }

  public Integer getNumero(){
    return numero;
  }

  public List<Episodio> getEpisodios(){
    return episodios;
  }

  public void agregarEpisodio(Episodio unEpisodio){
    episodios.add(unEpisodio);
  }

  public Double costo(){
    return episodios.stream().mapToDouble(e->e.getCosto()).average().orElse(0.0); //revisar orElse
  }
}
