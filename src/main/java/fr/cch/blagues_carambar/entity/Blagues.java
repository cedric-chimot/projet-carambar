package fr.cch.blagues_carambar.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "blagues")
public class Blagues {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_blague")
    private Long id;

    @Column(name = "blague")
    private String blague;

    @Override
    public String toString() {
        return "Blagues{" +
                "id=" + id +
                ", blague='" + blague + '\'' +
                '}';
    }
}
