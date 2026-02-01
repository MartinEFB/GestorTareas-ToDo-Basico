package Services;


import Entities.Tarea;
import Repositories.BaseRepository;
import Repositories.TareaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TareaServicesImpl extends BaseServiceImpl<Tarea,Long>{

    @Autowired
    private TareaRespository tareaRespository;

    public TareaServicesImpl(BaseRepository<Tarea,Long> baseRepository){
        super(baseRepository);
    }


}
