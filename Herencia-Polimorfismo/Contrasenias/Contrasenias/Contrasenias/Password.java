import javax.swing.JOptionPane;

public class Password {
    private int length;
    private String password;

    Password() {
        this.length = 8;
    }
    
    Password(int length) {
        this.length = length;
        password = generatePassword();
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getPassword() {
        return password;
    }

    public String generatePassword() {
        String password = "";
        for (int i = 0; i < length; i++) {
            int ele = ((int) Math.floor(Math.random() * 3));

            if (ele == 0) {
                password += (char) Math.floor(Math.random() * (123-97) + 97);
                // (123-97) + 97 == 26 + 'a' - 26 letras + 97(ASCII del caractér a)
            } 
            else if (ele == 1) {
                 password += (char) Math.floor(Math.random() * (91 - 65) + 65);
                 // (91 - 65) + 65 == 26 + 'A' - 26 letras + 65(ASCII del caractér A)
            } 
            else {
                password += (char) Math.floor(Math.random() * (58 - 48) + 48);
                // (58 - 48) + 48) == 10 + '0' - 10 dígitos + 48(ASCII del caractér 0)
            }
        }
        return password;
        
    }

    public boolean isStrong() {
        int countNums = 0;
        int countMin = 0;
        int countMay = 0;
        
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 97 && password.charAt(i) <= 122) {
                countMay+=1;
            } else if(password.charAt(i) >= 65 && password.charAt(i) <= 90) {
                countMin+=1;
            } else {
                countNums+=1;
            }
        }

        if (countNums >= 5 && countMin >= 1 && countMay >= 2) {
            return true;
        } else {
            return false;
        }
    }
}

class Main {
    public static void main(String[] args) {
        int us = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la cantidad de contraseñas a generar"));
        int len = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la longitud de las contraseñas"));

        Password passwords[] = new Password[us];
        boolean strongPassword[] = new boolean[us];

        for (int i = 0; i < passwords.length; i++) {
            passwords[i] = new Password(len);
            strongPassword[i] = passwords[i].isStrong();
            System.out.println(passwords[i].getPassword() + " " + strongPassword[i]);
        }
    }
}
