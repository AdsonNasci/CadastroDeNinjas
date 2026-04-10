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
        ninjaModel.setIdade(ninjaDTO.getIdade());
        ninjaModel.setImgUrl(ninjaDTO.getImg_url());
        // missoes is set in service
        ninjaModel.setRank(ninjaDTO.getRank());
        return ninjaModel;
    }
    public NinjaDTO map(NinjaModel ninjaModel){
        NinjaDTO ninjaDTO = new NinjaDTO();
        ninjaDTO.setId(ninjaModel.getId());
        ninjaDTO.setNome(ninjaModel.getNome());
        ninjaDTO.setEmail(ninjaModel.getEmail());
        ninjaDTO.setIdade(ninjaModel.getIdade());
        ninjaDTO.setImg_url(ninjaModel.getImgUrl());
        ninjaDTO.setMissoesId(ninjaModel.getMissoes() != null ? ninjaModel.getMissoes().getId() : null);
        ninjaDTO.setRank(ninjaModel.getRank());
        return ninjaDTO;
    }
}
