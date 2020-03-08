import java.util.ArrayList;
import java.util.List;

/*
 * Copyright (c) 2019-2020, Paweł Chudy nickname batory1533 . All Rights Reserved.
 */
public interface DimensionMatrix extends Matrix {
    /**
     * Return thw value of the specified matrix element.
     *
     * @param row element's rows index of Matrix.
     * @param col element's columns index of Matrix.
     * @return value of element.
     */
    int get(int row, int col);

    /**
     * Sets the value of the specified Matrix element.
     * @param row position for sets the value.
     * @param col position for sets the value.
     */
    void set(int row, int col,int value);

    /**
     *Return the number of elements in this matrix,
     * which the number of rows times the number of columns
     * @return Number of elements in this matrix.
     */
    int getNumberOfElements();


}
