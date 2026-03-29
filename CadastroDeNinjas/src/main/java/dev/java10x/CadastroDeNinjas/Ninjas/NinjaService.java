package dev.java10x.CadastroDeNinjas.Ninjas;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService{
        //injeção de dependência do repository
      // @Autowired é uma anotação do Spring que permite a injeção automática de dependências.

        private NinjaRepository ninjaRepository;
        public NinjaService(NinjaRepository ninjaRepository){
            this.ninjaRepository = ninjaRepository;
        }
        //listar todos os meus ninjas
        public List<NinjaModel> listarNinjas(){
            return ninjaRepository.findAll();
        }
        //listar by id
        public NinjaModel listarNinjaPorId(Long id){
            Optional<NinjaModel> ninjaMoldel = ninjaRepository.findById(id);
            return ninjaMoldel.orElse(null);
        }
        // criar ninja
        public NinjaModel criarNinja(NinjaModel ninja){
            return ninjaRepository.save(ninja);
        }
}
