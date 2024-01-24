package TesteEnum;

import java.io.Serializable;
import java.util.Objects;

public class FORSER implements Serializable {
    public String name;
    public transient int id;
    public FORSER(String name,int id){
        Objects.requireNonNull(name);
        Objects.requireNonNull(id);
        this.id = id;
        this.name = name;

    }

    @Override
    public String toString() {
        return "FORSER{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
