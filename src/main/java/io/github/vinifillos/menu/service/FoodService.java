package io.github.vinifillos.menu.service;

import io.github.vinifillos.menu.dto.FoodRequestDTO;
import io.github.vinifillos.menu.dto.FoodResponseDTO;
import io.github.vinifillos.menu.entity.Food;
import io.github.vinifillos.menu.mapper.FoodMapper;
import io.github.vinifillos.menu.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class FoodService {

    private final FoodRepository foodRepository;

    public List<FoodResponseDTO> findAll() {
        log.info("Finding all foods");
        return FoodMapper.foodListToFoodResponseDTOList(foodRepository.findAll());
    }

    public FoodResponseDTO save(FoodRequestDTO foodRequestDTO) {
        log.info("Saving a food");
        Food food = FoodMapper.foodRequestDTOtoFood(foodRequestDTO);
        foodRepository.save(food);
        return FoodMapper.foodToFoodResponseDto(food);
    }

    public void delete(Long id) {
        log.info("Deleting a food");
        foodRepository.deleteById(id);
    }
}
