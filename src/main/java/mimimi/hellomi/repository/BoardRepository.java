package mimimi.hellomi.repository;

import mimimi.hellomi.domain.Board;

import java.util.List;

public interface BoardRepository {

    public int insertBoard(Board board);

    public Board selectBoardDetail(Long id);

    public int updateBoard(Board board);

    public int deleteBoard(Long id);

    public List<Board> selectBoardList();

    public int selectBoardTotalCount();
}
