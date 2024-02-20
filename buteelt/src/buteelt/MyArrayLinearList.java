package buteelt;


import java.util.Arrays;
import java.util.Random;




public class MyArrayLinearList extends ArrayLinearList {


	private Object temp;
	public MyArrayLinearList(int initialCapacity) {
	super (initialCapacity);
	
}
	public MyArrayLinearList() {
		super(10);
	}

	public MyArrayLinearList(MyArrayLinearList mylist) {
		super(mylist.size());
		for(int i = 0 ; i < mylist.size(); i++)
			this.add(i, mylist.element[i]);
	}
	public int max() {
		int max = (int)this.get(0); 
		for(int i = 0 ; i < this.size(); i++)
			if(max < (int)this.get(i))
				max = (int)this.get(i);
		return max;
	}
	public int min() {
		int min = (int)this.get(0);
		for(int i = 0 ; i < this.size(); i++)
			if(min > (int)this.get(i))
				min = (int)this.get(i);
		return min;
	}
	public int sum() {
	   int sum = 0 ; 
	   for(int i = 0 ; i < this.size(); i ++) {
		   sum += (int)this.get(i);
	   }
	   return sum;
	    }
	public double average() {
		float average;
		 int sum = 0 ; 
		   for(int i = 0 ; i < this.size(); i ++) {
			   sum += (int)this.get(i);
		   }
	   
	        average = sum / this.size();
	    return average ;
	}
	public void sort () {
		int tem ;
		for(int k = 0 ; k < this.size ; k ++) {
			for(int z = 0 ; z < this.size - 1 ; z ++) {
				if ((int)this.get(z) > (int)this.get(z+1)) {
					tem = (int)this.get(z+1);
					this.remove(z+1);
					this.add(z++ , tem);
				}
			}
		}
	}
	public void removeOdd() {
		int i = 0 ;
		while(i< this.size) {
			if((int)this.get(i) % 2 != 0 ) {
			this.remove(i);
			}
			else {
				i++;
			}
		}
		
	}
	public MyArrayLinearList unique() {
		MyArrayLinearList temp = new MyArrayLinearList(this);//анхны жагсаалтыг өөрчлөхөөс зайлс хийж байгаа хэрэг
		MyArrayLinearList temp1 = new MyArrayLinearList();//unique элементйиг хадгалах
		Arrays.sort(temp.element);//Эрэмблэлт
		int j = 0 ;
		for (int i = 0 ; i < temp.size() - 1 ; i++) {
			if(temp.element[i] != temp.element[i+1]) {
				temp1.add(j++ , temp.element[i]);
			}
		}
		temp1.add(j++, temp.element[temp.size() - 1]);
		return temp1;
	}
	public MyArrayLinearList reverse() {
		
		MyArrayLinearList temp = new MyArrayLinearList(this.size());
		int j = 0; 
		for(int i = this.size() - 1 ; i >= 0 ; i--)
			temp.add(j++ ,this.element[i]);
		return temp;
		}
	public MyArrayLinearList merge(MyArrayLinearList arrayList) {
		MyArrayLinearList temp = new MyArrayLinearList(this);
		for(int i = 0 ; i < arrayList.size(); i++) {
			temp.add(temp.size(), arrayList.element[i]);
		}
		return temp;
	}
	public MyArrayLinearList rand() {
		int a;
		MyArrayLinearList copylist = new MyArrayLinearList(this);
		MyArrayLinearList temp = new MyArrayLinearList();
		Random rd = new Random();
		while(!copylist.isEmpty()) {
			a = rd.nextInt(copylist.size());
			temp.add(0, copylist.element[a]);
			copylist.remove(a);
		}
		return temp;
	}
	
	}




