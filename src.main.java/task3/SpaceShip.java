package task3;

public class SpaceShip {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 100 && (!name.isBlank() || !name.equals(""))) {
            this.name = name;
        }
        getName();
    }
    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();
        ship.setName("Walker");
        System.out.println(ship.getName());

        ship.setName("");
        System.out.println(ship.getName());

        ship.setName("Voyager ".repeat(100));
        System.out.println(ship.getName());
    }
}