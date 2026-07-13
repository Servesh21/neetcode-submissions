/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals.size() <1) return true;
        intervals.sort((a, b) -> a.start - b.start);
        Interval prevMeet = intervals.get(0);
        for(int i=1;i<intervals.size();i++){
            Interval curr = intervals.get(i);
            if(curr.start < prevMeet.end) return false;
            else prevMeet.end = Math.max(prevMeet.end,curr.end);
        }
        return true;
    }
}
