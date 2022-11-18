

public interface Triplets {
    public static void main(String[] args){
        int arr[] = {0, -1, 2, -4, 1, 5, -3};
        int N = arr.length;
    //(arr, N);
        boolean found = false;
        for(int i=0; i<N-2; i++){
            for(int j=0; j<N-1; j++){
                for(int k=0; k<N; k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                        found = true;

                    }
                }
            }
            if(found == false)
                System.out.println("Does not exist");
        }

    }
}
