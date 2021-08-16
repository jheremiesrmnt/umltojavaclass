package Tables;

public class Billing {

    private int b_no=201;
    private int b_amt=1000;
    Student S = new Student();
    String s_name =S.getS_name();
    public String getS_name() {
        return s_name;
    }
    public int getB_no() {

        return b_no;
    }
    public int getB_amt() {

        return b_amt;
    }
    public Student getS() {

        return S;
    }
}
