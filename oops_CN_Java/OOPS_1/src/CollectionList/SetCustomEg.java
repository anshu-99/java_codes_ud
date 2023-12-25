package CollectionList;

import java.util.Objects;

public class SetCustomEg {
    String name;
    int roll;
    public SetCustomEg(String name, int roll){
        this.name=name;
        this.roll=roll;
    }

    @Override
    public String toString() {
        return "SetCustomEg{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SetCustomEg that)) return false;
        return roll == that.roll;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll);
    }
}
