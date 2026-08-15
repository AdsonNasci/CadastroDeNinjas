package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

//abstração para lidar com banco de dados jpa // query
public interface MissionRepository extends JpaRepository<MissionModel, Long> {
    List<MissionModel> id(long id);
}
