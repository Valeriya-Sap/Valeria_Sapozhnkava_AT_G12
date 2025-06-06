package homework.lists_classes;

import java.util.Objects;

public class Bubble {
    private int volume;
    private String name;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bubble(int volume, String name) {
        this.volume = volume;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bubble bubble = (Bubble) o;
        return volume == bubble.volume && Objects.equals(name, bubble.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume, name);
    }

    @Override
    public String toString() {
        return "Bubble{" +
                "volume=" + volume +
                ", name='" + name + '\'' +
                '}';
    }
}
