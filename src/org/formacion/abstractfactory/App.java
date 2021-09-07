package org.formacion.abstractfactory;

public class App {

    private final LenguajeFactory esFactory;
    private final LenguajeFactory enFactory;

    public App(){
        esFactory = FactoryMaker.makeFactory(FactoryMaker.CodLenguaje.ES);
        enFactory = FactoryMaker.makeFactory(FactoryMaker.CodLenguaje.EN);
    }


    public void multiIdioma(){
      Preguntas preguntasEs = esFactory.createPreguntas();
      Saludos saludosEs = esFactory.createSaludos();

      System.out.println(preguntasEs.preguntaHora());
      System.out.println(preguntasEs.preguntaTiempo());
      System.out.println(saludosEs.buenosDias());
      System.out.println(saludosEs.buenasTardes());

      Preguntas preguntasEn = enFactory.createPreguntas();
      Saludos saludosEn = enFactory.createSaludos();

      System.out.println(preguntasEn.preguntaHora());
      System.out.println(preguntasEn.preguntaTiempo());
      System.out.println(saludosEn.buenosDias());
      System.out.println(saludosEn.buenasTardes());


    }


}
