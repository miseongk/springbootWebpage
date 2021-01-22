package mimimi.hellomi;

import mimimi.hellomi.repository.BoardRepository;
import mimimi.hellomi.repository.MemoryBoardRepository;
import mimimi.hellomi.service.BoardService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public BoardService boardService() {
        return new BoardService(boardRepository());
    }

    @Bean
    public BoardRepository boardRepository() {
        return new MemoryBoardRepository();
    }
}
