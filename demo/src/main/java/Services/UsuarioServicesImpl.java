package Services;

import DTOs.UsuarioDTO;
import Entities.Usuario;
import Repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServicesImpl implements UsuarioServices{

    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario altaUsuario(UsuarioDTO dto) throws Exception {

        return new Usuario();
    }

    @Override
    public Usuario modificarUsuario(UsuarioDTO dto) throws Exception {
        return null;
    }

    @Override
    public boolean deleteUsuario(Long id) throws Exception {
        return false;
    }
}
