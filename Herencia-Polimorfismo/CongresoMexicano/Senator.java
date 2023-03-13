package CongresoMexicano;

public class Senator extends Legislator{
    int seatNumber;

    Senator() {

    }

    Senator(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String getWorkingChamber() {
        return "Cámara de senadores";
    }

    public String toString() {
        String info = (getName() + " " + getLastName() + ", " + getAge() + " años" + ", " + getMar() + ", partido "
        + getPoliticalParty() + ", " + getProvinceThatRepresent() + ", despacho " + getDispatchNumber()
        + ", asiento " + seatNumber + ". ");
        return info;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
    
}
