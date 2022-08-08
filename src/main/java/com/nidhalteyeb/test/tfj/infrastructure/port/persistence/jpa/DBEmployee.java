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
public class DBEmployee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "image_url")
    private String imageUrl;

    private String email;

    private String login;

    private String password;

    private boolean active;

    @Column(name = "shop_id")
    private int shopId;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
