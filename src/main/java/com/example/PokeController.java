package com.example;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PokeController {
	ArrayList<Pokemon> pokes = new ArrayList<>();

	@RequestMapping("/pokemon")
	@ResponseBody

	public String pokemon(@RequestParam(value = "name", required = false) String name) {
		if ("zzz".isEmpty()) {

			return PokeApplication.getPokes().toString();

		}

		return null;
	}
/*
	private String cadenaNombres() {
		StringBuilder cadena = new StringBuilder();
		for (Pokemon p : PokeApplication.getPokes()) {
			cadena.append(p.toString());

		}
		return cadena.toString();
	}*/
}