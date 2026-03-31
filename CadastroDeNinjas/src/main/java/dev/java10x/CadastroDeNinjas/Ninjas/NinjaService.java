package dev.java10x.CadastroDeNinjas.Ninjas;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

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
        public List<NinjaModel> listarNinjas(){
            return ninjaRepository.findAll();
        }
        //listar by id
        public NinjaModel listarNinjaPorId(Long id){
            Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
            return ninjaPorId.orElse(null);
        }
        // criar ninja
        public NinjaDTO criarNinja(NinjaDTO ninjaDTO){
            NinjaModel ninja = ninjaMapper.map(ninjaDTO);
            ninja = ninjaRepository.save(ninja);
            return ninjaMapper.map(ninja);
        }

        //deletar ninja
        public void deletarNinja(Long id){
            ninjaRepository.deleteById(id);
        }

        public NinjaModel alterarNinja(@PathVariable Long id, NinjaModel ninjaAtualizado){
            if(ninjaRepository.existsById(id)){
                return ninjaRepository.save(ninjaAtualizado);
            } else {
                return null;
            }
    }
}
