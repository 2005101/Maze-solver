import java.util.*; // This important the java package

    public class ExampleRoom { // class 
	public static void main(String[] args) { // main function
            //Manual Maze Runner
           /* Robot robot = new Robot("xxx \n  x \n  xx", 0, 0); 
                robot.go('E');// manual move upon seing the maze 
                robot.go('E');// recrusive algorithm 
                robot.go('S');
                robot.go('S');
                robot.go('E');
                robot.say("Maze solved");
    }
}*/
            //Automatic Maze Runner
            // Maze 1
            /*Robot robot = new Robot("xxx \n  x \n  xx", 0, 0); 
            int x=0;
            int y=0;
            int X = 4;// target x
            int Y = 3;// target Y 
            char previous= ' ';// this stores the previous value for S, W, E, N
            while (x != X || y != Y) { // The target is not yet reached then loop continues
                if (x < X && robot.check('E') && previous != 'W') { // so that it does not bounce back 
                    robot.go('E');
                    previous = 'E';// update previous char 
                    x++;
                }
                else if (x > X && robot.check('W') && previous != 'E') {
                    robot.go('W');
                    previous = 'W';
                    x--;
                }
                else if (y < Y && robot.check('S') && previous != 'N') {
                    robot.go('S');
                    previous = 'S';
                    y++;
                }
                else if (y > Y && robot.check('N') && previous != 'S') {
                    robot.go('N');
                    previous = 'N';
                    y--;
                }
                else if (robot.check('E') && previous != 'W') {// if others dont work, try this alternative routes without x and y comparaison 
                    robot.go('E');
                    previous = 'E';
                    x++;
                } 
                else if (robot.check('S') && previous != 'N') {
                    robot.go('S');
                    previous = 'S';
                    y++;
                }
                else if (robot.check('W') && previous != 'E') {
                    robot.go('W');
                    previous = 'W';
                    x--;
                }
                else if (robot.check('N') && previous != 'S') {
                    robot.go('N');
                    previous = 'N';
                    y--;
                }
            }
        }
    }*/
    
            //Test Maze 2
           /* Robot robot = new Robot("xxxxx\n    x\n xxxx\n x   \n xxxx", 0, 0);
            int x=0;
            int y=0;
            int X =4 ;
            int Y = 4;
            char previous= ' ';
            while (x != X || y != Y) { // The target is not yet reached 
                if (x < X && robot.check('E') && previous != 'W') { // so that it does not bounce back 
                    robot.go('E');
                    previous = 'E';
                    x++;
                }
                else if (x > X && robot.check('W') && previous != 'E') {
                    robot.go('W');
                    previous = 'W';
                    x--;
                }
                else if (y < Y && robot.check('S') && previous != 'N') {
                    robot.go('S');
                    previous = 'S';
                    y++;
                }
                else if (y > Y && robot.check('N') && previous != 'S') {
                    robot.go('N');
                    previous = 'N';
                    y--;
                }
                else if (robot.check('E') && previous != 'W') {// if others dont work, try this alternative routes
                    robot.go('E');
                    previous = 'E';
                    x++;
                } 
                else if (robot.check('S') && previous != 'N') {
                    robot.go('S');
                    previous = 'S';
                    y++;
                }
                else if (robot.check('W') && previous != 'E') {
                    robot.go('W');
                    previous = 'W';
                    x--;
                }
                else if (robot.check('N') && previous != 'S') {
                    robot.go('N');
                    previous = 'N';
                    y--;
                }
            }
        }
    }*/
    
            //test for Maze 3:
           /*Robot robot = new Robot("xxxxx\n    x\nxxx x\nx xxx\nx    \nxxxxx", 0, 0);
            int x=0;
            int y=0;
            int X = 5;
            int Y = 6;
            char previous= ' ';
            while (x != X || y != Y) { // The target is not yet reached 
                if (x < X && robot.check('E') && previous != 'W') { // so that it does not bounce back 
                    robot.go('E');
                    previous = 'E';
                    x++;
                }
                else if (x > X && robot.check('W') && previous != 'E') {
                    robot.go('W');
                    previous = 'W';
                    x--;
                }
                else if (y < Y && robot.check('S') && previous != 'N') {
                    robot.go('S');
                    previous = 'S';
                    y++;
                }
                else if (y > Y && robot.check('N') && previous != 'S') {
                    robot.go('N');
                    previous = 'N';
                    y--;
                }
                else if (robot.check('E') && previous != 'W') {// if others dont work, try this alternative routes
                    robot.go('E');
                    previous = 'E';
                    x++;
                } 
                else if (robot.check('S') && previous != 'N') {
                    robot.go('S');
                    previous = 'S';
                    y++;
                }
                else if (robot.check('W') && previous != 'E') {
                    robot.go('W');
                    previous = 'W';
                    x--;
                }
                else if (robot.check('N') && previous != 'S') {
                    robot.go('N');
                    previous = 'N';
                    y--;
                }
            }
        }
    }*/
        
        // Problem 3
        // maze 4:
        //Robot robot = new Robot("xxxx\nxx xxx\nx  x\nx xxxx", 0, 0); 
        Robot robot = new Robot("xx xx  xxx\n"
                        +               "xx x      \n"
                        +               "x   xxx x \n"
                        +               "xx xx x xx\n"
                        +               " xxxx x x \n"
                        +               "     xxx x\n"
                        +               "xxxxx x xx\n"
                        +               "xxxxxxxxxx\n"
                        +               "xx    x   \n"
                        +               "x xxxxxxxx\n", 0, 0);

         int X =9; // The target x
         int Y =9; // The target Y 
         int x = 0;    // starting x
         int y = 0;    // Starting y 
 
        Stack<Character> path = new Stack<>(); // This tracks the robot moves to enable backtracking when hitting dead ends 
         //Stack reverse the path when robot hits a dead end and allow it to try a new path 
         // we declared path as a class "stack"
        Set<String> visited = new HashSet<>(); // To store the visited coordinates as strings
         //set stores the visited x,y. Each coordinate is unique elements as there is no duplicates
         // that data is stored in the classs using a hash table
         while (x != X || y != Y) {// loop continues until target is reached 
             visited.add(x + "," + y); // current position is marked as visited
             // this add the string above to "visisted" set 
             // Prioritize moving South
             if (y < Y && robot.check('S') && !visited.contains(x + "," + (y + 1))) {// It should not be visited before 
                 robot.go('S');
                 path.push('S');// add this direction to pathstack 
                 y++;
             }
             // East
             else if (x < X && robot.check('E') && !visited.contains((x + 1) + "," + y)) {
                 robot.go('E');
                 path.push('E');
                 x++;
             }
             // North
             else if (y > 0 && robot.check('N') && !visited.contains(x + "," + (y - 1))) {
                 robot.go('N');
                 path.push('N');
                 y--;
             }
             // West
             else if (x > 0 && robot.check('W') && !visited.contains((x - 1) + "," + y)) {
                 robot.go('W');
                 path.push('W');
                 x--;
             }
             // This will work in the event of hitting a dead end
             // this will reverse the move back to go out of that dead end 
             else {
                 if (!path.isEmpty()) { // that a path exists 
                    char lastMove = path.pop(); // store the last move of the path stack into lastMove
                 if (lastMove == 'S') { 
                    robot.go('N'); 
                    y--; 
                } else if (lastMove == 'E') { 
                    robot.go('W'); 
                    x--; 
                } else if (lastMove == 'N') {
                   robot.go('S');
                   y++; 
                } else if (lastMove == 'W') { 
                   robot.go('E');
                   x++; 
                } else {
                  System.out.println("Maze is unsolvable."); 
                  break; // stop the robot
                }

             }
         }
 
         if (x == X && y == Y) {// it reaches the target in this case 
            robot.say("Maze end");
         }
        }
    }
}
