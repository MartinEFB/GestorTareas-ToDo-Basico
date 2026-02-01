package Services;

import Entities.Base;
import Repositories.BaseRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl <E extends Base, ID extends Serializable> implements BaseService<E,ID> {

    @Autowired
    protected BaseRepository<E,ID> baseRepository;

    public BaseServiceImpl(BaseRepository<E, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    @Transactional
    public List<E> findAll() throws Exception {
        try {
            List<E> entities = baseRepository.findAll();
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


    @Override
    @Transactional
    public E findById(Long id) throws Exception {
        try {
            Optional<E> entityOptional = baseRepository.findById((ID) id);
            return entityOptional.get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    @Transactional
    public E save(E entity) throws Exception {
        try {
           entity = baseRepository.save(entity);
            return entity;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public E uptade(Long id, E entity) throws Exception {
        try {
            Optional<E> entityOptional = baseRepository.findById((ID)id);
            entity = entityOptional.get();
            entity = baseRepository.save(entity);
            return entity;
            } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    @Transactional
    public void delete(Long id) {
        if (!baseRepository.existsById((ID) id)) {
            throw new Exception("Entidad no encontrada con ID: " + id);
        }

        baseRepository.deleteById((ID) id);
    }



}
