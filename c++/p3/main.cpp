#include <iostream>

using string = std::string;

namespace math
{
  const double PI = 3.141592653589793238462643383279502884197;
}

int main()
{
  string name = "Ali Shahidi";

  std::cout << name << std::endl;
  std::cout << math::PI * 3 * 3 << std::endl;

  return 0;
}