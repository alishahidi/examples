#include <iostream>

int main()
{

  std::cout << "Random number is: " << random() << std::endl;
  std::cout << "Random number is: " << random() << std::endl;

  srand(time(NULL));

  std::cout
      << "Random number is: " << random() << std::endl;
  std::cout << "Random number is: " << random() << std::endl;
  std::cout << "Random number is: " << random() << std::endl;
  std::cout << "Random number is: " << random() << std::endl;
  std::cout << "Random number is: " << random() << std::endl;
  std::cout << "Random number is: " << random() << std::endl;
  std::
          cout
      << "\n\n";
  srand(2);
  std::cout << "Random number is: " << random() << std::endl;
  std::
          cout
      << "\n\n";
  std::cout << "Random number is: " << random() << std::endl;
  std::cout << "Random number is: " << random() << std::endl;
  std::cout << "Random number is: " << random() << std::endl;

  return 0;
}