package step3;

public class Car {
    private final Name name;
    private final Position position;

    public Car(String name) {
        this.name = new Name(name);
        this.position = Position.zeroPosition();
    }

    public void move(CarEngine carEngine) {
        if (carEngine.canGetPower()) {
            position.forwardOnce();
        }
    }

    public int getPosition() {
        return position.getPosition();
    }
}
