package ar.edu.unahur.obj2.wtoj.planes;

import ar.edu.unahur.obj2.wtoj.usuario.Usuario;
import java.util.List;
import ar.edu.unahur.obj2.wtoj.contenido.Contenido;
public class PlanBasico implements PlanSuscribible{
  private Integer limite;
  private Double costoBase;

  public PlanBasico(Integer limite, Double costoBase){
    this.limite = limite;
    this.costoBase = costoBase;
  }

  @Override
    public Double costoPlan(Usuario usuario){
      List<Contenido> contenidousuario = usuario.getContenidos();
      List<Contenido> excedentes = contenidousuario.subList(limite,contenidousuario.size()); //a incluye, b no incluye

      if(limite >= contenidousuario.size()){
        return costoBase;
      }
      else{
        return costoBase + excedentes.stream().mapToDouble(e->e.costo()).sum();
      }
    }
}
