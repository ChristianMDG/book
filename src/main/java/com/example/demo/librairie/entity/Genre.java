package com.example.demo.librairie.entity;

import jakarta.persistence.*;
import java.util.List;
import java.util.UUID;
import lombok.*;

@Entity
@Table(name = "genre")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Genre {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Column(name = "name", length = 100, nullable = false)
  private String name;

  @Column(name = "description", length = 100)
  private String description;

  @ManyToMany(mappedBy = "genres")
  private List<Book> books;
}
