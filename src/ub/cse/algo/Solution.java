package ub.cse.algo;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    
    private Integer _n_points;          // Number of points in the plane
    private ArrayList<Point> _points;  // This ArrayList contains all points in the plane
    
    public Solution (Integer n_points, ArrayList<Point> points){
        _n_points = n_points;
        _points = points;
    }
    
    public double outputClosestDistance(){
        return -1.0;
    }
}
