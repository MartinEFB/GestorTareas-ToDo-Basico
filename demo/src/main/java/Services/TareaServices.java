package Services;


import DTOs.TareaDTO;
import Entities.Tarea;
import Entities.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TareaServices {
    Tarea crearTarea(TareaDTO dto)throws Exception;
    Tarea modificarTarea(TareaDTO dto)throws Exception;
    List<Tarea> listarTareas(Usuario usuario)throws Exception;
    void cancelarTarea()throws Exception;
    void finalizarTarea()throws Exception;
}
