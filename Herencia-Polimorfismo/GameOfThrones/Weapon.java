package GameOfThrones;

public interface Weapon { //arma
    abstract void useWeapon();
}

class Sword implements Weapon{ //espada
    public Sword() {
        
    }

    public void useWeapon() {
        System.out.println("desenfunda su espada y CHISCHASSS");
        System.out.println();
    }

    public String toString() {
        return "Sword";
    }
}
class Axe implements Weapon{ //hacha
    Axe() {
        
    }

    public void useWeapon() {
        System.out.println("saca su hacha y skep skep SKEP");
        System.out.println();
    }

    public String toString() {
        return "Axe";
    }
}
class Knife implements Weapon{ //cuchillo
    Knife() {
        
    }

    public void useWeapon() {
        System.out.println("ataca con el cuchillo y crash CRASH");
        System.out.println();
    }
    
    public String toString() {
        return "Knife";
    }
}
class BowAndArrow implements Weapon{ //arco y flecha
    BowAndArrow() {
        
    }

    public void useWeapon() {
        System.out.println("dispara una flecha y ZIUUU");
        System.out.println();
    } 
    
    public String toString() {
        return "BowAndArrow";
    }
}

class Fire implements Weapon {
    Fire() {
        
    }

    @Override
    public void useWeapon() {
        System.out.println("lanza fuego BZZZ y ARDE el campo");
        System.out.println();
    }
    
    public String toString() {
        return "Fire";
    }
}