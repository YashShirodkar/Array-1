// Time Compaexity = O(m*n)
// Space Complexity = O (1)

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int top = 0;
        int right = n-1;
        int bottom = m-1;
        List <Integer> result = new ArrayList<>();
        
        while(top <= bottom && left <= right){
            //top iteration
            if (top <= bottom && left <= right){
                for(int j = left; j<=right ; j++){
                    result.add(matrix[top][j]);
                }
                top ++;
            }
            
            // right iteration
            if (top <= bottom && left <= right){
                for(int i = top; i<=bottom ; i++){
                    result.add(matrix[i][right]);
                }
                right --;
            }
            
            // bottom iteration
            if (top <= bottom && left <= right){
                for(int j = right ; j >= left; j--){
                    result.add(matrix[bottom][j]);
                }
                bottom --;
            }
            // left iteration
            if (top <= bottom && left <= right){
                for(int i = bottom ; i >= top; i--){
                    result.add(matrix[i][left]);
                }
                left ++;
            }
            
        }
        return result;
    }
}