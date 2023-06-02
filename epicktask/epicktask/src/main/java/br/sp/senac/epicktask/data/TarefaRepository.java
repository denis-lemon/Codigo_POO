package br.sp.senac.epicktask.data;
import org.springframework.data.jpa.repository.JpaRepository;

import br.senac.sp.epictask.Model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    
}