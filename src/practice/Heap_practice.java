package practice;

import java.util.ArrayList;

public class Heap_practice {

   private ArrayList<Integer> data = new ArrayList<>();
   
   public void add(int item) {
	   this.data.add(item);
	   upheapify(this.data.size()-1);
	   
   }
   
   private void upheapify(int ci) {
	   int pi = (ci-1)/2;
	   if (this.data.get(pi) > this.data.get(ci)) {
		   Swap(pi, ci);
		   upheapify(pi);
	   }
   }
   
   public void Swap(int pi,  int ci) {
	   int pith = this.data.get(pi);
	   int cith = this.data.get(ci);
	   
	   this.data.set(pi, cith);
	   this.data.set(cith,  pith);
   }
   
   public int remove() {
	   int rv = this.data.get(0);
	   Swap(0, this.data.size()-1);
	   downheapify(0);
	   return rv;
   }
   
   public int get() {
	   return this.data.get(0);
   }
   
   public int size() {
	   return this.data.size();
   }
   
   public void Display() {
	   System.out.println(this.data);
   }
   
   private void downheapify(int pi) {
	   int lci = 2*pi+1; // left child index
	   int rci = 2*pi+2; // right child index
	   
	   // a pointer index where we are in the binary tree
	   int mini = pi;
	   
	   // now setting if lci is in the range of arrayList and lci value is lesser than its parent index
	   if (lci < this.data.size() && (this.data.get(lci) < this.data.get(mini))) {
		   mini = lci;
	   }
	   
	   // now setting if rci is in the range of arrayList and rci value is lesser than its parent index
	   if (rci<this.data.size() && (this.data.get(rci) < this.data.get(mini))) {
		   mini = rci;
	   }
	   
	   if (mini != pi) {
		   Swap(mini, pi);
		   downheapify(mini);
	   }
	   
	}
   
   public static void main(String[] args) {
		Heap hp = new Heap();
		hp.add(5);
		hp.add(7);
		hp.add(10);
		hp.add(2);
		hp.add(4);
		hp.add(6);
		hp.add(1);
		hp.add(8);
		hp.add(-2);
		hp.Display();
		System.out.println(hp.remove());
		hp.Display();

	}
   
   
}
