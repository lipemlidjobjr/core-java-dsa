#include <iostream>

int main() {

	int bit1, bit2;
	std::cout << "Enter 2 bits:\n";
	std::cin >> bit1 >> bit2;
	int sum_bit {0};
	int carry_bit {0};

	sum_bit = bit1 ^ bit2;

	carry_bit = bit1 & bit2;

	std::cout << "The sum of the bits is " << sum_bit << " and the carry of them is " << carry_bit << "\n";

	return 0;
}
