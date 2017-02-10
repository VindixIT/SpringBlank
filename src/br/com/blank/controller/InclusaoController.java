package br.com.blank.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
@ComponentScan(basePackages = "br.com.blank")
public class InclusaoController {

	@GetMapping("/matriz/{sigla}/acao/{tipoAcao}")
	public String montaMatriz(@PathVariable String sigla, @PathVariable String tipoAcao, Model model) {
		
		System.out.println(sigla);
		System.out.println(tipoAcao);
		model.addAttribute("arquivo", tipoAcao);
		return "home";
    	
    }
    
	@GetMapping("/owners/{ownerId}/pets/{petId}")
	public String findPet(

			@MatrixVariable MultiValueMap<String, String> matrixVars,
	        @MatrixVariable(pathVar="petId") MultiValueMap<String, String> petMatrixVars) {

		return "home";
	}
	
}
