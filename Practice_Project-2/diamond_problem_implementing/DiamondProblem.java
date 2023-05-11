package diamond_problem_implementing;

interface DiamondProblem {
    public default void display() {

        System.out.println("class DiamondProblem display() method called");
    }
}

interface DiamondProblem1 {
    public default void display() {

        System.out.println("class DiamondProblem1 display() method called");
    }
}
