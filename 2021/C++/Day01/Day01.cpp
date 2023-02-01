// Day01.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <fstream>
#include <string>
#include <vector>

using namespace std;

int main()
{
    int numberOfLine = 0;
    int increasingDepthCount = 0;
    int increasingTripletsCount = 0;
    string line;
    vector<int> depthVector;
    

    cout << "Hello World!\n"; // cout << "Hello World!" << endl;    << endl equals "\n"

    // We will use vector instead of array
    // Opening file with input data
    ifstream myfile("input depth data.txt");

    if (myfile.is_open()) {

        while (getline(myfile, line)) {
            depthVector.push_back(stoi(line)); // Dynamic size array called vector and function stoi() to convert strings to int.
            
            // Part one calculation:
            if (numberOfLine > 0) {
              if (depthVector.at(numberOfLine) > depthVector.at(numberOfLine - 1)) {
                    ++increasingDepthCount;
               }
            }
            // End of part one calculations

            // Part two calculation:
            if (numberOfLine > 2) {
                if ((depthVector.at(numberOfLine) + depthVector.at(numberOfLine - 1) + depthVector.at(numberOfLine - 2)) > (depthVector.at(numberOfLine - 1) + depthVector.at(numberOfLine - 2) + depthVector.at(numberOfLine - 3))) {
                    ++increasingTripletsCount;
                }
            }
            // End of part two calculations

            numberOfLine = numberOfLine + 1;
        }
        myfile.close();
    }
    else { cout << "Unable to open file \n"; }

    // Print result

    cout << "Day one part one answer: " << increasingDepthCount << "\n";
    cout << "Day one part two answer: " << increasingTripletsCount << "\n";

    return 0; // Terminate program
}