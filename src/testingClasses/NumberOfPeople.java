package testingClasses;

public class NumberOfPeople {
    public int countPeopleInRoom(int count) {
        int number = count;
        while (number <= count){
            count++;
        }
        return number;
    }

    public int countPeopleLeftRoom(int count) {
        int number = count;
        while (number >= count){
            count--;
        }
        return number;
    }
}
