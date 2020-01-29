package edu.eci.cvds.patterns.shapes;
import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory{


	public static Shape create (RegularShapeType type){
		Shape fig = null;
		switch(type){
			case Triangle :
				fig = new Triangle();
				break;
			case Hexagon : 
				fig= new Hexagon();
				break;
			case Pentagon: 
				fig = new Pentagon();
				break;
			case Quadrilateral: 
				fig = new Quadrilateral();
				break;			
		}
		return fig;
	}
}