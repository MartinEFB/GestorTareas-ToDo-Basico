package Services;

import DTOs.TareaDTO;
import Entities.EstadoTarea;
import Entities.EstadoUsuario;
import Entities.Tarea;
import Entities.Usuario;
import Repositories.TareaRespository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@Service
public class TareaServicesImpl implements TareaServices {

    private TareaRespository tareaRespository;

    @Override
    @Transactional
    public Tarea crearTarea(TareaDTO dto) throws Exception {
      if(dto.getTareaNombre().isEmpty()){
          throw new Exception("Escriba un nombre para crear la tarea");
      }

      Tarea tarea = new Tarea();
      tarea.setTareaNombre(dto.getTareaNombre());
      tarea.setTareaDescripcion(dto.getTareaDescripcion());
      tarea.setEstadoTarea(dto.getEstadoTarea());
      tarea.setTareaFechaInicio(Date.from(Instant.now()));
      return tarea;
    }

    @Override
    @Transactional
    public Tarea modificarTarea(TareaDTO dto) throws Exception {
        Tarea tarea = tareaRespository.findById((long)dto.getTareaId()).orElseThrow(()->new Exception("Tarea no encontrada con ID: " + dto.getTareaId()));
        tarea.setTareaNombre(dto.getTareaNombre());
        tarea.setTareaDescripcion(dto.getTareaDescripcion());
        tarea.setEstadoTarea(dto.getEstadoTarea());

        return tareaRespository.save(tarea);
    }

    @Override
    public List<Tarea> listarTareas(Usuario usuario) throws Exception {
        List<Tarea> tareas = tareaRespository.findByUser(usuario);
        return tareas;
    }


    @Override
    @Transactional
    public void cancelarTarea() throws Exception {

    }

    @Override
    @Transactional
    public void finalizarTarea() throws Exception {

    }
}
