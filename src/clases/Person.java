package clases;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Representación de una persona con algunas de sus caracteristicas.
 *
 * @author Elkin Estiven Gonzalez Cuellar
 */
public class Person {

    public String name, lastName1, lastName2;
    ;
    public Date dateBirth;
    public float height;

    /**
     * Crea una instancia de la clase Person con los datos del estudiante.
     */
    public Person() {
        name = "Elkin";
        lastName1 = "Gonzalez";
        lastName2 = "Cuellar";
        dateBirth = new Date(99,0,8);
        height = 1.75F;
    }

    /**
     * Crean una instancia de la clase Person con los atributos proporcionados
     * por el usuario.
     *
     * @param name nombre de la persona.
     * @param lastName1 primer apellido.
     * @param lastName2 segundo apellido.
     * @param dateBirth fecha de nacimiento.
     * @param heigth altura.
     */
    public Person(String name, String lastName1, String lastName2, Date dateBirth, float heigth) {

        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = heigth;
    }

    /**
     * Obtiene el nombre de un objeto de la clase Person.
     *
     * @return el nombre de la persona.
     */
    public String getName() {
        return name;
    }

    /**
     * Asigna un nombre a un objeto de la clase Person.
     *
     * @param name nombre que se quiere asignar.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return la fecha de nacimiento con el formato por defecto.
     */
    public Date getDateBirth() {
        return dateBirth;
    }

    /**
     * @return la fecha de nacimiento en formato dd/mm/yyyy.
     */
    public String getDateBirthFormat() {
        SimpleDateFormat ChangeFormat = new SimpleDateFormat("dd/mm/yyy");
        String dateBirthFormat = ChangeFormat.format(this.dateBirth);
        return dateBirthFormat;
    }

    /**
     * @param dateBirth fecha de nacimiento.
     */
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    /**
     * @return la altura.
     */
    public float getHeight() {
        return height;
    }

    /**
     * @param height altura que se quiere asignar.
     */
    public void setHeight(float height) {
        this.height = height;
    }

}
