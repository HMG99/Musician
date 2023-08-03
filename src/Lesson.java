public class Lesson {
    public static void main(String[] args) {

        ElectricGuitar eGuitar = new ElectricGuitar("Arsen", "Manukyan", "Electric guitar");
        eGuitar.showInfo();

        Pianist pianist = new Pianist("David", "Hambardzumyan", "Piano");
        pianist.showInfo();

    }
}

abstract class Human {
    private String name;
    private String surname;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}

abstract class Musician extends Human {
    private String instrument;
    public Musician(String name, String surname, String instrument) {
        super(name, surname);
        this.instrument = instrument;
    }

    abstract void showInfo();
}

abstract class Guitar extends Musician {
    private String instrument;

    public Guitar(String name, String surname, String instrument) {
        super(name, surname, instrument);
    }

    abstract void showInfo();

}

class ElectricGuitar extends Guitar {

    public ElectricGuitar(String name, String surname, String instrument) {
        super(name, surname, instrument);
    }

    @Override
    void showInfo() {
        System.out.println("The instrument played by this musician is Electric Guitar");
    }
}

class Pianist extends Musician {

    public Pianist(String name, String surname, String instrument) {
        super(name, surname, instrument);
    }

    @Override
    void showInfo() {
        System.out.println("The instrument played by this musician is Piano");
    }
}