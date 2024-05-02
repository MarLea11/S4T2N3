package cat.itacademy.barcelonactiva.Pagliaruzza.Marcos.s04.t02.n03.S04T02N03PagliaruzzaMarcos.model.repository;

import cat.itacademy.barcelonactiva.Pagliaruzza.Marcos.s04.t02.n03.S04T02N03PagliaruzzaMarcos.model.domain.Fruit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitRepository extends MongoRepository<Fruit, String> {

}
