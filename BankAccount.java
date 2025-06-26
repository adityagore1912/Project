class BankAccount{
    String name;
    long Acc_no;
    String ifsc;
}

class bank{
public static void main(String[] args){
 BankAccount b1=new BankAccount();
 BankAccount b2=new BankAccount();

b1.name="AG";
b1.Acc_no=7718928837L;
b1.ifsc="a2s12dc33g";

b2.name="bk";
b2.Acc_no=8888733100L;
b2.ifsc="a2s12dc10s";

System.out.println("b1 object values");
System.out.println("b1.name     :"+b1.name);
System.out.println("b1.Acc_no   :"+b1.Acc_no);
System.out.println("b1.ifsc     :"+b1.ifsc);


System.out.println("\nb2 object values");
System.out.println("b2name      :"+b2.name);
System.out.println("b2.Acc_no   :"+b2.Acc_no);
System.out.println("b2.ifsc     :"+b2.ifsc);
}
}


output:-


D:\Adii FSJD\CORE JAVA\JAVA BASIC>javac BankAccount.java

D:\Adii FSJD\CORE JAVA\JAVA BASIC>java bank
b1 object values
b1.name     :AG
b1.Acc_no   :7718928837
b1.ifsc     :a2s12dc33g

b2 object values
b2name      :bk
b2.Acc_no   :8888733100
b2.ifsc     :a2s12dc10s

D:\Adii FSJD\CORE JAVA\JAVA BASIC>

