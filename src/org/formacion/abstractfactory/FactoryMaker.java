package org.formacion.abstractfactory;

public class FactoryMaker {

    public FactoryMaker(){};

    public enum CodLenguaje{
        ES, EN
    }

    public static LenguajeFactory makeFactory(CodLenguaje type){
        switch (type){
            case ES:
                return new EsFactory();
            case EN:
                return new EnFactory();
            default:
                throw new IllegalArgumentException("Code lenguaje not supported");
        }
    }
}
