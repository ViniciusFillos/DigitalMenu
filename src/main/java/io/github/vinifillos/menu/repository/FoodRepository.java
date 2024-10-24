package io.github.vinifillos.menu.repository;

import io.github.vinifillos.menu.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}