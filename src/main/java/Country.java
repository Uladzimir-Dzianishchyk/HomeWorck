import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlType(propOrder = {"name","square"})
@XmlRootElement
public class Country {
    private String name;
    private int square;

    public Country() {
        population = new ArrayList<>();
        peopleAdd();
    }

    public Country(String name, int square) {
        this.name = name;
        this.square = square;
        population = new ArrayList<People>();
        peopleAdd();
    }

    public String getName() {
        return name;
    }

    public int getSquare() {
        return square;
    }


    public List<People> getPopulation() {
        return population;
    }

    List<People> population;


    public void peopleAdd() {
        for (int i = 0; i < 10; i++) {
            String[] name = {"Антон", "Герман", "Влад", "Майк", "Джек", "Аким", "Вася", "Сева", "Люк"};
            int n = (int) (Math.random() * 9);
            int age = (int) (Math.random() * 100);
            population.add(new People(name[n], age));
        }
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", square=" + square +
                ", population=" + population +
                '}';
    }
}
