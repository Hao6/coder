package testPackge;

/**
 * Created by hongji on 2017/3/12.
 */
public class Bank {
    Denomination denomination;
    public Bank(Denomination denomination){
        this.denomination=denomination;
    }
    public void analysis(){
        System.out.println("the value of currency is:");
        switch(denomination){
            case FIVE:
                System.out.println("five");
                break;
            case TEN:
                System.out.println("ten");
                break;
            case TWENTY:
                System.out.println("twenty");
                break;
            case FIFTY:
                System.out.println("fifty");
                break;
            case ONE_HUNDRED:
                System.out.println("one_hundred");
                break;
            default:
                System.out.println("get off my country!!!");
        }

    }

    public static void main(String[] args) {
        Bank bank0=new Bank(Denomination.FIFTY);
        bank0.analysis();
    }
}
