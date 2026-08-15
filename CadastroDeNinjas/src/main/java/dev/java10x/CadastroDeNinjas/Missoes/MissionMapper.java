package dev.java10x.CadastroDeNinjas.Missoes;
import org.springframework.stereotype.Component;

@Component
public class MissionMapper {
    public MissionModel  map(MissionDTO missionDTO){
        MissionModel missionModel = new MissionModel();
        missionModel.setId(missionDTO.getId());
        missionModel.setNome(missionDTO.getNome());
        missionModel.setMissaoNome(missionDTO.getMissaoNome());
        missionModel.setNivel(missionDTO.getNivel());
        missionModel.setRank(missionDTO.getRank());
        missionModel.setNinjas(missionDTO.getNinjas());
        missionModel.setStatus(missionDTO.getStatus());
        return missionModel;
    }
    public MissionDTO map(MissionModel missionModel){
        MissionDTO missionDTO = new MissionDTO();
        missionDTO.setId(missionModel.getId());
        missionDTO.setNome(missionModel.getNome());
        missionDTO.setMissaoNome(missionModel.getMissaoNome());
        missionDTO.setNivel(missionModel.getNivel());
        missionDTO.setRank(missionModel.getRank());
        missionDTO.setNinjas(missionModel.getNinjas());
        missionDTO.setStatus(missionModel.getStatus());
        return missionDTO;
    }

}
