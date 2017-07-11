package thirdChapter;

/*
 * ˳����ң�������������
 * �Լ�ʵ����size��keys��delete����
 * ���ű�
 * get����������Ҫƽ���Ƚϴ���ΪN/2�Ƿǳ���Ч�ģ������ķ��ű��޷������Ӵ�������������
 * */
public class SequentialSearchST<Key, Value> {

	private Node first;
	private class Node{
		Key key;
		Value val;
		Node next;
		public Node(Key key, Value val, Node next) {
			this.key = key;
			this.val = val;
			this.next = next;
		}
	}
	public Value get(Key key){
		for(Node x = first; x!= null; x = x.next){
			if(key.equals(x.key)){
				return x.val;
			}
		}
		return null;
	}
	public void put(Key key, Value val){
		for(Node x = first; x != null; x = x.next){
			if(key.equals(x.key)){
				x.val = val;
				return ;
			}
		}
		first = new Node(key, val, first);
	}
	public int size(){
		int counter = 0;
		for(Node x = first; x != null; x = x.next){
			counter++;
		}
		return counter;
	}
	public Value delete(Key key){
		Value val = get(key);
		if(val == null){
			throw new NullPointerException();
		}
		if(first.key == key){
			first = first.next;
			return val;
		}
		for(Node x = first; x != null; x = x.next){
			if(x.next.key == key){
				if(x.next.next == null){
					x.next = null;
					return val;
				}else{
					x.next = x.next.next;
					return val;
				}
			}
		}
		return null;
	}
//	public Iterable<Key> keys()
//	{
//		for(Node x = first; x != null; x = x.next){
//			 
//		}
//	}
}
