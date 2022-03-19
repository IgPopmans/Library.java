package Incapsulation;

public class Algebra {
    private int op1;
    private int op2;

    public Algebra(int op1, int op2) {
        this.op1 = op1;
      if(op2==0){
        System.out.println("not for division");
    }
    this.op2 = op2;

}
public void setOp1(int op1){
        this.op1=op1;
}
public int getDivision() {
        return op2 !=0? op1/op2 :-1;
}

}