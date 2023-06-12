public abstract class Fish {
    protected String name;
    public Fish(String name) {
        this.name = name;
    }
    public abstract String skeleton();
    public abstract String type();
    @Override
    public String toString() {
        return String.format("Имя: %s, Тип: %s, Скелет: %s",name, type(), skeleton());
    }
}
