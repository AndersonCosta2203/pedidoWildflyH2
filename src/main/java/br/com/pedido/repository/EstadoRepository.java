package br.com.pedido.repository;

import br.com.pedido.domain.Estado;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class EstadoRepository {

    @PersistenceContext
    EntityManager entityManager;

    public List<Estado> findAll() {
        return entityManager.createQuery("select e from Estado e", Estado.class)
                .getResultList();
    }
}
