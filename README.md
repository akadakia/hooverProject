# hooverProject
A program that navigates a imaginary robotic hoover (much like a Roomba) through an equally imaginary room

# Input File Specifications:
1. Please use attached input file or create a file named "input.txt" with the following specifications:
2. Line 1: The room dimensions (X Y), separated by a single space (all coordinates will be presented in this format)
3. Line 2: Hoover initial position
4. Line 3: Position of patch of dirt 1
5. Line 4: Position of patch of dirt 2
6. Line 5: Position of patch of dirt 3
7. Line 6: Driving directions

# TO RUN: 
1. *Must input 3 trash objects exactly in input file*
2. *Copy the full path of your custom input.txt file and replace the path on Line 15 of source code with your path*

# Edge Cases and Extra Features of this program:
1. Driving into a wall based on provided grid size will allow the robot to skid in place.
2. Calculates how many times the robot hit a wall and will report the final number in output.
3. Outputs input file content for visual reference to terminal output prior to displaying end results.

# To Improve:
1. Allow for any number of trash objects
2. Add a visual user interface
