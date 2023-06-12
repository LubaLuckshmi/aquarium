public abstract class Echinoderms extends Fish {
    public Echinoderms(String name) {
        super(name);
    }

    @Override
    public String skeleton() {
        return "Известковый";
    }

    @Override
    public String type() {
        return "Иглокожие";
    }
}
