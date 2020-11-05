package hu.zsigmondpeter.gameoflife.entity;

public class GameOfLife
{
    private final int height;
    private final int width;

    private boolean[][] cells;

    public GameOfLife(int height, int width, boolean[][] cells)
    {
        this.height = height;
        this.width = width;
        this.cells = cells;
    }

    public int getNumberOfLivingNeighbors(int i, int j)
    {
        int number = 0;

        if(i - 1 >= 0 && j - 1 >= 0)
            if(cells[i-1][j-1])
                number++;
        
        if(i - 1 >= 0)
            if(cells[i-1][j])
                number++;
        
        if(i - 1 >= 0 && j + 1 < width)
            if(cells[i-1][j+1])
                number++;
        
        if(j + 1 < width)
            if(cells[i][j+1])
                number++;
        
        if(i + 1 < height && j + 1 < width)
            if(cells[i+1][j+1])
                number++;
        
        if(i + 1 < height)
            if(cells[i+1][j])
                number++;
        
        if(i + 1 < height && j - 1 >= 0)
            if(cells[i+1][j-1])
                number++;
        
        if(j - 1 >= 0)
            if(cells[i][j-1])
                number++;
        
        return number;
    }

    public int getHeight()
    {
        return this.height;
    }

    public int getWidth()
    {
        return this.width;
    }

    public boolean[][] getCells()
    {
        return this.cells;
    }

    public void setCells(boolean[][] newCells)
    {
        this.cells = newCells;
    }
}
