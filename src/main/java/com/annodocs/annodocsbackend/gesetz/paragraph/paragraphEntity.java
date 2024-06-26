package com.annodocs.annodocsbackend.gesetz.paragraph;

import com.annodocs.annodocsbackend.gesetz.gesetzEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "paragraph")
public class paragraphEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PiD;


    @Setter
    @Getter
    @ManyToOne
    @JoinColumn(name = "GiD", nullable = false)
    private gesetzEntity gesetz;

    @Setter
    @Getter
    private String titel;

    @Setter
    @Getter
    private String paragraph;

    @Setter
    @Getter
    @Column(columnDefinition = "TEXT")
    private String text;

    @Setter
    @Getter
    private String footnotes;

    @Setter
    @Getter
    private String notes;

    @Setter
    @Getter
    private String url;

    public paragraphEntity() {
    }

    public paragraphEntity(gesetzEntity gesetz, String titel, String paragraph, String text, String footnotes, String notes, String url) {
        this.gesetz = gesetz;
        this.titel = titel;
        this.paragraph = paragraph;
        this.text = text;
        this.footnotes = footnotes;
        this.notes = notes;
        this.url = url;
    }

}
