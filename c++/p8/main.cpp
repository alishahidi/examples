#include <iostream>

int main(int argc, char *argv[])
{
  if (argc != 3)
  {
    std::cout << "Invalid number of arguments. Please provide two numbers.\n";
    return 1;
  }

  int num1 = std::stoi(argv[1]);
  int num2 = std::stoi(argv[2]);

  int max = (num1 > num2) ? num1 : num2;

  std::cout << "The larger number is: " << max << std::endl;

  return 0;
}
