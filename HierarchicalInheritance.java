//Hierarchical Inheritance
class Box{
	double width;
	double height;
	double depth;
	Box(){
		this.width=0;
		this.height=0;
		this.depth=0;
	}
	Box(double d){
		this.width=d;
		this.height=d;
		this.depth=d;
	}
	Box(double width,double height,double depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	void volume(){
		double vol=width*height*depth;
		System.out.println("Volume of the box:"+vol);
	}
}
class BoxWeight extends Box{
	double weight;
	BoxWeight(double width,double height,double depth,double weight){
		this.width=width;
		this.height=height;
		this.depth=depth;
		this.weight=weight;
	}
}
class BoxValue extends Box{
	int value;
	BoxValue(double width,double height,double depth,int value){
		this.width=width;
		this.height=height;
		this.depth=depth;
		this.value=value;
	}
}
public class HierarchicalInheritance{
	public static void main(String args[]){
		BoxValue b1=new BoxValue(10,11,12,13);
		b1.volume();
		BoxWeight b2=new BoxWeight(11,12,13,14);
		b2.volume();
	}
}
