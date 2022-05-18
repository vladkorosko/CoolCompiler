class B {
    s : Int <- 10;
    g (y:String) : Int {
        y.concat(s)
    };
    f (x:Int) : Int {
        x+1
    };
};

class A inherits B {
    a : Int;
    b : B <- new B;
    f(x:Int) : Int {
        x+a
    };
};

class Main {
    x : Bool;
    y : String;
    z : Int;

    main() : Object {
        x <- False;
        if (x = False)
            then y <- "Hello world!";
            else z <- x;
            fI;
    };
};
--Cool comment--