package clases;

/**
 * Representación de una célula unidad anatómica fundamental de todos los
 * organismos vivos.
 *
 * @author Elkin Estiven Gonzalez Cuellar
 */
public abstract class Cell {

    public double size, mass;
    private String adn;
    protected String membrane;
    private boolean growth;

    /**
     * @return Tamaño actual de la celula.
     */
    public double getSize() {
        return size;
    }

    /**
     * @param size Asigna un tamaño a la celula.
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * @return Masa actual de la celula.
     */
    public double getMass() {
        return mass;
    }

    /**
     * @param mass Valor de la masa.
     */
    public void setMass(double mass) {
        this.mass = mass;
    }

    /**
     * @return Cadena de pares de bases quimicas.
     */
    public String getAdn() {
        return adn;
    }

    /**
     * @param adn Información genética.
     */
    public void setAdn(String adn) {
        this.adn = adn;
    }

    /**
     * Metodo encargado de asignar la función expecifica que cumplira la celula.
     */
    public abstract void CellDifferentiation();
    /**
     * Indica que la célula debe esta en fase de latencia o en crecimiento.
     * @param Activate Activa o desactiva el crecimiento.
     */
    public void setGrowth(boolean Activate) {
        this.growth = Activate;
        if (this.growth) {
            System.out.println("Fase 2 : Crecimiento");
            this.mass += 0.0001;

        } else {
            System.out.println("Fase 1 : Latencia");
        }
        
    }
}
