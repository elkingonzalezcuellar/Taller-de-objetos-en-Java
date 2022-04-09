package clases;

/**
 * Representación de un semiconductor : elemento que se comporta como un
 * conductor o aislante dependiendo de diversos factores.
 *
 * @author Elkin Estiven Gonzalez Cuellar
 */
public class Semiconductor {

    public double electricConductivity, electricResistance, thermalConductivity;

    /**
     * Elementos de la tabla periodica que se comportan como semiconductores
     */
    private enum element {
        Si, Ge, P, Cd, Al, Ga, B, As, C
    };
    private boolean state;
    /**
     * Numero de electrones en el ultimo nivel de energia.
     */
    private int valenceElectrons;

    /**
     * @return La conductividad electrica
     */
    public double getElectricConductivity() {
        return electricConductivity;
    }

    /**
     * @param electricConductivity Conductivia electrica que se quiere asignar
     */
    public void setElectricConductivity(double electricConductivity) {
        this.electricConductivity = electricConductivity;
    }

    /**
     * @return Estado de conducción o no conducción (aislante).
     */
    public boolean getState() {
        return state;
    }

    /**
     * @param state Asigna como Conductor o no conductor (aislante).
     */
    public void setState(boolean state) {
        this.state = state;
    }
}
