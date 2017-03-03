package com.kjellvos.os.gridHandler;

/**
 * Created by kjevo on 2/21/17.
 */
public class GridSorter implements java.util.Comparator<GridItem> {
    /**
     * Compares all grid items in the array list and sorts them by x position first and then y position
     * @param o1 Object 1 to compare
     * @param o2 Object 2 to compare object 1 to
     * @return 1 if object 1 should be first, -1 if object 2 should be first 0 if they are the same
     */
    @Override
    public int compare(GridItem o1, GridItem o2) {
        if (o1.getyPos() == o2.getyPos() && o1.getxPos() > o2.getxPos()) {
            return 1;
        }else if(o1.getyPos() == o2.getyPos() && o1.getxPos() < o2.getxPos()){
            return -1;
        }else if (o1.getyPos() != o2.getyPos() && o1.getyPos() > o2.getyPos()) {
            return 1;
        }else if (o1.getyPos() != o2.getyPos() && o1.getyPos() < o2.getyPos()){
            return -1;
        }
        return 0;
    }
}
