package interfaceDemo;

public class GFSClass {

	public static void main(String[] args) {
		BoyFriend bf=new BoyFriend();
		Girl girl=new Girl();
		girl.findBoyFriend(bf);
		
	}

}


interface Height{
	public void height();
}


interface Riching{
	public void rich();
}

interface Hansome{
	public void hansome();
}



//实现了高富帅类
interface HRH extends Height,Riching,Hansome{
	
	
}



//男朋友类
class BoyFriend implements HRH{
	public void height() {
		System.out.println("很高");
	}
	
	public void rich() {
		System.out.println("很富");
	}
	
	
	
	public void hansome() {
		System.out.println("很帅");
	}
}




//女生找男朋友
class Girl{
	public void findBoyFriend(HRH bf) {
	   bf.height();
	   bf.rich();
	   bf.hansome();
	}
}