// ==========================================================
// 2951. Find the Peaks
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 99%)
// Memory     : 44.9 MB (Beats 90%)
// Link       : https://leetcode.com/problems/find-the-peaks/
// ==========================================================

public class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> peaks = new ArrayList<>();

        int n = mountain.length;

        for (int i = 1; i < n - 1; i++) {
            if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) {
                peaks.add(i);
            }
        }

        return peaks;
    }
}