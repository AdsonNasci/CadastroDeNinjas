package dev.java10x.CadastroDeNinjas.Ninjas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
