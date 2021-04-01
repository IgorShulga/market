package ua.igorshulga.market.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user_details")
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user", referencedColumnName = "id", nullable = false)
    private User user;

    @Column(length = 55)
    private String name;

    @Column(length = 55)
    private String surname;

    @Column(length = 55)
    private String phone;

    @Column(length = 320)
    private String email;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(length = 1000)
    private String description;
}