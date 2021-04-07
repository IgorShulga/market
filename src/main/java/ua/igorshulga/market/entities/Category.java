package ua.igorshulga.market.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 64, nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "section_id", referencedColumnName = "id", nullable = false)
    private Section section;
}

//    MILK_FOOD, EGGS, CHEESE, MEAT, MEAT_PRODUCTS, VEGETABLE_OIL,
//    FRUITS, DRIED_FRUITS, NUTS, VEGETABLES,
//    HONEY, HONEY_PRODUCTS, BERRYS,
//    CANNED_FOOD, //консервы
//    GREENS //зелень