package DTOs;

import Entities.EstadoTarea;
import lombok.Data;

@Data
public class TareaDTO {

    private int tareaId;
    private String tareaNombre;
    private String tareaDescripcion;
    private EstadoTarea estadoTarea;
}
