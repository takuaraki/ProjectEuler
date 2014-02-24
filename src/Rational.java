
public class Rational {
	
	int n,m; // n/m
	
	Rational(){
		n=0;
		m=1;
	}
	
	Rational(int n, int m){   //2つ目のコンストラクタ
		this.n = n;  //このクラスのn = 引数のn
		this.m = m;
		//reduce();
	}
	
	void display(){
		System.out.println(n+"/"+m);
	}
	
	void add(Rational q){
		this.n = this.n*q.m + q.n*this.m;
		this.m = this.m*q.m;
		reduce();
	}
	
	void subtruct(Rational q){
		this.n = this.n*q.m - q.n*this.m;
		this.m = this.m*q.m;
		reduce();
	}
	
	void multiply(Rational q){
		this.n = this.n*q.n;
		this.m = this.m*q.m;
		reduce();
	}
	
	void divide(Rational q){
		this.n = this.n*q.m;
		this.m = this.m*q.n;
		reduce();
	}
	
	private void reduce(){
		int d = gcd(n,m);
		this.n /= d;
		this.m /= d;
	}
	
	private int gcd(int a, int b){
		int tmp;
		
		if(a==0||b==0){
			return 1;
		}
		if(a<b){
			tmp=b;
			b=a;
			a=tmp;	
		}
		
		if(a%b==0) return b;
		
		while(true){
			tmp = a%b;
			if(b%tmp==0) return tmp;
			a=b;
			b=tmp;
		}
		
	}
	
	boolean morethan(Rational q){
		return this.n*q.m >q.n*this.m;
	}
	
}
