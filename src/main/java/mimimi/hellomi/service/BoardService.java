package mimimi.hellomi.service;

import mimimi.hellomi.domain.Board;
import mimimi.hellomi.repository.BoardRepository;

import java.util.List;
import java.util.Optional;

public class BoardService {

    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    //게시글 생성
    public Long insertBoard(Board board) {
        boardRepository.save(board);
        return board.getId();
    }

    //하나의 게시글 조회
    public Board selectBoardDetail(Long id) {
        return boardRepository.findById(id).get();
    }

    //or?
//    public Optional<Board> selectBoardDetail(Long id) {
//        return boardRepository.findById(id);
//    }

    //게시글 전체(목록) 조회
    public List<Board> selectBoardList() {
        return boardRepository.findAll();
    }

    //게시글 수정
    public Long updateBoard(Board board) {
        boardRepository.update(board);
        return board.getId();
    }

    //게시글 삭제
    public void deleteBoard(Board board) {
        boardRepository.delete(board);
    }

//    public int selectBoardTotalCount();//삭제여부가 'N'으로 지정된 게시글 개수 조회
}
