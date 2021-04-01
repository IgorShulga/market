package ua.igorshulga.market.entities;

import lombok.Data;
import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String login;

    @Column(unique = true, nullable = false, length = 128)
    private String password;

    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY)
    private UserDetails userDetails;

    @OneToMany(mappedBy = "owner", fetch = FetchType.LAZY)
    private Set<Product> products;

    @OneToMany(mappedBy = "seller", fetch = FetchType.LAZY)
    private Set<Order> sales;

//    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
//    private Set<Product> purchases;
}
