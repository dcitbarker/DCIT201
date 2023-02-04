#include <iostream>
#include <cmath>

using namespace std;

int main() {
  double numbers[5]; // An array to store the 5 numbers
  double sum = 0; // Sum of the numbers
  double mean; // Mean of the numbers
  double variance = 0; // Variance of the numbers
  double standardDeviation; // Standard deviation of the numbers

  // Input the 5 numbers
  cout << "Enter 5 numbers: ";
  for (int i = 0; i < 5; i++) {
    cin >> numbers[i];
    sum += numbers[i];
  }

  // Calculate the mean of the numbers
  mean = sum / 5;

  // Calculate the variance of the numbers
  for (int i = 0; i < 5; i++) {
    variance += pow(numbers[i] - mean, 2);
  }
  variance = variance / 5;

  // Calculate the standard deviation of the numbers
  standardDeviation = sqrt(variance);

  // Output the standard deviation
  cout << "The standard deviation of the numbers is: " << standardDeviation << endl;

  return 0;
}