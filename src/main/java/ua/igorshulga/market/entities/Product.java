package ua.igorshulga.market.entities;


import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 128, nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category", referencedColumnName = "id", nullable = false)
    private Category category;

    @Column(name = "unit")
    @Enumerated(EnumType.STRING)
    private Unit unit;

    @Column(name = "unit_price")
    private BigDecimal unitPrice;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "owner", referencedColumnName = "id", nullable = false)
    private User owner;

    private String description;
}
