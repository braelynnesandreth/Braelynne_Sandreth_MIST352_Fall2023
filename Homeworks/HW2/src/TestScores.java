
public class TestScores {
	    private double score1;
	    private double score2;
	    private double score3;

	    public TestScores(double s1, double s2, double s3) {
	        this.score1 = s1;
	        this.score2 = s2;
	        this.score3 = s3;
	    }

	    public void setScore1(double n) {
	        this.score1 = n;
	    }

	    public void setScore2(double n) {
	        this.score2 = n;
	    }

	    public void setScore3(double n) {
	        this.score3 = n;
	    }

	    public double getScore1() {
	        return this.score1;
	    }

	    public double getScore2() {
	        return this.score2;
	    }

	    public double getScore3() {
	        return this.score3;
	    }

	    public double getAverageScore() {
	        int numberOfScores = 0;
	        double totalScore = 0.0;

	        if (this.score1 != 0.0) {
	            numberOfScores++;
	            totalScore += this.score1;
	        }

	        if (this.score2 != 0.0) {
	            numberOfScores++;
	            totalScore += this.score2;
	        }

	        if (this.score3 != 0.0) {
	            numberOfScores++;
	            totalScore += this.score3;
	        }

	        if (numberOfScores != 0) {
	            return totalScore / numberOfScores;
	        } else {
	            return 0.0; // Return 0 if there are no valid scores
	        }
	    }
	}
