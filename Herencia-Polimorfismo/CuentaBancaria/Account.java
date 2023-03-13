package CuentaBancaria;

public class Account {
    private String owner;
    private double quantity; //duenio, cantidad

    Account(String owner) {
        this.owner = owner;
        this.quantity = 0;
    }
    
    Account(String owner, float quantity) {
        this.owner = owner;
        this.quantity = quantity;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return "Cuenta [dueño = " + owner + ", cantidad = $" + quantity  + "]";
    }

    public void deposit(double quantity) {
        if (quantity > 0) {
            this.quantity += quantity;
        } else {
            
        }   
    }

    public void withdraw(double quantity) {
        double total = this.quantity - quantity;
        
        if (total > 0) {
            this.quantity -= quantity;
        } else {
            this.quantity = 0;
        }
    }
}

class Bank {
    public static void main(String[] args) {
        Account account1 = new Account("Ángel");
        Account account2 = new Account("Mario", 1000);

        account1.deposit(2000);
        account1.withdraw(1000);

        account2.deposit(50);
        account2.withdraw(1200);

        System.out.println(account1.toString());
        System.out.println(account2.toString());
    }
}
