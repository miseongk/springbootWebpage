package mimimi.hellomi.controller;

import mimimi.hellomi.domain.Board;
import mimimi.hellomi.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BoardController {

    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/boards/new")
    public String insertForm() {
        return "boards/insertBoardForm";
    }

    @PostMapping("/boards/new")
    public String insert(BoardForm boardForm) {
        Board board = new Board();
        board.setTitle(boardForm.getTitle());
        board.setContent(boardForm.getContent());

        boardService.insertBoard(board);

        return "redirect:/";
    }

    @GetMapping("/boards")
    public String list(Model model) {
        List<Board> boards = boardService.selectBoardList();
        model.addAttribute("boards", boards);
        return "boards/boardList";
    }
}
