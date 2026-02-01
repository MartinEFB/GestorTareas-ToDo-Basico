package Services;


import Entities.Base;
import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends Base, ID extends Serializable> {
    public List<E>findAll()throws Exception;
    public E findById(Long id)throws Exception;
    public E save(E entity)throws Exception;
    public E uptade(Long id, E entity)throws Exception;
    public boolean delete(Long id)throws Exception;
}
