package com.kjellvos.os.gridHandler;

import javafx.scene.Node;

/**
 * Created by kjevo on 2/21/17.
 */
public class GridItem{
    private int xPos, yPos, colSpan, rowSpan;
    private Node UINode;

    /**
     * Constructor for this class, Takes parameters to setup the grid item
     * @param xPos The x position on the grid it takes
     * @param yPos The y position on the grid it takes
     * @param colSpan The column span of the item(how 'big' it is, ie if you put in 2 it takes 2 positions of X making it twice as large horizontally on the grid.)
     * @param rowSpan The row span of the item(how 'big' it is ie if you put in 2 it takes 2 positions of Y making it twice as large vertically on the grid.)
     */
    public GridItem(int xPos, int yPos, int colSpan, int rowSpan){
        this.xPos = xPos;
        this.yPos = yPos;
        this.colSpan = colSpan;
        this.rowSpan = rowSpan;
    }

    /**
     * Sets UI node for this instance to that of the passed parameter
     * @param UINode The UI node this instance is going to be
     * @return this instance of Grid Item
     */
    public GridItem setUINode(Node UINode){
        this.UINode = UINode;
        return this;
    }

    /**
     *Returns the UI Node this instance is
     * @return The UI Node this instance is
     */
    public Node getUINode() {
        return UINode;
    }

    /**
     * Returns the x position of the UI node
     * @return The x position of the UI node
     */
    public int getxPos() {
        return xPos;
    }

    /**
     * Returns the y position of the UI node
     * @return The y posiiton of the UI node
     */
    public int getyPos() {
        return yPos;
    }

    /**
     * Returns the column span of the UI node
     * @return The column span of the UI node
     */
    public int getColSpan() {
        return colSpan;
    }

    /**
     * Returns the row span of the UI node
     * @return The row span of the UI node
     */
    public int getRowSpan() {
        return rowSpan;
    }
}
