import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@XmlType(propOrder = {"name","massa"},name = "planet")
@XmlRootElement
public class Planet implements Serializable {
    private String name;
    private int massa;

    public Planet() {
        countries = new ArrayList<>();
        countryAdd();
    }

    public Planet(String name, int massa) {
        this.name = name;
        this.massa = massa;
        countries = new ArrayList<>();
        countryAdd();
    }

    public String getName() {
        return name;
    }

    public int getMassa() {
        return massa;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", massa=" + massa +
                ", countries=" + countries +
                '}';
    }

    public List<Country> getCountries() {
        return countries;
    }

    List<Country> countries;



    public void countryAdd() {
        for (int i = 0; i < 10; i++) {
            String[] name = {"Беларусь", "Россия", "Австрия", "Италия", "Норвегия", "Германия", "Литва", "ЮАР", "Бразилия"};
            int n = (int) (Math.random() * 9);
            int square = (int) (1000 + Math.random() * 1000000000);
            countries.add(new Country(name[n], square));
        }
    }
}

