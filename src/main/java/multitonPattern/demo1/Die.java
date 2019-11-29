package multitonPattern.demo1;

import java.util.Date;
import java.util.Random;

/**
 * 
 * 多例模式案例-骰子
 */
public class Die {
	
	private static Die die1 = new Die();
    private static Die die2 = new Die();
    
    private Die() {
    }
    
    /**
     * 工厂方法
     */
    public static Die getInstance(int whichOne) {
       if(whichOne ==1){
    	   return die1;
       }else{
    	   return die2;
       }
    }

    /*
     * 投掷骰子，返回一个在1-6之间的随机数
     */
    public synchronized int dice() {
       Date d = new Date();
       Random r = new Random(d.getTime());
       int value = r.nextInt();
       value = Math.abs(value);
       value = value % 6;
       value += 1;
       return value;
    }
    
}
