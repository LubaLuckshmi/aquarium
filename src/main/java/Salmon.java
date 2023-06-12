public class Salmon extends Bony implements SwimSpeed {
    public Salmon(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return String.format("Лосось: %s, Скорость: %d", super.toString(), getSwimSpeed());
    }

    @Override
    public int getSwimSpeed() {
        return 25;
    }
}
