package io.github.vinifillos.menu.entity;

import io.github.vinifillos.menu.dto.FoodRequestDTO;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "foods")
@Entity(name = "foods")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {

    public Food(FoodRequestDTO foodRequestDTO) {
        this.title = foodRequestDTO.title();
        this.image = foodRequestDTO.image();
        this.price = foodRequestDTO.price();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;
}
