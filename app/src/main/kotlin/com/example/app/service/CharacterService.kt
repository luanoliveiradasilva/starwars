package com.example.app.service

import com.example.app.model.Character
import com.example.app.repository.CharacterRepository
import org.springframework.stereotype.Service

@Service
class CharacterService(
    private val characterRepository: CharacterRepository
){
    fun createCharacter(character: Character){
        characterRepository.save(character)
    }

    fun findAll(): List<Character> {
        return characterRepository.findAll()
    }
//
//    fun findById(idCharacter: Int): Character{
//
//    }
//
//    fun updateCharacter(character: Character){
//
//    }
//
//    fun delete(idCharacter: Int){
//
//    }
}