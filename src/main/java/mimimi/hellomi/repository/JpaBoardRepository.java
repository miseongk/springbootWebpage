package mimimi.hellomi.repository;

import mimimi.hellomi.domain.Board;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class JpaBoardRepository implements BoardRepository{

    private final EntityManager em;

    public JpaBoardRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Board save(Board board) {
        em.persist(board);
        return board;
    }

    @Override
    public Optional<Board> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Board> findAll() {
        return null;
    }

    @Override
    public Board update(Board board) {
        return null;
    }

    @Override
    public void delete(Board board) {

    }
}
