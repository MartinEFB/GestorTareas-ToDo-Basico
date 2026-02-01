package Entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Table(name = "tarea")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Tarea extends Base{


    private String tareaNombre;
    private String tareaDescripcion;
    private EstadoTarea estadoTarea;
    private Date tareaFechaInicio;
    private Date tareaFechaFin;


}
