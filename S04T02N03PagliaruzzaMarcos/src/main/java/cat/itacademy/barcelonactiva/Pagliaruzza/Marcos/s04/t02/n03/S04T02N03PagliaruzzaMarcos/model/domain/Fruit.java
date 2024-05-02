package cat.itacademy.barcelonactiva.Pagliaruzza.Marcos.s04.t02.n03.S04T02N03PagliaruzzaMarcos.model.domain;


import jakarta.persistence.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "fruit")
public class Fruit {

    @Id
    private String idFruit;
    private String name;
    private double quantityKg;

    public Fruit() {
    }

    public Fruit(String name, double quantityKg) {
        this.name = name;
        this.quantityKg = quantityKg;
    }

    public String getId() {
        return idFruit;
    }

    public void setId(String idFruit) {
        this.idFruit = idFruit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantityKg() {
        return quantityKg;
    }

    public void setQuantityKg(double quantityKg) {
        this.quantityKg = quantityKg;
    }
}
