#include <iostream>

int myNumber = 4;

int main()
{
  ::myNumber = printNumber();
  std::cout << "After set my num is: " << ::myNumber << std::endl;

  return 0;
}

int printNumber()
{
  int myNumber = 1;
  std::cout << "Fun Scop Num is: " << myNumber << " global scope is: " << ::myNumber << std::endl;
  return myNumber;
}