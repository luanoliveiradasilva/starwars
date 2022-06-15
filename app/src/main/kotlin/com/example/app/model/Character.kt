package com.example.app.model

import javax.persistence.*


@Entity(name = "character")
data class Character(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val idCharacter: Int,

    @Column(name = "name_character")
    val nameOfCharacter: String,

    @Column(name = "age_character")
    val ageOfCharacter: Int,

    @Column(name = "specie_character")
    val speciesOfCharacter: String,

    @ManyToOne
    @JoinColumn(name = "id_planet")
    val idPlanet: Int
)
