#include <iostream>

using namespace std;

int main()
{
  int number;
  srand(time(NULL));
  number = (rand() % 100) + 1;

  int gussed_number = 0;
  int tries = 0;

  cout << "Please guess number between 1 - 100" << endl;

  do
  {
    cout << "You are in trie #: " << tries << endl;
    cout << "Enter your guess: ";
    cin >> gussed_number;

    if (gussed_number > number)
    {
      cout << "Too high." << endl;
    }
    else if (gussed_number < number)
    {
      cout << "Too low." << endl;
    }
    else
    {
      cout << "It's currect." << endl;
    }

    tries++;
  } while (gussed_number != number);

  cout << "You won in trie: " << tries << endl;

  return 0;
}