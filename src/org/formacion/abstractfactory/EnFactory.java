package org.formacion.abstractfactory;

public class EnFactory implements LenguajeFactory{

    @Override
    public Preguntas createPreguntas() {
        return new PreguntasEn();
    }

    @Override
    public Saludos createSaludos() {
        return new SaludosEn();
    }
}
