public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        var dog = 8;
        var cat = 3.6;
        var paper =763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задание №2");


        dog=dog+4;
        cat=cat+4;
        paper=paper+4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задание №3");
        var dog1= 8.0;
        dog1=dog1-3.5;
        cat=cat-1.6;
        paper=paper-7639;
        System.out.println(dog1);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задание №4");

        var friend = 19;
        System.out.println(friend);
        friend=friend*2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);

        System.out.println("Задание №5");
        var frog= 3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);

        System.out.println("Задание №6");
        var boxMen1= 78.2;
        var boxMen2= 82.7;
        var totalWeight=boxMen1+boxMen2;
        System.out.println("Общий вес боксеров " +totalWeight+" кг");
        var diffWeight=boxMen2-boxMen1;
        System.out.println("Разница в весе " +diffWeight+" кг");

        System.out.println("Задание №7");

        var diffWeight1=boxMen2-boxMen1;
        System.out.println("Разница в весе, способ №1 " +diffWeight1+" кг");
        var diffWeight2=boxMen2 % boxMen1;
        System.out.println("Разница в весе, способ №2 " +diffWeight2+" кг");

        System.out.println("Задание №8");
        var totalHours= 640;
        var dayHours= 8;
        var employees=totalHours/dayHours;


        System.out.println("Всего работников в компании – " +employees+" человек");
        employees=employees+94;
        totalHours=employees*dayHours;
        System.out.println("Если в компании работает " +employees+" человек, то всего "+totalHours+" часов работы может быть поделено между сотрудниками");


    }
}