package clases;

import java.util.ArrayList;

/**
 * Representación de una fruta con algunas caracteristicas.
 *
 * @author Elkin Estiven Gonzalez Cuellar
 */
public class Fruit {

    public String name, flavor;
    public ArrayList<String> colors = new ArrayList<>();
    private float averageWeight;


    public Fruit(){
  
    }
    /**
     * Crea una instancia de la clase Fruit con los datos que proporcione el
     * usuario.
     *
     * @param name Nombre de la fruta Ejemplo : Manzana
     * @param color color de la fruta
     * @param averageWeight Peso tomado como representante de una lista de datos
     */
    public Fruit(String name, String color, float averageWeight) {

        this.name = name;
        this.colors.add(color);
        this.averageWeight = averageWeight;
    }


    /**
     * @return Una lista con objetos de tipo String que representan los colores
     * añadidos
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * @param color Agrega un color a la lista.
     */
    public void setColor(String name) {
        this.colors.add(name);
    }

}
