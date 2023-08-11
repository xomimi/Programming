// Question no 5(a)
import java.util.function.Function;

public class HillClimbing {
    public static void main(String[] args) {
        double initialSolution = 0.0; // Starting point
        double finalSolution = hillClimbing(x -> -x * x, initialSolution); // Minimize the negative quadratic function
        System.out.println("Optimal solution: " + finalSolution);
    }

    public static double hillClimbing(Function<Double, Double> function, double initialSolution) {
        double currentSolution = initialSolution;
        double currentScore = function.apply(currentSolution);

        while (true) {
            double bestNeighbor = currentSolution;
            double bestNeighborScore = currentScore;

            // Generate neighbors by making small adjustments
            for (double step = -0.1; step <= 0.1; step += 0.01) {
                double neighbor = currentSolution + step;
                double neighborScore = function.apply(neighbor);

                if (neighborScore < bestNeighborScore) {
                    bestNeighbor = neighbor;
                    bestNeighborScore = neighborScore;
                }
            }

            if (bestNeighborScore >= currentScore) {
                return currentSolution; // Local minimum or maximum reached
            }

            currentSolution = bestNeighbor;
            currentScore = bestNeighborScore;
        }
    }
}

