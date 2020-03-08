/*
 * Copyright (c) 2019-2020, Paweł Chudy nickname batory1533 . All Rights Reserved.
 */

import java.io.Serializable;

/**
 * Base interface for rest intefaces and classes
 *
 * @author batory1533
 */
public interface Matrix extends Serializable {
    /**
     * Returns the number of rows in this matrix.
     *
     * @return Number of rows
     */
    int getNumRows();

    /**
     * Return tne number of columns in this matrix.
     *
     * @return Number of columns.
     */
    int getNumCols();

    /**
     * Sets all values inside in matrix to zero.
     */
    void zero();

    /**
     * Print the matrix to using standard formating.
     */
    void print();


}
