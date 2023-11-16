public class Main {
    public static void main(String[] args)
    {
        System.out.println("1 задание");
        System.out.println();

        var dog = 8.0;
        var cat = 3.6;
        var papper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(papper);
        System.out.println("-----");

        System.out.println("2 задание");
        System.out.println();

        dog = dog + 4;
        cat = cat + 4;
        papper = papper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(papper);
        System.out.println("-----");

        System.out.println("3 задание");
        System.out.println();

        dog = dog - 3.5;
        cat = cat - 1.6;
        papper = papper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(papper);
        System.out.println("-----");

        System.out.println("4 задание");
        System.out.println();

        var friend = 19;
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println("-----");

        System.out.println("5 задание");
        System.out.println();
        var frog = 3.5;
        System.out.println(frog);
        frog = frog + 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("6 задание");
        System.out.println();
        var weightFirstAthlete = 78.2;
        var weightSecondAthlete = 82.7;
        var totalWeightAthlete = weightFirstAthlete + weightSecondAthlete;
        var differenceTwoAthletes = weightFirstAthlete - weightSecondAthlete;
        System.out.println("Общая масса 2 спортменов "  + totalWeightAthlete);
        System.out.println("Разница между 2 спортменами  " + differenceTwoAthletes);

        var differenceTwoAthletesTwoWay = weightSecondAthlete - weightFirstAthlete;
        var differenceTwoAthletesThirdWay = weightSecondAthlete % weightFirstAthlete;
        System.out.println("Вычитание из большой массы в меньшую " + differenceTwoAthletesTwoWay);
        System.out.println("С помощью фукции остатка от деления " + differenceTwoAthletesThirdWay);
        System.out.println("-----");

        System.out.println("6 задание");
        System.out.println();

        var totalHours = 640;
        var peopleWorkingDay = 8;
        var totalPersonWorks = totalHours / peopleWorkingDay;
        System.out.println("Всего работников в компании " + totalPersonWorks + "человек");
        System.out.println("-----");

        var worksMore = 94;
        var totalPeople = totalPersonWorks + worksMore;
        var hoursCompany = totalHours / totalPeople ;
        System.out.println("Если в компании работает " + totalPeople + " человека,то всего " + hoursCompany +" часа работы может быть поделено между сотрудниками" );


    }
}