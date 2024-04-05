public class Plane{
    private String name;
    private int weight;
    private int volume;
    private int numberOfPassengers;

    public Plane(String name, int weight, int volume, int numberOfPassengers) {
        this.name = name;
        this.weight = weight;
        this.volume = volume;
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        return "Самолёт: " + name +
                ", вес: " + weight +
                ", вместимость пассажиров: " + volume +
                ", число пассажиров на борту: " + numberOfPassengers+ ".";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}
class PorshnevoyPlane extends Plane{
    public PorshnevoyPlane(String name, int weight, int volume, int numberOfPassengers) {
        super(name, weight, volume, numberOfPassengers);
    }
}
class ReactivniyPlane extends Plane {
    public ReactivniyPlane(String name, int weight, int volume, int numberOfPassengers) {
        super(name, weight, volume, numberOfPassengers);
    }
}
class Businessjet extends Plane {
    public Businessjet(String name, int weight, int volume, int numberOfPassengers) {
        super(name, weight, volume, numberOfPassengers);
    }
}
class Cornhusker extends Plane {
    public Cornhusker(String name, int weight, int volume, int numberOfPassengers) {
        super(name, weight, volume, numberOfPassengers);
    }
}
class Airliner extends Plane {
    public Airliner(String name, int weight, int volume, int numberOfPassengers) {
        super(name, weight, volume, numberOfPassengers);
    }
}
class SportsPlane extends Plane {
    public SportsPlane(String name, int weight, int volume, int numberOfPassengers) {
        super(name, weight, volume, numberOfPassengers);
    }
}
//TODO
// Добавить отличительных признаков наследным классам
// Добавить демонстрационных вариантов в мэин.