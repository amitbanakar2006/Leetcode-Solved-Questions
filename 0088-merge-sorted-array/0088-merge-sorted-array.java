class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int[] a=new int[m];
        // int[] b=new int[n];
        // int[] res=new int[m+n];
        for(int i=0;i<n;i++){
            nums1[m]=nums2[i];
            m++;

        }
        Arrays.sort(nums1);
//          for(int i=0;i<n;i++){
//             b[i]=nums2[i];
//         }
//          for(int i=0;i<n+m;i++){
//             if(i<=m){
//                 res[i]=a[i];
//             }
//             res[i]=b[i];
//          }
//    Arrays.sort(res);

    }
}