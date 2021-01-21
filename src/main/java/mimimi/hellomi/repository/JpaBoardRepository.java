package mimimi.hellomi.repository;

import mimimi.hellomi.domain.Board;

import javax.persistence.EntityManager;
import java.util.List;

public class JpaBoardRepository implements BoardRepository{

    private final EntityManager em;

    public JpaBoardRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public int insertBoard(Board board) {
        return 0;
    }

    @Override
    public Board selectBoardDetail(Long id) {
        return null;
    }

    @Override
    public int updateBoard(Board board) {
        return 0;
    }

    @Override
    public int deleteBoard(Long id) {
        return 0;
    }

    @Override
    public List<Board> selectBoardList() {
        return null;
    }

    @Override
    public int selectBoardTotalCount() {
        return 0;
    }
}
