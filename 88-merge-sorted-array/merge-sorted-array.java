class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    
        int i = m - 1;          // nums1 चा शेवटचा valid element
        int j = n - 1;          // nums2 चा शेवटचा element
        int k = m + n - 1;      // nums1 मधील शेवटची जागा

        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
    }
