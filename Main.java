package com.company;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {-34, 17, 55, -100, 22, 1, 19, 11, -1000, 345345, 10, -10, 345665};

        // ASSUMES NUMBER AT POSITION [0] IE -34 IS SORTED, THEN COMPARES THE NEXT ELEMENT ALONG TO THIS VALUE AND SWAPS IT IF IT'S SMALLER
        //SORTED PARTITION GROWS FROM LEFT
        for (int firsUnsortedIndex = 1; firsUnsortedIndex < intArray.length; firsUnsortedIndex++){
            int newElement = intArray[firsUnsortedIndex];
            int i;

            //THIS LOOP CONTINUES WHILE THE FIRST UNSORTED ELEMENT IS SMALLER THAN THE LAST SORTED ELEMENT
            for (i= firsUnsortedIndex; i>0 && intArray[i-1] > newElement; i--){
                //THIS SWAPS THE TWO ELEMENTS TO MOVE THE SMALLER NUMBER TO THE LEFT, BUT OVERWRITES THE ORIGINAL VALUE
                //THIS ALLOWS SMALLER NUMBERS TO MOVE TO THE LEFT
                intArray[i] = intArray[i-1];
            }
            //THIS OCCURS WHEN THE ELEMENT BEING CHECKED HAS REACHED THE FAR LEFT OF THE SORTED PARTITION, OR HAS REACHED A NUMBER SMALLER THAN IT
            //IT IS THEN REPLACED WITH ITSELF (IS WAS STORED AS 'NEW ELEMENT' INITIALLY
            intArray[i]=newElement;

        }

        //PRINT STATEMENT
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

}
