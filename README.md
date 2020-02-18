# hooverProject
A program that navigates a imaginary robotic hoover (much like a Roomba) through an equally imaginary room

* Room dimensions as X and Y coordinates, identifying the top right corner of the room rectangle. This room is divided up in a grid based on these dimensions; a room that has dimensions X: 5 and Y: 5 has 5 columns and 5 rows, so 25 possible hoover positions. The bottom left corner is the point of origin for our coordinate system, so as the room contains all coordinates its bottom left corner is defined by X: 0 and Y: 0.
* locations of patches of dirt, also defined by X and Y coordinates identifying the bottom left corner of those grid positions.
* an initial hoover position (X and Y coordinates like patches of dirt)
driving instructions (as cardinal directions where e.g. N and E mean "go north" and "go east" respectively)
* The room will be rectangular, has no obstacles (except the room walls), no doors and all locations in the room will be clean (hoovering has no effect) except for the locations of the patches of dirt presented in the program input.

* Placing the hoover on a patch of dirt ("hoovering") removes the patch of dirt so that patch is then clean for the remainder of the program run. The hoover is always on - there is no need to enable it.

* Driving into a wall has no effect (the robot skids in place).

# Input File Specifications:
Please use attached input file or create a file named "input.txt" with the following specifications:
* Line 1: The room dimensions (X Y), separated by a single space (all coordinates will be presented in this format)
* Line 2: Hoover initial position
* Line 3: Position of patch of dirt 1
* Line 4: Position of patch of dirt 2
* Line 5: Position of patch of dirt 3
* Line 6: Driving directions

# To Run: 
1. Must input a quantity of 3 trash objects exactly in your input file
2. Copy the full path of your custom input.txt file and replace the path on Line 15 of source code with your path
3. Run program in your favorite IDE

# Edge Cases and Extra Features of this program:
1. Driving into a wall based on provided grid size will allow the robot to skid in place.
2. Calculates how many times the robot hit a wall and will report the final number in output.
3. Outputs input file content for visual reference to terminal output prior to displaying end results.

# To Improve/Change:
1. Allow for any number of trash objects
2. Add a visual user interface
3. Approach this program again utilizing Test Driven Development (TDD)
4. Create coordinate class/object to access X and Y coordinates per location
