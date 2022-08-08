package com.nidhalteyeb.test.tfj.infrastructure.port.persistence.jpa;

import com.nidhalteyeb.test.tfj.domain.MaterialSize;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "material")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Getter
@Setter
public class DBMaterial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String description;

    private String brand;

    @Column(name = "image_url")
    private String imageUrl;

    private MaterialSize size;

    @Column(name = "rental_duration")
    private int rentalDuration;

    @Column(name = "rental_cost")
    private double rentalCost;

    @Column(name = "replacement_cost")
    private double replacementCost;

    @Column(name = "category_id")
    private int categoryId;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

}
