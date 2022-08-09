package cn.tedu.min;

public class testGetSingle {
    private testGetSingle(){}
    private  static testGetSingle single;
    public  synchronized static testGetSingle getSingle(){
        if (single==null){
           void
            return single= new testGetSingle();
        }
        return single;
    }
}
