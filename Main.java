package com.company;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        String grid = "";
        String hooverPosition = "";
        String trash1 = "";
        String trash2 = "";
        String trash3 = "";
        String directionLine = "";
        int lineNumber;
        //read content from file line by line with
        try {
            FileReader readfile = new FileReader("/Users/aakashkadakia/IdeaProjects/Hoover/src/com/company/input.txt");
            BufferedReader readbuffer = new BufferedReader(readfile);
            for (lineNumber = 1; lineNumber < 7; lineNumber++) {
                if (lineNumber == 1) {
                    grid = readbuffer.readLine();
                }
                else if (lineNumber == 2) {
                    hooverPosition = readbuffer.readLine();
                }
                else if (lineNumber == 3) {
                    trash1 = readbuffer.readLine();
                }
                else if (lineNumber == 4) {
                    trash2 = readbuffer.readLine();
                }
                else if (lineNumber == 5) {
                    trash3 = readbuffer.readLine();
                }
                else if (lineNumber == 6) {
                    directionLine = readbuffer.readLine();
                }else
                    readbuffer.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //output each line as string
        System.out.println(" The input Line 1 is: " + grid);
        System.out.println(" The input Line 2 is: " + hooverPosition);
        System.out.println(" The input Line 3 is: " + trash1);
        System.out.println(" The input Line 4 is: " + trash2);
        System.out.println(" The input Line 5 is: " + trash3);
        System.out.println(" The input Line 6 is: " + directionLine);

        //convert strings into char array to extract individual data from each line
        char[] grid1 = grid.toCharArray();
        char[] hooverPosition1 = hooverPosition.toCharArray();
        char[] trash11 = trash1.toCharArray();
        char[] trash21 = trash2.toCharArray();
        char[] trash31 = trash3.toCharArray();
        char[] directions = directionLine.toCharArray();

        int gridX = grid1[0];
        int gridY = grid1[2];

        int trash1X = trash11[0];
        int trash1Y = trash11[2];
        int trash2X = trash21[0];
        int trash2Y = trash21[2];
        int trash3X = trash31[0];
        int trash3Y = trash31[2];

        int trashCollector = 0;

        int hitWall = 0;

        //iterate through all directions and check if trash is at each new location (if it is, increase trash collector number and remove trash by setting trash values to garbage number)
        for(int i = 0; i < directions.length; i++){
            if(directions[i] == 'N'){
                //check if it hits wall (grid edge case), then stay in place if it does
                if((hooverPosition1[2] + 1) != gridY){
                    //no wall hit, proceed with movement
                    hooverPosition1[2] += 1;
                }
                else{
                    hitWall = hitWall + 1;
                }
            }
            else if(directions[i] == 'E'){
                //check if it hits wall (grid edge case), then stay in place if it does
                if((hooverPosition1[0] + 1) != gridX) {
                    //no wall hit, proceed with movement
                    hooverPosition1[0] += 1;
                }
                else{
                    hitWall = hitWall + 1;
                }
            }
            else if(directions[i] == 'S'){
                //check if it hits wall (grid edge case), then stay in place if it does
                if((hooverPosition1[2] - 1) != -1){
                    //no wall hit, proceed with movement
                    hooverPosition1[2] -= 1;
                }
                else{
                    hitWall = hitWall + 1;
                }
            }
            else{
                //check if it hits wall (grid edge case), then stay in place if it does
                if((hooverPosition1[0] - 1) != -1){
                    //no wall hit, proceed with movement
                    hooverPosition1[0] -= 1;
                }
                else{
                    hitWall = hitWall + 1;
                }
            }
            //check if it is on a trash object; if it is then increase trash collector counter and remove trash from grid
            if(hooverPosition1[2] == trash1Y && hooverPosition1[0] == trash1X) {
                trashCollector = trashCollector + 1;
                //move trash off grid (out of imaginary room)
                trash1Y = gridY + 10;
                trash1X = gridX + 10;
            }
            //check if it is on a trash object; if it is then increase trash collector counter and remove trash from grid
            if(hooverPosition1[2] == trash2Y && hooverPosition1[0] == trash2X) {
                trashCollector = trashCollector + 1;
                //move trash off grid (out of imaginary room)
                trash2Y = gridY + 10;
                trash2X = gridX + 10;
            }
            //check if it is on a trash object; if it is then increase trash collector counter and remove trash from grid
            if(hooverPosition1[2] == trash3Y && hooverPosition1[0] == trash3X) {
                trashCollector = trashCollector + 1;
                //move trash off grid (out of imaginary room)
                trash3Y = gridY + 10;
                trash3X = gridX + 10;
            }
        }
        //output final values
        System.out.println("Hoover Final Location: ");
        System.out.print(hooverPosition1[0]);
        System.out.print(", ");
        System.out.println(hooverPosition1[2]);
        System.out.println("Number of patches of dirt the robot cleaned up: ");
        System.out.println(trashCollector);
        System.out.println("Number of times it hit a room wall: ");
        System.out.print(hitWall);
    }
}