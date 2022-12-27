package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="ProductTemplate")
public class ProductTemplate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ProductTemplateid;
    @Column(name = "type")
    private String type;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "pt_fk1",referencedColumnName = "ProductTemplateid")
    private List<Product> product;
    @OneToMany(targetEntity = TemplateParam.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "pt_fk2",referencedColumnName = "ProductTemplateid")
    private List<TemplateParam> templateParams;

}

