public class Main {


    public static void main(String[] args) {


        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);


        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);


        dog = dog -3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);


        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);


        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);


        var massBoxer1 = 78.2;
        var massBoxer2 = 82.7;
        var totalMass = massBoxer1 + massBoxer2;
        var massDifference = massBoxer1 - massBoxer2;
        System.out.println("Общая масса двух боксёров " + totalMass + " кг");
        System.out.println("Разница масс двух боксёров " + massDifference + " кг");
        var mod = massBoxer2 % massBoxer1;
        System.out.println(mod);


        var totalTime = 640;
        var workday = 8;
        var staff = totalTime / workday;
        System.out.println("Всего работников в компании - " + staff + " человек");
        staff = staff + 94;
        workday = totalTime / staff;
        System.out.println("Если в компании будет работать " + staff + " человек, то всего " + workday + " часов работы может быть поделено между сотрудниками");






















    }
}