package GameOfThrones;

public abstract class Character {
    Weapon weapon;
    String name;

    public Character(Weapon weapon, String name) {
        this.weapon = weapon;
        this.name = name;
    }

    public void changeWeapon(Weapon weapon) { 
        this.weapon = weapon;
    }

    abstract void figth();

    @Override
    public String toString() {
        return "Character [weapon=" + this.weapon + ", name=" + this.name + "]";
    }
    
}

class Queen extends Character implements Human{
    Queen(Weapon weapon, String name) {
        super(weapon, name);
        System.out.println("La Reyna " + name + "se ha unido a la batalla");
    }

    @Override // sobreescritura
    public void figth() {
        System.out.println("La Reyna " + name + " ataca despiadadamente");
        System.out.print(name + " ");
        weapon.useWeapon();
    }
}

class King extends Character implements Human{
    King(Weapon weapon, String name) {
        super(weapon, name);
        System.out.println("El Rey " + name + " se ha unido a la batalla");
    }

    @Override // sobreescritura
    public void figth() {
        System.out.println("El Rey " + name + " ataca sin piedad");
        System.out.print(name + " ");
        weapon.useWeapon();
    }
}

class Knight extends Character implements Human{
    Knight(Weapon weapon, String name) {
        super(weapon, name);
        System.out.println("El Caballero " + name + " se ha unido a la batalla");
    }

    @Override
    public void figth() {
        System.out.println("El Caballero " + name + " ataca");
        System.out.print(name + " ");
        weapon.useWeapon();
    }
}

class Troll extends Character implements Giant{
    Troll(Weapon weapon, String name) {
        super(weapon, name);
        System.out.println("El Troll " + name + " se ha unido a la batalla");
    }

    @Override
    public void figth() {
        System.out.println("El Troll " + name + " ataca con gran destrucción");
        System.out.print(name + " ");
        weapon.useWeapon();
    }
}

class Dragon extends Character implements Giant{
    Dragon(Weapon weapon, String name) {
        super(weapon, name);
        System.out.println("El Dragon " + name + " se ha unido a la batalla");
    }

    @Override
    void figth() {
        System.out.println("El Dragon " + name + " ataca fuertemente");
        System.out.print(name + " ");
        weapon.useWeapon();
    }
}
