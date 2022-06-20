
public class CustomArrayList {
	
	private Object data[];
	
	int size=0;
	 
	int index=0;
	
	private final int SIZE_FACTOR=5;
	
	CustomArrayList(){
		size=SIZE_FACTOR;
		data=new Object[size];
	}
	
	
	//add
	public void add(Object obj) {
		
		if(this.index ==size-1) {
			updateArraySize();
		}
		data[index++]=obj;
		
	}
	
	public void updateArraySize() {
		
		 size += SIZE_FACTOR;
		 
		 Object[] newData = new Object[size];
		 
		 for(int i=0;i<data.length;i++) {
			 newData[i]=data[i];
		 }
		 this.data = newData;
	}
	
	//get 
	public Object get(int i) throws Exception {
		
		if(i>this.index-1) {
			throw new Exception("ArrayOutOfBound");
		}
		
		if(i<0) {
			throw new Exception("Negative Bound");
		}
		
		return data[i];
		
		
	}
	
	//remove 
	
	public void remove(int i)throws Exception {
		if(i>this.index-1) {
			throw new Exception("Array Out of Bound Exception");
		}
		
		if(i<0) {
			throw new Exception("Negative Value");
		}
		
		for(int j=i;j<data.length-1;j++) {
			data[j]=data[j+1];
		}
		this.index--;
	}
	
	
	public static void main(String []args) throws Exception {
		
		CustomArrayList list = new CustomArrayList();
		
		list.add(0);
		list.add(12);
		list.add(21);
		
		list.add(34);
		list.add(46);
		
		list.add(55);
		list.add(64);
		
		list.add(72);
		
		list.add(82);
		
		System.out.println(list.get(7));
		
		
		list.remove(7);
		
		System.out.println(list.get(3));
		
		list.remove(3);
		
		System.out.println(list.get(3));
		
		
	}
	
	

}
