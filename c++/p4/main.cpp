#include <iostream>

using string = std::string;

int main()
{
  string name;

  std::cout << "Enter your name: ";
  // Give single char
  // std::cin >> name;

  // Get multiple char
  std::getline(std::cin, name);

  std::cout << "Your entered name is: " << name << std::endl;

  return 0;
}