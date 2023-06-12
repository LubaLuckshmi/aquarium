public class Ramp extends Cartilaginous implements SwimSpeed {
    public Ramp(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return String.format("Скат: %s, Скорость: %d", super.toString(), getSwimSpeed());
    }
    @Override
    public int getSwimSpeed() {
        return 10;
    }
}
