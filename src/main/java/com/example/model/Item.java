package com.example.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Item {
    @Id
    private long id;

    @NotBlank
    private String name;

    @Min(2021)
    private int yearCreated;

    @Min(1000)
    private float price;

    private int quantity;
    
    private Brand brand;

    public enum Brand {
        Nike("Nike"), Adidas("Addidas"), Gucci("Gucci");
        public String title;
        private Brand(String title){
            this.title = title;
        }
    }
}
