package mimimi.hellomi.repository;

import mimimi.hellomi.domain.Board;
import mimimi.hellomi.repository.MemoryBoardRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class MemoryBoardRepositoryTest {

    MemoryBoardRepository repository = new MemoryBoardRepository();

    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }

    @Test
    public void save() {
        Board board = new Board();
        board.setContent("내용입니다.");

        repository.save(board);

        Board result = repository.findById(board.getId()).get();
        assertThat(board).isEqualTo(result);
    }

    @Test
    public void findAll() {
        Board board1 = new Board();
        board1.setContent("내용입니다.");
        repository.save(board1);

        Board board2 = new Board();
        board2.setContent("내용입니다.");
        repository.save(board2);

        List<Board> result = repository.findAll();

        assertThat(result.size()).isEqualTo(2);

    }
}
