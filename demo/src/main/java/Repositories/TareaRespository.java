package Repositories;

import Entities.Tarea;
import Entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TareaRespository extends JpaRepository<Tarea,Long> {
    List<Tarea> findByUser(Usuario usuario);
    Optional<Tarea> findById(Long id);
    Tarea save(Tarea tarea);

}
