package org.formacion.abstractfactory;

public class EsFactory implements LenguajeFactory {
    @Override
    public Preguntas createPreguntas() {
        return new PreguntasEs();
    }

    @Override
    public Saludos createSaludos() {
        return new SaludosEs();
    }
}
