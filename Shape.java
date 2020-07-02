public class Shape{
       private int length;
       private int width;
       private double radius;


       public Shape(int length , int width){
              this.length = length;
              this.width = width;
           }
       public Shape(int length){
              this.length = length; 
           }
       public Shape(double radius){
              this.radius = radius;
           }
       public void setLength(int length){
              this.length = length;
            }
       public int getLength(){
              return length;
             }
       public void setWidth(int width){
              this.width = width;
            }
       public int getWidth(){
              return width;
            }
       public void setRadius(double radius){
              this.radius = radius;
            }
       public double getRadius(){
              return radius;
             }
       public int getAreaRectangle(int length , int width){
             return length * width;
    
          }
       public int getAreaSquare(int length){
              int area = length * length;
              return area;
	   }
       public double getAreaCircle(double radius){
              double area = 3.14 * radius * radius;
              return area;
             }
}        