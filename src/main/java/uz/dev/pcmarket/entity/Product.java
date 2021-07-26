package uz.dev.pcmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product extends AbsClass {

    @Column(nullable = false)
    private Double price;

    @OneToMany
    private List<Attachment> attachments;

    @ManyToOne
    private Category category;

    private boolean isConfiguration;

    @Column(nullable = false)
    private String warranty;



}
