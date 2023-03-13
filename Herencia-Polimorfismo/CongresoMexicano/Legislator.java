package CongresoMexicano;

public abstract class Legislator extends Person{
    private String politicalParty; //partido político
    private String provinceThatRepresent; //privincia que representa
    private String dispatchNumber; //número de despacho

    Legislator() {

    }

    Legislator(String politicalParty, String provinceThatRepresent, String dispatchNumber) {
        this.politicalParty = politicalParty;
        this.provinceThatRepresent = provinceThatRepresent;
        this.dispatchNumber = dispatchNumber;
    }

    public abstract String getWorkingChamber();

    public String toString () {
        String info = (getName() + " " + getLastName() + ", " + getAge() + " años" + ", " + getMar() + ", partido " + politicalParty + ", " + provinceThatRepresent + ", despacho " + dispatchNumber);
        return info;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        this.politicalParty = politicalParty;
    }

    public String getProvinceThatRepresent() {
        return provinceThatRepresent;
    }

    public void setProvinceThatRepresent(String provinceThatRepresent) {
        this.provinceThatRepresent = provinceThatRepresent;
    }

    public String getDispatchNumber() {
        return dispatchNumber;
    }

    public void setDispatchNumber(String dispatchNumber) {
        this.dispatchNumber = dispatchNumber;
    }

}
