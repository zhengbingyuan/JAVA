package UnionFind;

public class UnionFind6 implements UF{
	private int[] parent;
	private int[] rank;
	public UnionFind6(int size) {
		parent = new int[size];
		rank = new int[size];
		for (int i = 0; i < parent.length; i++) {
			parent[i]=i;
			rank[i]=1;
		}
	}
	@Override
	public int getSize() {
		return parent.length;
	}
	
	private int find(int p) {
		
		if(p<0&&p>=parent.length) {
			throw new IllegalArgumentException("p is out of bound.");
		}
		if(p!=parent[p]) {
			parent[p]=find(parent[p]);
		}
		return parent[p];
	}
	
	@Override
	public boolean isConnected(int p,int q) {
		return find(p)==find(q);
	}
	
	//�ϲ�Ԫ��p��Ԫ��q�����ļ���
	//o(h)���Ӷȣ�hΪ���ĸ߶�
	@Override
	public void unionElements(int p,int q) {
		int pRoot = find(p);
		int qRoot = find(q);
		if(pRoot==qRoot)
			return;
		//��������Ԫ�����ڵ�����rank��ͬ�жϺϲ�����
		//��rank�͵ļ��Ϻϲ���rank�ߵļ�����
		if(rank[pRoot]<rank[qRoot]) {
			parent[pRoot]=qRoot;
		}
		else if(rank[qRoot]<rank[pRoot]){
			parent[qRoot]=pRoot;
		}
		else {
			parent[pRoot]=qRoot;
			rank[pRoot]+=1;
		}
	}
	
}