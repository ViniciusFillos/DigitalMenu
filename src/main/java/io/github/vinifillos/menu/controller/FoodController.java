package io.github.vinifillos.menu.controller;

import io.github.vinifillos.menu.dto.FoodRequestDTO;
import io.github.vinifillos.menu.dto.FoodResponseDTO;
import io.github.vinifillos.menu.entity.Food;
import io.github.vinifillos.menu.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
@RequiredArgsConstructor
public class FoodController {

    private final FoodService foodService;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public FoodResponseDTO saveFood(@RequestBody FoodRequestDTO foodRequestDTO) {
        return foodService.save(foodRequestDTO);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDTO> getAll() {
        return foodService.findAll();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/{id}")
    public void deleteFood(@PathVariable Long id) {
        foodService.delete(id);
    }
}
