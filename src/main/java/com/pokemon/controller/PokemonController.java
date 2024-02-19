package com.pokemon.controller;

import com.pokemon.dto.PageDto;
import com.pokemon.service.PokemonService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PokemonController {

	@Autowired
	private PokemonService pokemonService;

	@GetMapping("/pokemon")
	@ApiOperation("Realizamos la paginación segun los parametros que vengan en la url el size y page")
	public String getAllPageable(Model model, @RequestParam(defaultValue = "0") int page,
										   @RequestParam(defaultValue = "10") int size) {

		PageDto response = pokemonService.getPagination(size,page*size);
		model.addAttribute("pokemonList",response.pokemonList);
		model.addAttribute("count",response.totalPages);
		model.addAttribute("number",page);
		model.addAttribute("size",size);


		return "pokemon-list";
	}

	@GetMapping("/pagination")
	@ApiOperation("Realizamos la paginación segun los parametros que vengan en la url el size y page")
	public ResponseEntity<PageDto> getAllPageable(@RequestParam(defaultValue = "0") int page,
										 @RequestParam(defaultValue = "10") int size) {

		PageDto response = pokemonService.getPagination(size,page*size);


		return new ResponseEntity<>(response, HttpStatus.OK);
	}



}
