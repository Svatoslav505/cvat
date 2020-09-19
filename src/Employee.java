class Employee extends Dog {
    private String playground;

    public Employee(String name, String breed, String playground) {
        super(name, breed);
        this.playground = playground;
    }

    public void displayInfo() {
        System.out.println("Имя: " + super.getName() + " Порода: "
                + super.getBreed() + " Номер площадки: " + playground);
    }
}
