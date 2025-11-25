package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;
//abstração para lidar com banco de dados jpa // query
public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {

}
