package roadgraph;

import geography.GeographicPoint;

// This class stores the edge information

public class Edge {
	private GeographicPoint point;     // stores the endPoint of the edge
	private double length;             // stores the length of the edge
	private String roadName;           // stores the roadName
	private String roadType;           // stores the roadType
	
	public Edge(GeographicPoint point, double length, String roadName, String roadType) {
		super();
		this.point = point;
		this.length = length;
		this.roadName = roadName;
		this.roadType = roadType;
	}
	public String getRoadName() {
		return roadName;
	}
	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}
	public String getRoadType() {
		return roadType;
	}
	public void setRoadType(String roadType) {
		this.roadType = roadType;
	}
	public GeographicPoint getPoint() {
		return point;
	}
	public void setPoint(GeographicPoint point) {
		this.point = point;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
}
