//    public static void mergeSort(int[] N, int lowerIndex, int upperIndex) {
//        if (lowerIndex == upperIndex) {
//            return;
//        }
//        //Divide & recursion part
//        int middle = (lowerIndex + upperIndex) / 2;
//        mergeSort(N, lowerIndex, middle);
//        mergeSort(N, middle + 1, upperIndex); //+1 because you don't want duplicate elements when split
//        merge(N, lowerIndex, middle + 1, upperIndex);
//    }
////Merge section
//    public static void merge(int[] N, int lowerIndexCursor, int higherIndex, int upperIndex) {
//        int tempIndex = 0;
//        int lowerIndex = lowerIndexCursor;
//        int midIndex = higherIndex-1;
//        int totalItems = upperIndex - lowerIndex +1;
//
//        while(lowerIndex <= midIndex && higherIndex <= upperIndex){
//            //Left vs right array
//            if (N[lowerIndex]<N[higherIndex]){
//                N[tempIndex++] = N[lowerIndex++];
//            } else {
//                N[tempIndex++] = N[higherIndex++];
//            }
//        }
//        while(lowerIndex <= midIndex){
//            N[tempIndex++] = N[lowerIndex++];
//        }
//
//        while (higherIndex <= upperIndex){
//            N[tempIndex++] = N[higherIndex++];
//        }
//
//        for(int i =0; i<totalItems; i++){
//            N[lowerIndexCursor+1] = N[i];
//        }
//        System.out.println(Arrays.toString(N));
//    }
//    void merge(int arr[], int l, int m, int r) {
//        int n1 = m - 1 + 1;
//        int n2 = r - m;
//
//        int L[] = new int[n1];
//        int R[] = new int[n2];
//
//        for (int i = 0; i < n1; i++) {
//            L[i] = arr[l+i];
//        }


//    }