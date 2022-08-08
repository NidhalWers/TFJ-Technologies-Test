package com.nidhalteyeb.test.tfj.infrastructure.port.persistence.jpa;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "category")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Getter
@Setter
public class DBCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
