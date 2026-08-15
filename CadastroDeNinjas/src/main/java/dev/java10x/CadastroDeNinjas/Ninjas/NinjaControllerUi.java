package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/ninja/ui")
public class NinjaControllerUi {

    private final NinjaService ninjaService;

    public NinjaControllerUi(NinjaService ninjaService){
        this.ninjaService = ninjaService;
    }
    @GetMapping("/listar")
    public String mostrarTodosNinjas(Model model) {
        List<NinjaDTO> ninjas = ninjaService.listarNinjas();
        model.addAttribute("ninjas", ninjas);
        return "listarNinjas";//tem q retornar o nome da pagina que renderiza
    }
    @GetMapping("/deletarId/{id}")
    public String deletarId(@PathVariable Long id) {
        ninjaService.deletarNinja(id);
        return  "redirect:/ninja/ui/listar"; // Redireciona para a página de listagem após a exclusão
    }
}
