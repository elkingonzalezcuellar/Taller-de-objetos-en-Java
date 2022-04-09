package clases;

/**
 * Representación de una cuenta de banco.
 * @author Elkin Estiven Gonzalez Cuellar
 */
public class BankAccount {

    private  int accountNumber;
    protected boolean activated;

    public BankAccount(int accountNumber, boolean activate) {
        this.accountNumber = accountNumber;
        this.activated = activate;
    }

    /**
     * @return Si esta activada o no la cuenta.
     */
    public boolean getActivated() {
        return activated;
    }

    /**
     * @param activated Activa o desactiva la cuenta.
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
