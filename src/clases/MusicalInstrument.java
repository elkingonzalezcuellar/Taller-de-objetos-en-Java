package clases;

/**
 * Representación de un Instrumento musical
 * @author Elkin Estiven Gonzalez Cuellar
 */
public abstract class MusicalInstrument {

    public String name, material;
    protected String classification;

    /**
     * @return Nombre del instrumento Ejemplo : Guitarra
     */
    public String getName() {
        return name;
    }

    /**
     * @param name Asigna  el nombre.
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * @param classification the classification to set
     */
    public void setClassification(String classification) {
        this.classification = classification;
    }
    /**
     * Metodo encargado de asignar el sonido dependiendo del instrumento.
     */
    public abstract void Sound();
    /**
     * Metodo Tocar instrumento,imprime notas musicales.
     */
    public void play() {
        System.out.println("Do Re Mi Fa Sol La Si");
    }


}
