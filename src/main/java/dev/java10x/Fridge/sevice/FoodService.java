package dev.java10x.Fridge.sevice;

import dev.java10x.Fridge.model.Food;
import dev.java10x.Fridge.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    //LISTAR
    public List<Food> getAll() {
        return foodRepository.findAll();
    }

    //CRIAR
    public Food save(Food food) {
        return foodRepository.save(food);
    }

    //DElETAR
    public void delete(Long id) {
        foodRepository.deleteById(id);
    }
}
