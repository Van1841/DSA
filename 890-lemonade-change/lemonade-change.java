class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0; 
        int ten = 0;
        // we dont keep 20 as usmei kuch return nhi krna hai hme ok??

        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5){
                five = five + 1;
            }else if (bills[i] == 10 && five > 0){
                ten = ten + 1;
                five = five-1;
            }else{         // user ne 20 diya hua hai !
                if(ten > 0 && five > 0){
                    ten = ten -1;
                    five = five -1;
                }else if(five >= 3){
                    five = five -3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}