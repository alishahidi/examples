#include <iostream>

int main()
{
  std::string name;

  std::cout << "Enter your name: ";
  std::cin >> name;

  std::cout << name.at(0) << std::endl;
  std::cout << name.append("_link") << std::endl;
  std::cout << name.find(".") << std::endl;

  if (name.empty())
  {
    std::cout << "Its empty name.";
    return 1;
  }

  if (name.length() > 10)
  {
    std::cout << "Its greeter than 10 charecter.";
  }

  return 0;
}