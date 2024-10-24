package io.github.vinifillos.menu.mapper;

import io.github.vinifillos.menu.dto.FoodRequestDTO;
import io.github.vinifillos.menu.dto.FoodResponseDTO;
import io.github.vinifillos.menu.entity.Food;

import java.util.ArrayList;
import java.util.List;

public class FoodMapper {

    public static FoodResponseDTO foodToFoodResponseDto(Food food) {
        return new FoodResponseDTO(food);
    }

    public static List<FoodResponseDTO> foodListToFoodResponseDTOList(List<Food> foodList) {
        List<FoodResponseDTO> foodResponseDTOList= new ArrayList<>();
        for(Food food : foodList) {
            foodResponseDTOList.add(new FoodResponseDTO(food));
        }
        return foodResponseDTOList;
    }

    public static Food foodRequestDTOtoFood(FoodRequestDTO foodRequestDTO) {
        return new Food(foodRequestDTO);
    }
}
