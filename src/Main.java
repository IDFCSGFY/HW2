public class Main {
    public static void main(String[] args) {
        //1
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper= 763789;
        System.out.println(paper);

        //2
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        //3
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        //4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //6
        var boxerMass1 = 78.2;
        var boxerMass2 = 82.7;
        System.out.println(boxerMass1+boxerMass2);
        System.out.println(boxerMass2-boxerMass1);

        //7
        System.out.println(boxerMass2%boxerMass1);

        //8
        var employees = 640/8;
        System.out.println("Всего работников в компании — " + employees + " человек");
        System.out.println("Если в компании работает " + (employees+94) + " человек, то всего " + (94*8 + 640) + " часов работы может быть поделено между сотрудниками");
    }
}