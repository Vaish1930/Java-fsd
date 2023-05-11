package diamond_problem_implementing;

public class Diamond implements DiamondProblem, DiamondProblem1 {

    public void display() {
        DiamondProblem.super.display();
        DiamondProblem1.super.display();

    }

    public static void main(String args[]) {
        Diamond diamond = new Diamond();
        diamond.display();
    }
}