public class Main {
    public static void main(String[] args) {
        Fish salmon = new Salmon("Соломон");

        Aquarium aquarium = new Aquarium();
        aquarium.addFish(salmon).addFish(new Ramp("Скот")).addFish(new Urchin("Ёж"));
        System.out.println(aquarium);
        SwimSpeed champ = aquarium.getSwimChampion();
        System.out.println("Самый быстрый пловец:");
        System.out.println(champ);
    }
}
