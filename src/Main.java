//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Father father=new Father(50,"Alex",HobbyEnum.CHESS,"Директор");
        Son son1=new Son(20,"Roy",HobbyEnum.FISHING,"PM","КРСУ");
        Son son2=new Son(18,"Roma",HobbyEnum.COOK,"Ui/UX","МГУ");
        System.out.println(father);
        System.out.println(son1);
        System.out.println(son2);

        father.goWork();
        son1.goWork();
    }
}