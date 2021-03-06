package com.example.app.controller

import com.example.app.dto.request.CharacterRequestDto
import com.example.app.dto.response.CharacterResponseDto
import com.example.app.model.Character
import com.example.app.service.CharacterService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("characters/v1")
class CharacterController(
    val characterService: CharacterService
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createCharacter(@RequestBody character: Character){
        characterService.createCharacter(character)
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun findAll(): List<Character>{
        return characterService.findAll()
    }
//
//    @GetMapping
//    @ResponseStatus(HttpStatus.OK)
//    fun findById(idCharacter: Int): CharacterResponseDto{
//        characterService.findById(idCharacter)
//    }
//
//    @PutMapping
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    fun updateCharacter(idCharacter: Int, character: CharacterRequestDto){
//        characterService.updateCharacter(idCharacter, character)
//    }
//
//    @DeleteMapping
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    fun deleteCharacter(idCharacter: Int){
//        characterService.delete(idCharacter)
//    }

}