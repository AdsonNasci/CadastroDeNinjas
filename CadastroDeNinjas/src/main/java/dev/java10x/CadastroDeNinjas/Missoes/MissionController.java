package dev.java10x.CadastroDeNinjas.Missoes;


import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/missoes")
public class MissionController {
    private final MissionService missionService;

    public MissionController(MissionService missionService){
        this.missionService = missionService;
    }

     //add mission
    @PostMapping("/addmissoes")
    public ResponseEntity<String> addMission(@RequestBody MissionDTO mission){
        mission = missionService.addMission(mission);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("missao criada com sucesso :" + mission.toString());
    }
     //delete mission
     //change mission
     //findmission by id
     //list all missions
}
