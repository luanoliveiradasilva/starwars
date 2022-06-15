package com.example.app.model

import javax.persistence.*


@Entity(name = "characters")
data class Character(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val idCharacter: Int,

    @Column(name = "name_character")
    val nameOfCharacter: String,

    @Column(name = "age_character")
    val ageOfCharacter: Int,

    @Column(name = "species_character")
    val speciesOfCharacter: String
)
