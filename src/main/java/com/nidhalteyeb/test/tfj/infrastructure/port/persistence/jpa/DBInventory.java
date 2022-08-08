package com.nidhalteyeb.test.tfj.infrastructure.port.persistence.jpa;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "inventory")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Getter
@Setter
public class DBInventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "material_id")
    private Integer materialId;

    @Column(name = "shop_id")
    private Integer shopId;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

}
