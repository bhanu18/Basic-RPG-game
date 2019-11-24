import java.util.*;
public class gp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Map<String, Hero> HC = new HashMap<String , Hero>();
    HC.put("Bhnau", new Hero("bhanu",null));
    HC.put("aly", new Hero("aly",null));
    
    weapon wp = new weapon("Sniper");
    
    Iterator<String>  itr = HC.keySet().iterator();
    while(itr.hasNext()){
    	String name= itr.next();
    	HC.get(name).changeweapon(wp);
    }
    for (String h : HC.keySet()){
    	
    	System.out.println(HC.get(h));
    }
	}

}
