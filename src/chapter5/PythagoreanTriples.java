package chapter5;

public class PythagoreanTriples {
    public static void main(String[] args) {
        System.out.printf("%4s%20s%20s%n","Side1","Side2", "Hypotenuse");
        for (int hypo = 1; hypo <= 500; hypo++){
            for (int adj = 1; adj <= 500; adj++){
                for (int opp = 1; opp <= 500; opp++){
                    if (((Math.pow(adj, 2)==((Math.pow(hypo, 2)) -Math.pow(opp, 2))))){
                        System.out.printf("%4d%20d%20d%n",adj, opp,hypo);
                    }
                }
            }
        }
    }
}
