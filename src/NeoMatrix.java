import java.util.Arrays;

public class NeoMatrix implements DimensionMatrix {

    private static final long serialVersionUID = 8L;

    /**
     * Deflaut initial capacity
     */
    private static final int DEFAULT_CAPACITY = 1;

    /**
     * Array which the elements of the NeoMatrix are stored.
     */
    private int data[][];

    /**
     * variable which stored number of rows
     */
    private int numberOfRows;

    /**
     * variable which stored number of columns
     */
    private int numberOfColumns;

    /**
     * The size of the NeoMatrix.Size is number of rows divided number of columns
     * sizu = numberOfRows * numberOfColumns
     */
    private int size;
    //================================================================================================================

    /**
     * Deflaut constructor , dont take any paramets and initial only one row and one column with value "null"
     */
    public NeoMatrix() {
        this.data = null;//musze wpisac exepszony
        numberOfRows = 1;
        numberOfColumns = 1;
    }

    /**
     * Constructor takes array of ints and set in array of data
     *
     * @param data array of ints
     */
    public NeoMatrix(int[][] data) {
        data = new int[numberOfRows][numberOfColumns];
        numberOfRows = data.length;
        numberOfColumns = data[0].length;


        for (int i = 0; i < numberOfRows; i++)
            for (int j = 0; j < numberOfColumns; j++)
                this.data[i][j] = data[i][j];
    }

    public NeoMatrix(int numberOfRows, int numberOfColumns) {
        data = new int[numberOfRows][numberOfColumns];
        this.numberOfRows = numberOfRows;
        this.numberOfColumns = numberOfColumns;
    }

    /**
     * Return thw value of the specified matrix element.
     *
     * @param row element's rows index of Matrix.
     * @param col element's columns index of Matrix.
     * @return value of element.
     */
    @Override
    public int get(int row, int col) {
        return data[row][col];
    }

    /**
     * Sets the value of the specified Matrix element.
     *
     * @param row   position for sets the value.
     * @param col   position for sets the value.
     * @param value
     */
    @Override
    public void set(int row, int col, int value) {
       try { data[row][col] = value;}
       catch (ArrayIndexOutOfBoundsException e){
           System.err.println("Liczba wierszy lub kolumn jest nie własciwa");
        }
    }

    /**
     * Return the number of elements in this matrix,
     * which the number of rows times the number of columns
     *
     * @return Number of elements in this matrix.
     */
    @Override
    public int getNumberOfElements() {
        return numberOfRows * numberOfColumns;
    }

    /**
     * Returns the number of rows in this matrix.
     *
     * @return Number of rows
     */
    @Override
    public int getNumRows() {
        return numberOfRows;
    }

    /**
     * Return tne number of columns in this matrix.
     *
     * @return Number of columns.
     */
    @Override
    public int getNumCols() {
        return numberOfColumns;
    }

    /**
     * Sets all values inside in matrix to variable named value
     * @param value
     */
    public void fillUp(int value){
        for (int i = 0; i < numberOfRows; i++)
            for (int j = 0; j < numberOfColumns; j++)
                data[i][j] = value;
    }
    /**
     * Sets all values inside in matrix to zero.
     */
    @Override
    public void zero() {
        fillUp(0);
    }

    /**
     * Print the matrix to using standard formating.
     */
    @Override
    public void print() {

        for (int i = 0; i < numberOfRows ; i++) {
            System.out.print("[");
            for (int j = 0; j < numberOfColumns ; j++) {
                System.out.print(data[i][j]);
                if(j < numberOfColumns -1)
                System.out.print(",");
            }
            System.out.print("]");
            System.out.println();
        }

    }

    public void grd(int a){

    }

}
