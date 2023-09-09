/////////////////////////////////////////LECTURE-58....25-AUG 1:30PM///////////////////////////////
package javacode;

interface si{
    void meth1();
    void meth2();
}
interface csi extends si{
    void meth3();
    void meth4();
}
class mysample implements csi{//meth 1 and meth2 bhi define krne pdega bcoz by using inheritance meth1 adn meth 2 aa rhe h csi k ander vrne error vrne abstract kro but define to khi nhi khi krne h hi tbhi to bneye h
    @Override
    public void meth1() {
        System.out.println("meth 1");
    }
    @Override
    public void meth2() {
        System.out.println("meth 2");
    }
    @Override
    public void meth3() {
        System.out.println("meth 3");
    }
    @Override
    public void meth4() {
        System.out.println("meth 4");
    }
}
public class lecture58 {
    public static void main(String[] args) {
        mysample obj=new mysample();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}