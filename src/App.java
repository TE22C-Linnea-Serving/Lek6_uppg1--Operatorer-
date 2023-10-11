import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);


        //a)
        System.out.println("Skriv in två heltal: ");
        int tal1 = tangentbord.nextInt();
        int tal2 = tangentbord.nextInt();

        if(tal1==tal2)
        System.out.println("Både tal 1 och tal två är: "+tal1);

        if(tal1<tal2)
        System.out.println("tal 1 är mindre än tal 2: "+tal1+" < "+tal2);

        if(tal1>tal2)
        System.out.println("tal 1 är strörre än tal 2: "+tal1+" > "+tal2);

        System.out.println("");

        //b)
        int[] talen = {4,5,2};

        if(talen[0]>talen[1]|talen[0]>talen[2])
        System.out.println("Av 3 tal är det första talet större än det andra eller tredje talet");
        
        if(talen[0]<talen[1]|talen[0]<talen[2])
        System.out.println("Av 3 tal är det första talet mindre än det andra eller tredje talet");

        if(talen[0]==talen[1]|talen[0]==talen[2])
        System.out.println("Av 3 tal är det första talet lika stort som det andra eller det tredje talet");

        //c)
        System.out.println("Skriv ett tal:");
        int tal3 = tangentbord.nextInt();
        int tal4 = tal3;

        tal3+=7;
        tal3*=2;
        tal3-=6;
        tal3/=2;
        tal3+=3;
        tal3-=tal4;
        System.out.println("Addera talet med 7, ");   //Skriver ut åt användaren
        System.out.println("multiplicerat med 2, ");  
        System.out.println("subtraherat med 6, ");
        System.out.println("delat med 2, ");
        System.out.println("adderat med 3, ");
        System.out.println("och subtraherat med ditt ursprungliga talet, så blir svaret alltid 7:");
        System.out.println(tal3==7);







        }
}
