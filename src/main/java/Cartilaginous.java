public abstract class Cartilaginous extends Fish {
    public Cartilaginous(String name) {
        super(name);
    }

    @Override
    public String skeleton() {
        return "Хрящевой";
    }
    @Override
    public String type() {
        return "Хордовые";
    }
}
