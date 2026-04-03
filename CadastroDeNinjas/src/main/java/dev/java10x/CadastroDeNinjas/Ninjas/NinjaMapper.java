package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {
    //relção do dto com a entity
    public NinjaModel map(NinjaDTO ninjaDTO){
        NinjaModel ninjaModel = new NinjaModel();
        ninjaModel.setId(ninjaDTO.getId());
        ninjaModel.setNome(ninjaDTO.getNome());
        ninjaModel.setEmail(ninjaDTO.getEmail());
        ninjaModel.setIdade(ninjaModel.getIdade());
        ninjaModel.setImgUrl(ninjaDTO.getImg_url());
        ninjaModel.setMissoes(ninjaDTO.getMissoes());
        ninjaModel.setRank(ninjaDTO.getRank());
        return ninjaModel;
    }
    public NinjaDTO map(NinjaModel ninjaModel){
        NinjaDTO ninjaDTO = new NinjaDTO();
        ninjaDTO.setId(ninjaDTO.getId());
        ninjaDTO.setNome(ninjaDTO.getNome());
        ninjaDTO.setEmail(ninjaDTO.getEmail());
        ninjaDTO.setIdade(ninjaDTO.getIdade());
        ninjaDTO.setImg_url(ninjaDTO.getImg_url());
        ninjaDTO.setMissoes(ninjaDTO.getMissoes());
        ninjaDTO.setRank(ninjaDTO.getRank());
        return ninjaDTO;
    }
}
