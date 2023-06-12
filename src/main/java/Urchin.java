public class Urchin extends Echinoderms implements SwimSpeed{

    public Urchin(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return String.format("Морской ёж: %s, Скорость: %d", super.toString(), getSwimSpeed());
    }

    @Override
    public int getSwimSpeed() {
        return 0;
    }
}
