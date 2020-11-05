package hu.zsigmondpeter.gameoflife.service;

import hu.zsigmondpeter.gameoflife.entity.GameOfLife;

public class GameOfLifeService
{
    private GameOfLife gameOfLife;

    public GameOfLifeService(GameOfLife gameOfLife)
    {
        this.gameOfLife = gameOfLife;
    }

    public GameOfLife getNextStep()
    {
        this.step();
        return this.gameOfLife;
    }

    private void step()
    {
        int height = this.gameOfLife.getHeight();
        int width = this.gameOfLife.getWidth();
        boolean[][] cells = this.gameOfLife.getCells();
        boolean[][] newCells = new boolean[height][width];

        for(int i = 0; i < height; i++)
        {
            for(int j = 0; j < width; j++)
            {
                int neighbors = this.gameOfLife.getNumberOfLivingNeighbors(i, j);
                
                newCells[i][j] = cells[i][j] ? (neighbors == 2 || neighbors == 3) : neighbors == 3;
            }
        }

        this.gameOfLife.setCells(newCells);
    }
}
