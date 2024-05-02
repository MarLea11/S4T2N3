package cat.itacademy.barcelonactiva.Pagliaruzza.Marcos.s04.t02.n03.S04T02N03PagliaruzzaMarcos.controller;

import cat.itacademy.barcelonactiva.Pagliaruzza.Marcos.s04.t02.n03.S04T02N03PagliaruzzaMarcos.model.domain.Fruit;
import cat.itacademy.barcelonactiva.Pagliaruzza.Marcos.s04.t02.n03.S04T02N03PagliaruzzaMarcos.model.services.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/fruit")
public class FruitController {

    @Autowired
    private FruitService fruitService;

    @PostMapping("/add")
    public ResponseEntity<Fruit> addFruit(@RequestBody Fruit fruit) {
        Fruit newFruit = fruitService.addFruit(fruit);
        return new ResponseEntity<>(newFruit, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Fruit> updateFruit(@RequestBody Fruit fruit) {
        Fruit fruitUpdate = fruitService.updateFruit(fruit);
        return new ResponseEntity<>(fruitUpdate, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteFruit(@PathVariable String id) {
        fruitService.deleteFruit(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<Fruit> getFruit(@PathVariable String id) {
        Fruit fruit = fruitService.getFruit(id);
        return new ResponseEntity<>(fruit, HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity <List<Fruit>> getAllFruits() {
        List<Fruit> fruits = fruitService.getAllFruits();
        return new ResponseEntity<>(fruits, HttpStatus.OK);
    }

}
