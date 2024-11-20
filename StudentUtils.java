public class StudentUtils {
    public static String calculateRank(double grade) {
        if (grade >= 8.5) return "Excellent";
        else if (grade >= 7.0) return "Good";
        else if (grade >= 5.5) return "Average";
        else if (grade >= 4.0) return "Below Average";
        else return "Poor";
    }
}
