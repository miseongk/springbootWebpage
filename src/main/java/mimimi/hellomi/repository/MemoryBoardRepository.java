package mimimi.hellomi.repository;

import mimimi.hellomi.domain.Board;

import java.util.*;

public class MemoryBoardRepository implements BoardRepository{

    private static Map<Long,Board> store = new HashMap<>();
    private Long sequence = 0L;

    @Override
    public Board save(Board board) {
        board.setId(++sequence);
        store.put(board.getId(), board);
        return board;
    }

    @Override
    public Optional<Board> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public List<Board> findAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public Board update(Board board) {
        store.put(board.getId(),board);
        return board;
    }

    @Override
    public void delete(Board board) {
        board.setDeleteYn(true);
        store.remove(board.getId(), board);
    }

    public void clearStore() {
        store.clear();
    }
}
