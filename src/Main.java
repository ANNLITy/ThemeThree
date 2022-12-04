public class Main {
    public static void main(String[] args) {
     int a = 100;
     System.out.println("Значение переменной а с типом int равно " + a);
     byte b = 8;
     System.out.println("Значение переменной b с типом byte равно " + b);
     short c = 3000;
     System.out.println("Значение переменной c с типом short равно " + c);
     long d = 300000;
     System.out.println("Значение переменной d с типом long равно " + d);
     float e = 45.45f;
     System.out.println("Значение переменной e с типом float равно " + e);
     double f = 63.25;
     System.out.println("Значение переменной f с типом double равно " + f);
     double A = 27.12;
     long B = 987678965549L;
     float C = (float) 2.786;
     boolean D = false;
     short E = 569;
     short F = -159;
     int G = 27897;
     byte H = 67;
     byte LPStudents =  23;
     byte ASStudents = 27;
     byte EAStudents = 30;
     short AllPaper = 480;
     short AllStudents = (short) (LPStudents + ASStudents + EAStudents);
     short PaperForOneStudent = (short) (AllPaper / AllStudents);
     System.out.println("На каждого ученика рассчитано " + PaperForOneStudent + " листов бумаги");
     byte pForTwoMinutes = 16;
     byte time = 2;
     byte inOneMinute = (byte) (pForTwoMinutes / time);
     byte timeT = 20;
     short inTwelveMinutes = (short) (inOneMinute * timeT);
     System.out.println("За " + timeT +" минут"+" машина произвела бутылок "+ inTwelveMinutes + " штук");
     short timeTh = 1440;
     short inDay = (short) (inOneMinute * timeTh);
        System.out.println("За " + timeTh +" минут"+" машина произвела бутылок "+ inDay + " штук");
        short timeF = 4320;
        int inThreeDays = inOneMinute * timeF;
        System.out.println("За " + timeF +" минут"+" машина произвела бутылок "+ inThreeDays + " штук");
        int timeFi =  43800;
        int inMonth = inOneMinute * timeFi;
        System.out.println("За " + timeFi +" минут"+" машина произвела бутылок "+ inMonth + " штук");
        short allCans = 120;
        byte WhiteForClass = 2;
        byte BrownForClass = 4;
        byte ForOneCLass = (byte) (WhiteForClass + BrownForClass);
        short Classes = (short) (allCans / ForOneCLass);
        short allWhite = (short) (Classes * WhiteForClass);
        short allBrown = (short) (Classes * BrownForClass);
        System.out.println("В школе,где "+Classes+" классов, нужно "+allWhite+" банок белой краски и "+allBrown+" банок коричневой краски");
        byte banana = 80;
        byte milkHundred = 105;
        byte icecream = 100;
        byte egg = 70;
        byte bananasNumber= 5;
        byte allMilk = 2;
        byte allIceCream = 2;
        byte allEggs = 4;
        short bananasWeight = (short) (banana * bananasNumber);
        short milkWeight = (short) (milkHundred * allMilk);
        short iceCreamWeight = (short) (icecream * allIceCream);
        short eggWeight = (short) (egg * allEggs);
        short coctailWeight = (short) (bananasWeight + milkWeight + iceCreamWeight + eggWeight);
        System.out.println("Вес завтрака "+coctailWeight+" грамм");
        double weightInKg = 1.09;
        System.out.println("Вес завтрака "+weightInKg+" кг");
        short first = 250;
        short second = 500;
        short need = 7000;
        short fResoult = (short) (need / first);
        System.out.println("Если будет терять по 250 граммов в день, то нужно дней "+ fResoult);
        short sResoult = (short) (need / second);
        System.out.println("Если будет терять по 500 граммов в день, то нужно дней "+ sResoult);
        byte numbers = 2;
        int allDays = fResoult + sResoult;
        int middle = allDays / numbers;
        System.out.println("В среднем понадобится дней "+middle);
        int MashaF = 67760;
        int DenisF = 83690;
        int KrisF = 76230;
        byte hundred = 100;
        double MashaProc = MashaF / hundred;
        byte ten = 10;
        double MashaTen = MashaProc * ten;
        double MashaNew = MashaTen + MashaF;
        double MashaR = MashaNew - MashaF;
        double DenisProc = DenisF / hundred;
        double DenisTen = DenisProc * ten;
        double DenisNew = DenisTen + DenisF;
        double DenisR = DenisNew - DenisF;
        double KrisProc = KrisF / hundred;
        double KrisTen = KrisProc * ten;
        double KrisNew = KrisTen + KrisF;
        double KrisR = KrisNew - KrisF;
        System.out.println("Маша теперь получает "+MashaNew+" рублей."+" Годовой доход вырос на "+MashaR+ " рублей");
        System.out.println("Денис теперь получает "+DenisNew+" рублей."+" Годовой доход вырос на "+DenisR+ " рублей");
        System.out.println("Кристина теперь получает "+KrisNew+" рублей."+" Годовой доход вырос на "+KrisR+ " рублей");















    }
}