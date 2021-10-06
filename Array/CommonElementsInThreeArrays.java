import java.util.*;
public class CommonElementsInThreeArrays {
    public static void main(String[] args) {
        int[] A = {1, 5, 10, 20, 40, 80};
        int[] B = {6, 7, 20, 80, 100};
        int[] C = {3, 4, 15, 20, 30, 70, 80, 120};

        ArrayList<Integer> sol = commonElements(A, B, C, A.length, B.length, C.length);

        if (sol.size() == 0)
            System.out.print(-1);
        else {
            for (int i = 0;i < sol.size();i++) {
                System.out.print(sol.get(i) + " ");
            }
        }
        System.out.println();
    }

    static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        // code here
        ArrayList<Integer> D = new ArrayList<>();

        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2 && k < n3) {
            if (A[i] == B[j] && B[j] == C[k] && !D.contains(A[i])) {
                D.add(A[i]);
                i++;
                j++;
                k++;
            } else if (A[i] < B[j]) {
                i++;
            } else if (B[j] < C[k]) {
                j++;
            } else {
                k++;
            }
        }
        return D;

    }
}
