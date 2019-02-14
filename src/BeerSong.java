package com.company;

public class BeerSong {

public static void main(String[] args) {

// Call the Method
Ninety_Nine_Bottles_of_Beer();
}

public static void Ninety_Nine_Bottles_of_Beer() {
int numBeer = 99; // Initial Number of Beers
String bottleWord = "bottles"; // String variable to store if number of bottles are singular/plural

while (numBeer > 0) {

/*
* Handling special case of One bottle (Singular)
*/
if (numBeer == 1) {
bottleWord = "bottle";
}

/*
Expected Output fot each iteration:
2 bottles of beer on the wall, 2 bottles of beer take one down, pass it around, 1 bottle of beer on the wall.
*/
System.out.print(numBeer + " " + bottleWord + " of beer on the wall, ");
System.out.print(numBeer + " " + bottleWord + " of beer take one down, pass it around, ");

// reduce number of beers
numBeer--;

if(numBeer > 0) {
System.out.println(numBeer + " " + bottleWord + " of beer on the wall.");
} else {
// No beers left
System.out.println("no more bottles of beer on the wall.");
}
}

}
}


