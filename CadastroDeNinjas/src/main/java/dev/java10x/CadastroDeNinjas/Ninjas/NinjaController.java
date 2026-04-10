package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/ninja")
public class NinjaController {
    private final NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService){
        this.ninjaService = ninjaService;
    }
    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Boas vindas, essa é minha primeira mensagem";
    }

    // add ninja
    @PostMapping("/add")
    public ResponseEntity<String> criarNinja (@RequestBody NinjaDTO ninja ) {
        NinjaDTO novoNinja = ninjaService.criarNinja(ninja);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Ninja criado com sucesso: " + novoNinja.getNome()+ "Ninja id : {}"+ novoNinja.getId());
    }
    //list ninjas
    @GetMapping("/all")
    public ResponseEntity<List<NinjaDTO>> mostrarTodosNinjas() {
        List<NinjaDTO> ninjas =  ninjaService.listarNinjas();
        return ResponseEntity.ok(ninjas);
    }
    // shows ninja by id
    @GetMapping("/id")
    public ResponseEntity<?> showNinjaById(Long id) {
        NinjaDTO ninja =  ninjaService.listarNinjaPorId(id);
        if(ninja != null) {
            return ResponseEntity.ok(ninja);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ninja não encontrado: " + id);
        }
    }
    //atualizar
    @PutMapping("/atualizar/{id}")
    public ResponseEntity<String> atualizarNinjaId(Long id, @RequestBody NinjaDTO ninjaAtualizado) {
        if(ninjaService.listarNinjaPorId(id) != null) {
            NinjaDTO novoNinja = ninjaService.alterarNinja(id, ninjaAtualizado);
            return ResponseEntity.ok("Ninja atualizado com sucesso: " + novoNinja.getNome() + "Ninja id : {}" + novoNinja.getId());
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ninja não encontrado: " + id);
        }
    }
    // path variable
    @DeleteMapping("/deletarId/{id}")
    public ResponseEntity<String> deletarId(@PathVariable Long id ) {
        if(ninjaService.listarNinjaPorId(id) != null) {
            ninjaService.deletarNinja(id);
            return ResponseEntity.ok("Ninja deletado com sucesso: " + id);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ninja não encontrado: " + id);
        }
    }
}
