package com.annodocs.annodocsbackend.annotation.types;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
public class FormField {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "formgroup_id", nullable = false)
    private FormGroup formGroup;

    @Setter
    @Getter
    private String fieldName;

    @Setter
    @Getter
    private String fieldType;

    @Setter
    @Getter
    private String fieldValue;
}
