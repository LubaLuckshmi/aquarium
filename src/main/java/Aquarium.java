import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    private List<Fish> aquarium = new ArrayList<>();
    public Aquarium addFish(Fish someFish) {
        aquarium.add(someFish);
        return this;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("В аквариуме:\n");
        for (Fish fish: aquarium) {
            builder.append(fish)
                    .append("\n");
        }
        return builder.toString();
    }
    public List<SwimSpeed> swimmers(){
        List<SwimSpeed> swimmers = new ArrayList<>();
        for (Fish fish: aquarium) {
            if (fish instanceof SwimSpeed) {
                swimmers.add((SwimSpeed) fish);
            }
        }
        return swimmers;
    }
    public SwimSpeed getSwimChampion(){
        List<SwimSpeed> swimmers = swimmers();
        SwimSpeed champ = swimmers.get(0);
        for (SwimSpeed swimmer: swimmers) {
            if (champ.getSwimSpeed() < swimmer.getSwimSpeed()) {
                champ = swimmer;
            }
        }
        return champ;
    }
}
