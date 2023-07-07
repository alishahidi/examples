#include <iostream>
using namespace std;

int main(int argc, char **argv)
{
  int count = 0;
  for (int i = 1; i < argc; ++i)
  {
    count += stoi(argv[i]);
  }

  cout << "Average is: " << count / (argc - 1) << endl;

  return 0;
}