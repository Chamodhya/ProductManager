package com.example.demo.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;



@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Productid;
    @Column(name="Productname")
    private String Productname;
    @Column(name="created")
    private String created;
    @OneToMany(targetEntity = ProductParam.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "p_fk1",referencedColumnName = "Productid")
    private List<ProductParam> productParams;
    @OneToMany(targetEntity = LifeCycle.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "p_fk2",referencedColumnName = "Productid")
    private List<LifeCycle> lifeCycles;

}
