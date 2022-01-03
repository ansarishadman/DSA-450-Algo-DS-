import java.util.*;
public class FindGridInAString {
    public static void main(String[] args) {
        char[][] grid = {{'a','b','c'},{'d','r','f'},{'g','h','i'}};
        String word = "abc";

        int[][] ans = searchWord(grid, word);

        System.out.println("Found at indexes:" + Arrays.deepToString(ans));
    }

        static int[][] searchWord(char[][] grid, String word)
        {
            // Code here
            ArrayList<Integer> listX = new ArrayList<>();
            ArrayList<Integer> listY = new ArrayList<>();

            Map<Integer, List<Integer>> hm = new HashMap<>();
            List<Integer> list = new ArrayList<>();
            // add initial character to hashmap to optimize code
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == word.charAt(0)) {
                        hm.put(i, list);
                        hm.get(i).add(j);
                    }
                }
            }


            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (hm.containsKey(i) && hm.get(i).contains(j)) {
                        if (dfs(grid, i, j, 0, word)) {
                            listX.add(i);
                            listY.add(j);
                        }
                    }
                }
            }

            int[][] res = new int[listX.size()][2];
            for(int i = 0; i < listX.size(); i++) {
                res[i][0] = listX.get(i);
                res[i][1] = listY.get(i);
            }
            return res;
        }

        static boolean dfs(char[][] grid, int i, int j, int count, String word) {
        if (count == word.length()) {
            return true;
        }

        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length ||
                grid[i][j] != word.charAt(count)) {
            return false;
        }

        char temp = grid[i][j];
        grid[i][j] = '#';

        boolean found = dfs(grid, i+1, j, count+1, word) || dfs(grid, i, j+1, count+1, word)
                || dfs(grid, i-1, j, count+1, word) || dfs(grid, i, j-1, count+1, word)
                || dfs(grid, i+1, j+1, count+1, word) || dfs(grid, i-1,j-1, count+1,word)
                || dfs(grid, i-1, j+1, count+1, word) || dfs(grid, i+1, j-1, count+1, word);

        grid[i][j] = temp;
        return found;
    }
}
