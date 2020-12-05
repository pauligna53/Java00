package de.uniwue.gdp.labyrinth;

import de.uniwue.gdp.labyrinth.model.Maze;

public class Explorer {

    public static void main(String[] args) {
        Explorer explorer = new Explorer();
        Maze maze = new Maze() {
            @Override
            public int width() {
                return 0;
            }

            @Override
            public int height() {
                return 0;
            }

            @Override
            public boolean isWall(int direction) {
                return false;
            }

            @Override
            public void mark(int direction) {

            }

            @Override
            public int marks(int direction) {
                return 0;
            }

            @Override
            public void walk(int direction) {

            }
        };
        explorer.exploreMaze(maze);

    }

    public void exploreMaze(Maze z){
        int width = z.width();
        System.out.println(width);

    }


}

