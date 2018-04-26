import java.util.*;

public class AllPathsFromSourcetoTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        if (graph == null) return res;
        dfs(graph, res, new ArrayList<>(), 0, graph.length - 1);
        return res;
    }

    private void dfs(int[][] graph, List<List<Integer>> res, List<Integer> path, int start, int end){
        path.add(start);
        for (int node : graph[start]){
            dfs(graph, res, path, node, end);
        }
        if (start == end) res.add(new ArrayList<>(path));
        path.remove(path.size() - 1);
    }
}
