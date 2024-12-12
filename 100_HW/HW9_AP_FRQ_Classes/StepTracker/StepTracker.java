public class StepTracker {
    int minActiveSteps;
    int activeDays;
    int totalSteps;
    int totalDays;
    
    public StepTracker(int minActiveSteps) {
        this.minActiveSteps = minActiveSteps;
    }
    
    public void addDailySteps(int steps) {
        totalSteps += steps;
        totalDays++;
        
        if (steps >= minActiveSteps) {
            activeDays++;
        }
    }
    
    public int activeDays() {
        return activeDays;
    }
    
    public double averageSteps() {
        if (totalDays == 0) {
            return 0.0;
        } else {
            return (double) totalSteps / totalDays;
        }
    }
}