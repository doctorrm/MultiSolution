public class ByteToBit {  
   
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        System.out.println(byteToBit(new Integer(10).byteValue()));  
    }  
   
    public static String byteToBit(byte b) {  
   //b >> 7 将原第8位的bit值移到了第1位上，& 0x1的作用是只保留第一位的值，其余7位与0与将为0
        return ""  
   
        + (byte) ((b >> 7) & 0x1) + (byte) ((b >> 6) & 0x1)  
   
        + (byte) ((b >> 5) & 0x1) + (byte) ((b >> 4) & 0x1)  
   
        + (byte) ((b >> 3) & 0x1) + (byte) ((b >> 2) & 0x1)  
   
        + (byte) ((b >> 1) & 0x1) + (byte) ((b >> 0) & 0x1);  
   
    }  
}  