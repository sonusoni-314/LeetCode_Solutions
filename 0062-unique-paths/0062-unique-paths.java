class Solution {
    public int uniquePaths(int m, int n) {

        int[] row = new int[n];
        Arrays.fill(row, 1);
        int[] newRow = new int[n];
        Arrays.fill(newRow, 1);

        for(int i=0; i<m-1; i++){
            Arrays.fill(newRow, 1);

            for(int j=newRow.length-2; j>=0; j--){
                newRow[j] = newRow[j+1] + row[j];
            }
            row = Arrays.copyOf(newRow, newRow.length);
        }
        return newRow[0];
    }
}