package dev.java10x.CadastroDeNinjas.Missoes;
import org.springframework.stereotype.Component;

@Component
public class MissoesMapper {
    public MissoesModel map(MissoesDTO missoesDTO){
        MissoesModel missoesModel = new MissoesModel();
        missoesModel.setId(missoesDTO.getId());
        missoesModel.setNome(missoesDTO.getNome());
        missoesModel.setMissaoNome(missoesDTO.getMissaoNome());
        missoesModel.setNivel(missoesDTO.getNivel());
        missoesModel.setRank(missoesDTO.getRank());
        missoesModel.setNinjas(missoesDTO.getNinjas());
        missoesModel.setStatus(missoesDTO.getStatus());
        return missoesModel;
    }
    public MissoesDTO map(MissoesModel missoesModel){
        MissoesDTO missoesDTO = new MissoesDTO();
        missoesDTO.setId(missoesModel.getId());
        missoesDTO.setNome(missoesModel.getNome());
        missoesDTO.setMissaoNome(missoesModel.getMissaoNome());
        missoesDTO.setNivel(missoesModel.getNivel());
        missoesDTO.setRank(missoesModel.getRank());
        missoesDTO.setNinjas(missoesModel.getNinjas());
        missoesDTO.setStatus(missoesModel.getStatus());
        return missoesDTO;
    }

}
