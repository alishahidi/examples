#include <iostream>

int main()
{
  int side;

  std::cout << "Enter your side number?: ";
  std::cin >> side;

  switch (side)
  {
  case 1:
    std::cout << "Your side is true";
    break;
  case 0:
    std::cout << "Your side is false";
    break;
  default:
    std::cout << "I can't trust you";
  }

  return 0;
}