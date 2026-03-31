package dev.java10x.CadastroDeNinjas.Ninjas;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService{
        //injeção de dependência do repository
      // @Autowired é uma anotação do Spring que permite a injeção automática de dependências.

    private NinjaModel ninjaModel;
        private NinjaMapper ninjaMapper;

        public NinjaService(NinjaMapper NinjaMapper, NinjaMapper ninjaMapperr){
            this.ninjaMapper = ninjaMapper;
            this.ninjaModel = ninjaModel;
        }
        //listar todos os meus ninjas
        public List<NinjaMapper> listarNinjas(){
            return ninjaRepository.findAll();
        }
        //listar by id
        public NinjaDTO listarNinjaPorId(Long id){
            Optional<NinjaDTO> ninjaDTO = ninjaMapper.findById(id).map(ninjaMapper::map);
            return ninjaDTO.orElse(null);
        }
        // criar ninja
        public NinjaMapper criarNinja(NinjaDtO ninjaDTO){

            return ninjaRepository.save(ninja);
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
