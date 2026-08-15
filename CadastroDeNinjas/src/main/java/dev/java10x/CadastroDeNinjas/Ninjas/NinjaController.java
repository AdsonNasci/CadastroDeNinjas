package dev.java10x.CadastroDeNinjas.Ninjas;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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
    @Operation(summary = "mensagem de boas vindas")
    @GetMapping(    "/boasvindas")
    public String boasVindas() {
        return "Boas vindas, essa é minha primeira mensagem";
    }

    // add ninja
    @Operation(summary = "Criar um novo ninja", description = "Cria um novo ninja com os dados fornecidos")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Ninja criado com sucesso"),
            @ApiResponse(responseCode = "400", description = "Requisição inválida"),
            @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    @PostMapping("/add")
    public ResponseEntity<String> criarNinja (@RequestBody NinjaDTO ninja ) {
        NinjaDTO novoNinja = ninjaService.criarNinja(ninja);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Ninja criado com sucesso: " + novoNinja.getNome()+ "Ninja id : "+ novoNinja.getId());
    }
    //list ninjas
    @Operation(summary = "Listar todos os ninjas", description = "Retorna uma lista com todos os ninjas cadastrados")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Lista de ninjas retornada com sucesso"),
            @ApiResponse(responseCode = "500", description = "Erro interno do servidor"),
            @ApiResponse(responseCode = "404", description = "Nenhum ninja encontrado")
    })
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
    public ResponseEntity<String> atualizarNinjaId(
            @Parameter(description = "Usuario manda id "+ "do ninja que deseja atualizar")
            @PathVariable Long id,
            @Parameter(description = "Usuario manda o corpo da requisição com os dados atualizados do ninja")
            @RequestBody NinjaDTO ninjaAtualizado) {
        if(ninjaService.listarNinjaPorId(id) != null) {
            NinjaDTO novoNinja = ninjaService.alterarNinja(id, ninjaAtualizado);
            return ResponseEntity.ok("Ninja atualizado com sucesso: " + novoNinja.getNome() + "Ninja id : " + novoNinja.getId());
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
