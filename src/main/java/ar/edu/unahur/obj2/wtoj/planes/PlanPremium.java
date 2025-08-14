package ar.edu.unahur.obj2.wtoj.planes;

import ar.edu.unahur.obj2.wtoj.usuario.Usuario;

public class PlanPremium implements PlanSuscribible{
  private Double costoPlan;

  public PlanPremium(Double costoPlan){
    this.costoPlan = costoPlan;
  }

  @Override
  public Double costoPlan(Usuario usuario){
    return costoPlan;
  }
}
