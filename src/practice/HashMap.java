package practice;

import java.util.ArrayList;

public class HashMap<K, V> {

    class Node {
		K key;
		V value;
		Node next;
	}
    
    private ArrayList<Node> bukt;
    private int size = 0;
    
    
    public HashMap(int n) {
    	this.bukt = new ArrayList<>();
    	for (int i = 0; i<n; i++) {
    		this.bukt.add(null);
    	}
    }
   
	
    public HashMap() {
    	this(4);
    }
    
    
	@Override
	public String toString() {
		String s = "{";
		
		for (Node temp: bukt) {
			while(temp!=null) {
				s = s + temp.key + "=" + temp.value + ",";
				temp = temp.next;
			}
			
		}
		return s + "}";
	}
	
	
	
    public void put(K key, V value) {
    	int idx = hashFun(key);
    	Node temp = this.bukt.get(idx);
    	//if there is a node already present on a given index then we traverse through linkedlist and check if key is present and update its value
    	while(temp != null) {
    		if (temp.key.equals(key)) {
    			temp.value = value;
    		    return;
    		}
    		temp = temp.next;
    	}
    	
    	//if there is no node present on the given index
    	//Here we are doing add first in the given linkedlist
    	Node nn = new Node();
    	temp = this.bukt.get(idx);
    	nn.key = key;
    	nn.value = value;
    	nn.next = temp;
    	this.bukt.set(idx, nn);
    	size++;
    	
    	double lf = (1.0*size + 2)/this.bukt.size();
    	double thf = 2;
    	if (lf > thf) {
    		rehashing();
    	}
    	
    }
    
    private void rehashing() {
    	ArrayList<Node> NewBukt = new ArrayList<>();
    	
    	for (int i = 0; i<bukt.size()*2; i++) {
    		NewBukt.add(null);
    	}
    	
    	ArrayList<Node> a = this.bukt;
    	this.bukt = NewBukt;
    	size = 0;
    	
    	for (Node temp: a) {
    		if (temp !=  null) {
    			put(temp.key, temp.value);
    			temp = temp.next;
    		}
    	}
    	
    	
    }
    
    
    public boolean containsKey(K key) {
    	int idx = hashFun(key);
    	Node temp = bukt.get(idx);
    	while(temp != null) {
    		if (temp.key.equals(key)) {
    			return true;
    		}
    		temp = temp.next;
    	}
    	return false;
    	
    }
    
    public V get(K key) {
    	int idx = hashFun(key);
    	Node temp = bukt.get(idx);
    	while(temp != null) {
    		if (temp.key.equals(key)) {
    			return temp.value;
    		}
    		temp = temp.next;
    	}
    	return null;
    }
    
    public V remove(K key) {
    	int idx = hashFun(key);
    	Node curr = bukt.get(idx);
    	Node prev = null;
    	while(curr != null) {
    		if (curr.key.equals(key)) {
    			break;
    		}
    		prev = curr;
    		curr = curr.next;
    	}
    	
    	if (curr == null) {
    		return null;
    	} else if (prev==null) {
    		bukt.set(idx, curr.next);
    		curr.next = null;
    		size--;
    		return curr.value;
    	} else {
    		prev.next = curr.next;
    		curr.next = null;
    		size--;
    		return curr.value;
    	}
    	
    }
    
    
    
    public int hashFun(K key) {
    	int idx = key.hashCode() % this.bukt.size();
    	
    	//hashcode() can give negative integer values so we are going to make it positive as follows
    	
    	if (idx < 0) {
    		idx += this.bukt.size();
    	}
    	
    	return idx;
    }
    
    
	

}
