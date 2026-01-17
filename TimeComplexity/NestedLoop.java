package TimeComplexity;

public class NestedLoop {
    
    //time complexity O(n).
    public static void main(String[] args) {
        int k=5;
        int n=50;
        for(int i=0; i<n; i=i+k){
        for(int j=i+1; j<=k; j++){
           //some constant work
        }
    }
    }
}