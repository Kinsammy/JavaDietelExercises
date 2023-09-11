package dsaClass;

public class TowersOfHanoi {
    public static void main(String[] args) {
        towersOfHanoi(3, 'A', 'B', 'C');
    }

    public static void towersOfHanoi(int disk, char fromPeg, char toPeg, char auxPeg){
//  todo -> if only one disk, make move and return
        if (disk == 1){
            System.out.printf("Move Disk %d from peg %c to peg %c%n", disk, fromPeg, toPeg);
            return;
        }
//  todo -> Move n-1 disks from A to B, using C as Auxiliary
        towersOfHanoi(disk - 1, fromPeg, auxPeg, toPeg);
        System.out.printf("Move Disk %d from peg %c to peg %c%n", disk, fromPeg, toPeg);

//  todo -> Move n-1 disks from B to C using A as Auxiliary
        towersOfHanoi(disk -1, auxPeg, toPeg, fromPeg);
    }
}
