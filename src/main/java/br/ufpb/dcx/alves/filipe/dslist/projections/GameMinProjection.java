package br.ufpb.dcx.alves.filipe.dslist.projections;

public interface GameMinProjection {

    //Métodos get correspondentes a consulta SQL

    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();



}
