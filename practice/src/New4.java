
// Passing object as an argument in a method.
public class New4 {
	double h;
	double l;
	double w;
	public New4(double h, double l, double w) {
		 this.h= h;
		 this.l= l;
		 this.w= w;
		 System.out.println("VolumE is:" +h*l*w);
		 }
	public New4(New4 ob) { // Here New4 is considered as a data type.
		h= ob.h;
		l= ob.l;
		w= ob.w;
		System.out.println("Volume is:" +h*l*w);
	}
	

	public static void main(String[] args) {
		New4 obj = new New4(10,20,10);
		New4 obj1 = new New4(obj);
		

	}

}
