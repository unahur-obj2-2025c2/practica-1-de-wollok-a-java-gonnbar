package ar.edu.unahur.obj2.wtoj.contenido;

public class Idra {
  private static Idra instance = new Idra(); 

  private Idra(){ //constructor anulado
    
  }

  private Double valor = 0.5;

  public Double getValor(){ //getter
    return valor;
  }

  public void getValor(Double valor){ //setter
    this.valor = valor;
  }

  public static Idra getInstance(){
    return instance;
  }
}
