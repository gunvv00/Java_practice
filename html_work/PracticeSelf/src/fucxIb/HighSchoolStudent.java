package fucxIb;

class HighSchoolStudent extends Student {
	
	private int korScore;
	private int engScore;
	private int mathScore;
	private int sum;
	private int avg;
	
	public int getKorScore() {
		return korScore;
	}
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = korScore + engScore + mathScore;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = sum / 3;
	}
	
	
	}
