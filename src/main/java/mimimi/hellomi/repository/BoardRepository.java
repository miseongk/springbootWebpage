package mimimi.hellomi.repository;

import mimimi.hellomi.domain.Board;

import java.util.List;
import java.util.Optional;

public interface BoardRepository {

    public Board save(Board board);
    public Optional<Board> findById(Long id);
    public List<Board> findAll();
    public Board update(Board board);
    public void delete(Board board);


//    public int insertBoard(Board board); //게시글 생성
//
//    public Board selectBoardDetail(Long id); //하나의 게시글 조회
//
//    public int updateBoard(Board board); //게시글 수정
//
//    public int deleteBoard(Long id);//게시글 삭제
//
//    public List<Board> selectBoardList();//게시글 목록 조회
//
//    public int selectBoardTotalCount();//삭제여부가 'N'으로 지정된 게시글 개수 조회
}
