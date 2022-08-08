package com.nidhalteyeb.test.tfj.infrastructure.port.persistence.jpa;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "shop")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Getter
@Setter
public class DBShop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String town;

    @Column(name = "material_id")
    private Integer managerId;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
