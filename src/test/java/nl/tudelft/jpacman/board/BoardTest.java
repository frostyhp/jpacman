package nl.tudelft.jpacman.board;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
/**
 * Basic implementation of unit.
 *
 * @author Jeroen Roosen 
 */
public class BoardTest {

    private Square[][] grid;
    private Board board;

    private final Square square = new BasicSquare();
    
    /**
    * isBoardValid
    */
    @Test
    void isBoardValid (){
        grid = new Square[][]{
            { square,square}
        };
        board = new Board(grid);
        assertThat(board.invariant()).isEqualTo(true);
    }
    /**
    * testSquareAt
    */
    @Test
    void testSquareAt() {
        grid = new Square[][]{
            {square,null}
        };
        board = new Board(grid);
        assertThat(board.squareAt(0, 0)).isEqualTo(square);

    }
    /**
    * testSquareAt2
    */
    @Test
    void testSquareAt2() {
        grid = new Square[][]{
            {square,square}
        };
        board = new Board(grid);
        assertThat(board.squareAt(0, 0)).isEqualTo(square);

    }
}
