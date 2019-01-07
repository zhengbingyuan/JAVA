package LeedCode;

import java.util.List;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
//import MaxHeap.PriorityQueue;


public class LeedCode347 {
	
	private class Freq implements Comparable<Freq>{
		public int e,freq;
		public Freq(int e,int freq) {
			this.e = e;
			this.freq = freq;
		}
		/*
		@Override
		public int compareTo(Freq another) {
			if(this.freq<another.freq)
				return 1;
			else if(this.freq>another.freq)
				return -1;
			else 
				return 0;
		}
		*/
		@Override
		public int compareTo(Freq another) {
			if(this.freq<another.freq)
				return -1;
			else if(this.freq>another.freq)
				return 1;
			else 
				return 0;
		}
		
	}
	class Solution347 {
	    public List<Integer> topKFrequent(int[] nums, int k) {
	        TreeMap<Integer,Integer> map = new TreeMap<>();
	        for(int num:nums) {
	        	if(!map.containsKey(num))
	        		map.put(num, 1);
	        	else
	        		map.put(num, map.get(num)+1);
	        }
	        PriorityQueue<Freq> pq = new PriorityQueue<>();
	       /*
	        for(int key:map.keySet()) {
	        	if(pq.getSize()<k) {
	        		pq.enqueue(new Freq(key, map.get(key)));
	        	}
	        	else if(map.get(key)>pq.getFront().freq) {
	        		pq.dequeue();
	        		pq.enqueue(new Freq(key, map.get(key)));
	        	}
	        }
	        LinkedList<Integer> res = new LinkedList<Integer>();
	        while(!pq.isEmpty()) {
	        	res.add(pq.dequeue().e);
	        }
	        */
	        for(int key:map.keySet()) {
	        	if(pq.size()<k) {
	        		pq.add(new Freq(key, map.get(key)));
	        	}
	        	else if(map.get(key)>pq.peek().freq) {
	        		pq.remove();
	        		pq.add(new Freq(key, map.get(key)));
	        	}
	        }
	        LinkedList<Integer> res = new LinkedList<Integer>();
	        while(!pq.isEmpty()) {
	        	res.add(pq.remove().e);
	        }
	        return res;
	    }
	}
	
	class Solution347good {
	    public List<Integer> topKFrequent(int[] nums, int k) {
	        TreeMap<Integer,Integer> map = new TreeMap<>();
	        for(int num:nums) {
	        	if(!map.containsKey(num))
	        		map.put(num, 1);
	        	else
	        		map.put(num, map.get(num)+1);
	        }
	        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
	        	@Override
	        	public int compare(Integer a,Integer b) {
	        		return map.get(a)-map.get(b);
	        	}
	        });

	        for(int key:map.keySet()) {
	        	if(pq.size()<k) {
	        		pq.add(key);
	        	}
	        	else if(map.get(key)>map.get(pq.peek())) {
	        		pq.remove();
	        		pq.add(key);
	        	}
	        }
	        LinkedList<Integer> res = new LinkedList<Integer>();
	        while(!pq.isEmpty()) {
	        	res.add(pq.remove());
	        }
	        return res;
	    }
	}
}
