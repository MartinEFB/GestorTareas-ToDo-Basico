package Services;

import DTOs.UsuarioDTO;
import Entities.Tarea;
import Entities.Usuario;
import org.springframework.stereotype.Service;

@Service
public interface UsuarioServices {
    Usuario altaUsuario(UsuarioDTO dto)throws Exception;
    Usuario modificarUsuario(UsuarioDTO dto)throws Exception;
    boolean deleteUsuario(Long id)throws Exception;

}
