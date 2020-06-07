#include <iostream>
#include <fstream>
#include <Windows.h>
using namespace std;
int main()
{
    string baseName = "exp-(";
    string newBaseName = "exp";
    string oldName = "";
    string newName = "";
    for (int i = 0; i < 8; i++)
    {
        oldName = baseName + (char)('0' + i) + ")";
        newName = newBaseName + (char)('1' + i);
        rename(oldName.c_str(), newName.c_str());
        cout << "from " << oldName << " to " << newName << endl;
    }
}