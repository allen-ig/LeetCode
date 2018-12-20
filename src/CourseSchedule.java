import java.util.*;
public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (numCourses <= 0) return false;
        Queue<Integer> queue = new LinkedList<>();
        int[] degree = new int[numCourses];
        for (int[] prerequisite : prerequisites) {
            degree[prerequisite[1]]++;
        }
        for (int i = 0; i < degree.length; i++){
            if (degree[i] == 0) queue.offer(i);
        }
        while (!queue.isEmpty()){
            int curr = queue.poll();
            for (int[] prerequisite : prerequisites) {
                if (curr == prerequisite[0]) {
                    degree[prerequisite[1]]--;
                    if (degree[prerequisite[1]] == 0) queue.offer(prerequisite[1]);
                }
            }
        }
        for (int aDegree : degree) {
            if (aDegree != 0) return false;
        }
        return true;
    }
}
