package com.example.advquerying.repositories;

import com.example.advquerying.entities.Label;
import com.example.advquerying.entities.Shampoo;
import com.example.advquerying.entities.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ShampooRepository extends JpaRepository<Shampoo, Long> {
    List<Shampoo> findByBrand(String brand);
    List<Shampoo> findByBrandAndSize(String brand, Size size);
    List<Shampoo> findBySizeOrderByPriceAsc(Size size);
    List<Shampoo> findByLabelOrSize(Label label, Size size);
    List<Shampoo> findBySizeOrLabel(Size size, Label label);
    List<Shampoo> findByLabelTitleContaining(String title);

    @Query
    List<Shampoo> findBySizeAndLabel(Size size, Label label);
}
