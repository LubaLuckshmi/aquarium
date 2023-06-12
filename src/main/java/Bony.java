public abstract class Bony extends Fish {
    public Bony(String name){
        super(name);
    }

    @Override
    public String skeleton() {
        return "Костный";
    }
    @Override
    public String type() {
        return "Хордовые";
    }

}
