package fr.cch.blagues_carambar.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Entity
@Table(name = "blagues")
public class Blagues {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "content")
    private String content;

    public Blagues(String content) {
        this.content = content;
    }

    public Blagues() {
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Blagues{" +
                "id=" + id +
                ", blague='" + content + '\'' +
                '}';
    }
}
