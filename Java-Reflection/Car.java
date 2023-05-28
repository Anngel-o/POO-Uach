class Car {
    private Car() {
        this.name = " ";
        this.year = 0;
    }

    private Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    private String name;
    private int year;

    private void getCarInfo() {
        System.out.println(name + ", modelo " + year + ".");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
