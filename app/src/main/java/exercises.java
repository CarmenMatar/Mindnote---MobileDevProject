import java.util.ArrayList;

public class exercises {

    public Integer id;
    public String name;
    public String Category;
    public String Type;
    public Integer timeNeeded;
    public String Day;
    public ArrayList<String> movement = new ArrayList<String>();

    public exercises() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Integer getTimeNeeded() {
        return timeNeeded;
    }

    public void setTimeNeeded(Integer timeNeeded) {
        this.timeNeeded = timeNeeded;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        Day = day;
    }

    public ArrayList<String> getMovement() {
        return movement;
    }

    public void setMovement(ArrayList<String> movement) {
        this.movement = movement;
    }
}
