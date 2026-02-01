package Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;


@Table(name = "usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Usuario extends Base{

    private String usuarioUserName;
    private String usuarioContrasenia;
    private String usuarioMail;
    private LocalDateTime usuarioFechaInicioVig;
    private LocalDateTime usuarioFechaFinVig;
    private EstadoUsuario estadoUsuario;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_tarea")
    List<Tarea> tareas;

}
