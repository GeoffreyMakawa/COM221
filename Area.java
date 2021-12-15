public class Area {

	private double length;
	private double width;

	public Area(){
		
	}
	 
 	Area(double length, double width){
 		 this.length=length;
 		 this.width=width;
 	}
 	// length starts here

 	public void setLength(double length){
 		this.length=length;
 	}

 	 public double getLength(){
 	 	 return length;
 	 }
 	 // length ends here

 	 // Width starts here
 	 public void setWidth(double width){
 	 	this.width = width;
 	 }
 	  
 	 public double getWidth(){
 	 	 
 	 	return width;
 	 }

 	 public double getArea(){
 	 	double lectangleArea=length * width;
 		return lectangleArea;
 	 }

}