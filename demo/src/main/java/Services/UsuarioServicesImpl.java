package Services;


import Repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServicesImpl implements UsuarioServices{

    @Autowired
    private UsuarioRepository usuarioRepository;


}
