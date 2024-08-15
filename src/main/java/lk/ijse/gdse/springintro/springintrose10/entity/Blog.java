package lk.ijse.gdse.springintro.springintrose10.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Blog {
    @Id
    private int id = 20;
    private String title = "Spring Boot";
    private String body = "Spring Boot is a powerful framework for building web applications.";

}

