package dev.java10x.CadastroDeNinjas.Ninjas;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NinjaService{
    private  NinjaRepository ninjaRepository;
    private  NinjaMapper ninjaMapper;
    //injeção de dependência do repository
      // @Autowired é uma anotação do Spring que permite a injeção automática de dependências.

        public NinjaService(NinjaMapper ninjaMapper, NinjaRepository ninjaRepository){
            this.ninjaMapper = ninjaMapper;
            this.ninjaRepository = ninjaRepository;
        }

    //listar todos os meus ninjas
    public List<NinjaDTO> listarNinjas() {
        List<NinjaModel> ninjas =  ninjaRepository.findAll();
        return ninjas.stream()
                .map(ninjaMapper::map)
        .collect(Collectors.toList());
    }
        //listar by id
        public NinjaDTO listarNinjaPorId(Long id){
            Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
            return  ninjaPorId.map(ninjaMapper::map).orElse(null);
        }
        // criar ninja
        public NinjaDTO criarNinja(NinjaDTO ninjaDTO){
            NinjaModel ninja = ninjaMapper.map(ninjaDTO);
            ninja = ninjaRepository.save(ninja);
            return ninjaMapper.map(ninja);
        }

        //deletar ninja não precisa de dto
        public void deletarNinja(Long id){
            ninjaRepository.deleteById(id);
        }

        public NinjaDTO alterarNinja(@PathVariable Long id, NinjaDTO ninjaDTO) {
            Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
            if(ninjaPorId.isPresent()){
                NinjaModel ninjaAtualizado = ninjaMapper.map(ninjaDTO);
                ninjaAtualizado.setId(id);
                NinjaModel ninjaSalvo = ninjaRepository.save(ninjaAtualizado);
                return ninjaMapper.map(ninjaSalvo);
            }
            return null;
        }
}
