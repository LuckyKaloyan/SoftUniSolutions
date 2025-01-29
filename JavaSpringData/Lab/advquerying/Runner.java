package com.example.advquerying;

import com.example.advquerying.entities.Ingredient;
import com.example.advquerying.entities.Label;
import com.example.advquerying.entities.Shampoo;
import com.example.advquerying.entities.Size;
import com.example.advquerying.repositories.IngredientRepository;
import com.example.advquerying.repositories.LabelRepository;
import com.example.advquerying.repositories.ShampooRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;


@Component
public class Runner implements CommandLineRunner {
    private final ShampooRepository shampooRepository;
    private final LabelRepository labelRepository;
    private final IngredientRepository ingredientRepository;

    public Runner(ShampooRepository shampooRepository, LabelRepository labelRepository, IngredientRepository ingredientRepository) {

        this.shampooRepository = shampooRepository;
        this.labelRepository = labelRepository;
        this.ingredientRepository = ingredientRepository;

    }


    @Override
    public void run(String... args) {


        List<Shampoo> shampoos = shampooRepository.findByIngredientsCountLessThan(3);

        shampoos.forEach(shampoo -> System.out.println(shampoo.getLabel().getTitle()));
    }
}
