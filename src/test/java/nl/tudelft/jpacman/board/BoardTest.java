package nl.tudelft.jpacman.board;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
public class BoardTest {
    @Test
    void testBoard() {
        Square[][] square = {
            { mock(Square.class)},
            { mock(Square.class)},
        };
        Board board = new Board(square);
        assertThat(board.invariant()).isEqualTo(true);
    }

    @Test
    void testBoardNull() {
        Square[][] square = {
            { null},
            { mock(Square.class)},
        };
        Board board = new Board(square);
        assertThat(board.invariant()).isEqualTo(false);
    }
}
