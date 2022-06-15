package com.example.app.service

import com.example.app.dto.request.CharacterRequestDto
import com.example.app.model.Character
import com.example.app.repository.CharacterRepository
import org.springframework.stereotype.Service

@Service
class CharacterService(
    private val characterRepository: CharacterRepository
){
    fun createCharacter(character: CharacterRequestDto){

    }

    fun findAll(): List<CharacterRequestDto>{

    }

    fun findById(idCharacter: Int): Character{

    }

    fun updateCharacter(character: Character){

    }

    fun delete(idCharacter: Int){

    }
}