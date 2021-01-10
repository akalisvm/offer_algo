package jzoffer;

// right, down, left, up, recursion
public class jz_66 {
    public int movingCount (int threshold, int rows, int cols){
        if(threshold < 0 || rows <= 0 || cols <= 0) return 0;
        int[][] isVisited = new int[rows][cols];
        return movingCountAlgo(threshold, rows, cols, 0, 0, isVisited);
    }

    private int movingCountAlgo(int threshold, int rows, int cols, int stepRows, int stepCols, int[][] isVisited){
        if(stepRows < 0 || stepCols < 0 || stepRows >= rows || stepCols >= cols || isVisited[stepRows][stepCols] == 1
        || cal(stepRows) + cal(stepCols) > threshold) return 0;
        if(isVisited[stepRows][stepCols] == 0) isVisited[stepRows][stepCols] = 1;
        return 1 + movingCountAlgo(threshold, rows, cols, stepRows, stepCols+1, isVisited) +
                movingCountAlgo(threshold, rows, cols, stepRows+1, stepCols, isVisited) +
                movingCountAlgo(threshold, rows, cols, stepRows, stepCols-1, isVisited) +
                movingCountAlgo(threshold, rows, cols, stepRows-1, stepCols, isVisited);
    }

    private int cal(int num){
        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args){
        jz_66 p = new jz_66();
        int threshold = 15;
        int rows = 20;
        int cols = 20;
        System.out.println(p.movingCount(threshold, rows, cols));
    }
}
