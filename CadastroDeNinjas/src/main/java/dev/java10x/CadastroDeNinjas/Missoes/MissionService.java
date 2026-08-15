package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class MissionService {
    private final MissionRepository missionRepository;
    private final MissionMapper missionMapper;

    public MissionService(MissionRepository missionRepository, MissionMapper missionMapper){
        this.missionMapper = missionMapper;
        this.missionRepository = missionRepository;
    }
    //ninjas acoplied to mission


    //add mission
    public MissionDTO addMission( MissionDTO missionDTO){
        MissionModel mission = missionMapper.map(missionDTO);
        mission = missionRepository.save(mission);
        return missionMapper.map(mission);
    }

    //delete mission



    //change mission


    //findmission by id
    @GetMapping("listarmissao/{id}")
    MissionDTO findMissionById(Long id) {
        //list all missions
        return null;
    }

}
