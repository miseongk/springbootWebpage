package mimimi.hellomi.service;

import mimimi.hellomi.domain.Board;
import mimimi.hellomi.repository.MemoryBoardRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class BoardServiceTest {

    BoardService boardService;
    MemoryBoardRepository boardRepository;

    @BeforeEach
    public void beforeEach() {
        boardRepository = new MemoryBoardRepository();
        boardService = new BoardService(boardRepository);
    }

    @AfterEach
    public void afterEach() {
        boardRepository.clearStore();
    }

    @Test
    public void 게시글등록() {
        Board board = new Board();
        board.setContent("내용");

        Long saveId = boardService.insertBoard(board);

        Board findBoard = boardRepository.findById(saveId).get();
        assertThat(board.getId()).isEqualTo(findBoard.getId());
    }

    @Test
    public void 게시글수정() {
        Board board = new Board();
        board.setContent("내용");
        Long saveId = boardService.insertBoard(board);
        String result1 = board.getContent();

        board.setContent("수정");
        Long update = boardService.updateBoard(board);
        String result2 = board.getContent();

        assertThat(saveId).isEqualTo(update);
        assertThat(result1).isNotEqualTo(result2);
    }

    @Test
    public void 게시글삭제() {
        Board board = new Board();
        board.setContent("내용");
        boardService.insertBoard(board);
        boardService.deleteBoard(board);

        assertThat(board.getDeleteYn()).isEqualTo(true);
    }

}
